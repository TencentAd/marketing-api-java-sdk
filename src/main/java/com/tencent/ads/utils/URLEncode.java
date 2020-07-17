package com.tencent.ads.utils;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.List;

public class URLEncode {
  private static final char QP_SEP_A = '&';
  private static final char QP_SEP_S = ';';
  private static final String NAME_VALUE_SEPARATOR = "=";
  private static final char PATH_SEPARATOR = '/';
  private static final BitSet URLENCODER = new BitSet(256);
  private static final BitSet PATH_SEPARATORS = new BitSet(256);
  private static final int RADIX = 16;
  private static final BitSet UNRESERVED = new BitSet(256);
  private static final BitSet PUNCT = new BitSet(256);
  private static final BitSet USERINFO = new BitSet(256);
  private static final BitSet PATHSAFE = new BitSet(256);
  private static final BitSet URIC = new BitSet(256);
  private static final BitSet RESERVED = new BitSet(256);
  private static final BitSet PATH_SPECIAL = new BitSet(256);

  static {
    PATH_SEPARATORS.set(PATH_SEPARATOR);
  }


  public static String format(List<? extends NameValuePair> parameters, Charset charset) {
    final StringBuilder buf = new StringBuilder();

    int i = 0;
    for (final NameValuePair parameter : parameters) {
      if (i > 0) {
        buf.append(QP_SEP_A);
      }
      encodeFormFields(buf, parameter.getName(), charset);
      if (parameter.getValue() != null) {
        buf.append(NAME_VALUE_SEPARATOR);
        encodeFormFields(buf, parameter.getValue(), charset);
      }
      i++;
    }

    return buf.toString();
  }

  static void encodeFormFields(final StringBuilder buf, final String content, final Charset charset) {
    if (content == null) {
      return;
    }
    urlEncode(buf, content, charset != null ? charset : StandardCharsets.UTF_8, URLENCODER, true);
  }

  private static void urlEncode(
      final StringBuilder buf,
      final String content,
      final Charset charset,
      final BitSet safechars,
      final boolean blankAsPlus) {
    if (content == null) {
      return;
    }
    final ByteBuffer bb = charset.encode(content);
    while (bb.hasRemaining()) {
      final int b = bb.get() & 0xff;
      if (safechars.get(b)) {
        buf.append((char) b);
      } else if (blankAsPlus && b == ' ') {
        buf.append('+');
      } else {
        buf.append("%");
        final char hex1 = Character.toUpperCase(Character.forDigit((b >> 4) & 0xF, RADIX));
        final char hex2 = Character.toUpperCase(Character.forDigit(b & 0xF, RADIX));
        buf.append(hex1);
        buf.append(hex2);
      }
    }
  }

  static {
    // unreserved chars
    // alpha characters
    for (int i = 'a'; i <= 'z'; i++) {
      UNRESERVED.set(i);
    }
    for (int i = 'A'; i <= 'Z'; i++) {
      UNRESERVED.set(i);
    }
    // numeric characters
    for (int i = '0'; i <= '9'; i++) {
      UNRESERVED.set(i);
    }
    UNRESERVED.set('_'); // these are the charactes of the "mark" list
    UNRESERVED.set('-');
    UNRESERVED.set('.');
    UNRESERVED.set('*');
    URLENCODER.or(UNRESERVED); // skip remaining unreserved characters
    UNRESERVED.set('!');
    UNRESERVED.set('~');
    UNRESERVED.set('\'');
    UNRESERVED.set('(');
    UNRESERVED.set(')');
    // punct chars
    PUNCT.set(',');
    PUNCT.set(';');
    PUNCT.set(':');
    PUNCT.set('$');
    PUNCT.set('&');
    PUNCT.set('+');
    PUNCT.set('=');
    // Safe for userinfo
    USERINFO.or(UNRESERVED);
    USERINFO.or(PUNCT);

    // URL path safe
    PATHSAFE.or(UNRESERVED);
    PATHSAFE.set(';'); // param separator
    PATHSAFE.set(':'); // RFC 2396
    PATHSAFE.set('@');
    PATHSAFE.set('&');
    PATHSAFE.set('=');
    PATHSAFE.set('+');
    PATHSAFE.set('$');
    PATHSAFE.set(',');

    PATH_SPECIAL.or(PATHSAFE);
    PATH_SPECIAL.set('/');

    RESERVED.set(';');
    RESERVED.set('/');
    RESERVED.set('?');
    RESERVED.set(':');
    RESERVED.set('@');
    RESERVED.set('&');
    RESERVED.set('=');
    RESERVED.set('+');
    RESERVED.set('$');
    RESERVED.set(',');
    RESERVED.set('['); // added by RFC 2732
    RESERVED.set(']'); // added by RFC 2732

    URIC.or(RESERVED);
    URIC.or(UNRESERVED);
  }

}
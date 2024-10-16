/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model.v3;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 商品校验结果 */
@ApiModel(description = "商品校验结果")
public class ProductVerificationResult {
  @SerializedName("product_verification_status")
  private ProductVerificationStatus productVerificationStatus = null;

  @SerializedName("product_verification_message")
  private String productVerificationMessage = null;

  public ProductVerificationResult productVerificationStatus(
      ProductVerificationStatus productVerificationStatus) {
    this.productVerificationStatus = productVerificationStatus;
    return this;
  }

  /**
   * Get productVerificationStatus
   *
   * @return productVerificationStatus
   */
  @ApiModelProperty(value = "")
  public ProductVerificationStatus getProductVerificationStatus() {
    return productVerificationStatus;
  }

  public void setProductVerificationStatus(ProductVerificationStatus productVerificationStatus) {
    this.productVerificationStatus = productVerificationStatus;
  }

  public ProductVerificationResult productVerificationMessage(String productVerificationMessage) {
    this.productVerificationMessage = productVerificationMessage;
    return this;
  }

  /**
   * Get productVerificationMessage
   *
   * @return productVerificationMessage
   */
  @ApiModelProperty(value = "")
  public String getProductVerificationMessage() {
    return productVerificationMessage;
  }

  public void setProductVerificationMessage(String productVerificationMessage) {
    this.productVerificationMessage = productVerificationMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVerificationResult productVerificationResult = (ProductVerificationResult) o;
    return Objects.equals(
            this.productVerificationStatus, productVerificationResult.productVerificationStatus)
        && Objects.equals(
            this.productVerificationMessage, productVerificationResult.productVerificationMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVerificationStatus, productVerificationMessage);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
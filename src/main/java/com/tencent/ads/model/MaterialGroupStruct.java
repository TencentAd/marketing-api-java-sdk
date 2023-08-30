/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 素材信息 */
@ApiModel(description = "素材信息")
public class MaterialGroupStruct {
  @SerializedName("material_group_id")
  private Long materialGroupId = null;

  @SerializedName("ratio")
  private String ratio = null;

  @SerializedName("material_type")
  private TemplateType materialType = null;

  @SerializedName("materials")
  private List<MaterialStruct> materials = null;

  @SerializedName("original_creative_templates")
  private List<DimensionStruct> originalCreativeTemplates = null;

  @SerializedName("target_creative_templates")
  private List<DimensionStruct> targetCreativeTemplates = null;

  @SerializedName("previews")
  private List<PreviewStruct> previews = null;

  @SerializedName("recommend_templates")
  private List<RecommendTemplateStruct> recommendTemplates = null;

  public MaterialGroupStruct materialGroupId(Long materialGroupId) {
    this.materialGroupId = materialGroupId;
    return this;
  }

  /**
   * Get materialGroupId
   *
   * @return materialGroupId
   */
  @ApiModelProperty(value = "")
  public Long getMaterialGroupId() {
    return materialGroupId;
  }

  public void setMaterialGroupId(Long materialGroupId) {
    this.materialGroupId = materialGroupId;
  }

  public MaterialGroupStruct ratio(String ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   *
   * @return ratio
   */
  @ApiModelProperty(value = "")
  public String getRatio() {
    return ratio;
  }

  public void setRatio(String ratio) {
    this.ratio = ratio;
  }

  public MaterialGroupStruct materialType(TemplateType materialType) {
    this.materialType = materialType;
    return this;
  }

  /**
   * Get materialType
   *
   * @return materialType
   */
  @ApiModelProperty(value = "")
  public TemplateType getMaterialType() {
    return materialType;
  }

  public void setMaterialType(TemplateType materialType) {
    this.materialType = materialType;
  }

  public MaterialGroupStruct materials(List<MaterialStruct> materials) {
    this.materials = materials;
    return this;
  }

  public MaterialGroupStruct addMaterialsItem(MaterialStruct materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<MaterialStruct>();
    }
    this.materials.add(materialsItem);
    return this;
  }

  /**
   * Get materials
   *
   * @return materials
   */
  @ApiModelProperty(value = "")
  public List<MaterialStruct> getMaterials() {
    return materials;
  }

  public void setMaterials(List<MaterialStruct> materials) {
    this.materials = materials;
  }

  public MaterialGroupStruct originalCreativeTemplates(
      List<DimensionStruct> originalCreativeTemplates) {
    this.originalCreativeTemplates = originalCreativeTemplates;
    return this;
  }

  public MaterialGroupStruct addOriginalCreativeTemplatesItem(
      DimensionStruct originalCreativeTemplatesItem) {
    if (this.originalCreativeTemplates == null) {
      this.originalCreativeTemplates = new ArrayList<DimensionStruct>();
    }
    this.originalCreativeTemplates.add(originalCreativeTemplatesItem);
    return this;
  }

  /**
   * Get originalCreativeTemplates
   *
   * @return originalCreativeTemplates
   */
  @ApiModelProperty(value = "")
  public List<DimensionStruct> getOriginalCreativeTemplates() {
    return originalCreativeTemplates;
  }

  public void setOriginalCreativeTemplates(List<DimensionStruct> originalCreativeTemplates) {
    this.originalCreativeTemplates = originalCreativeTemplates;
  }

  public MaterialGroupStruct targetCreativeTemplates(
      List<DimensionStruct> targetCreativeTemplates) {
    this.targetCreativeTemplates = targetCreativeTemplates;
    return this;
  }

  public MaterialGroupStruct addTargetCreativeTemplatesItem(
      DimensionStruct targetCreativeTemplatesItem) {
    if (this.targetCreativeTemplates == null) {
      this.targetCreativeTemplates = new ArrayList<DimensionStruct>();
    }
    this.targetCreativeTemplates.add(targetCreativeTemplatesItem);
    return this;
  }

  /**
   * Get targetCreativeTemplates
   *
   * @return targetCreativeTemplates
   */
  @ApiModelProperty(value = "")
  public List<DimensionStruct> getTargetCreativeTemplates() {
    return targetCreativeTemplates;
  }

  public void setTargetCreativeTemplates(List<DimensionStruct> targetCreativeTemplates) {
    this.targetCreativeTemplates = targetCreativeTemplates;
  }

  public MaterialGroupStruct previews(List<PreviewStruct> previews) {
    this.previews = previews;
    return this;
  }

  public MaterialGroupStruct addPreviewsItem(PreviewStruct previewsItem) {
    if (this.previews == null) {
      this.previews = new ArrayList<PreviewStruct>();
    }
    this.previews.add(previewsItem);
    return this;
  }

  /**
   * Get previews
   *
   * @return previews
   */
  @ApiModelProperty(value = "")
  public List<PreviewStruct> getPreviews() {
    return previews;
  }

  public void setPreviews(List<PreviewStruct> previews) {
    this.previews = previews;
  }

  public MaterialGroupStruct recommendTemplates(List<RecommendTemplateStruct> recommendTemplates) {
    this.recommendTemplates = recommendTemplates;
    return this;
  }

  public MaterialGroupStruct addRecommendTemplatesItem(
      RecommendTemplateStruct recommendTemplatesItem) {
    if (this.recommendTemplates == null) {
      this.recommendTemplates = new ArrayList<RecommendTemplateStruct>();
    }
    this.recommendTemplates.add(recommendTemplatesItem);
    return this;
  }

  /**
   * Get recommendTemplates
   *
   * @return recommendTemplates
   */
  @ApiModelProperty(value = "")
  public List<RecommendTemplateStruct> getRecommendTemplates() {
    return recommendTemplates;
  }

  public void setRecommendTemplates(List<RecommendTemplateStruct> recommendTemplates) {
    this.recommendTemplates = recommendTemplates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialGroupStruct materialGroupStruct = (MaterialGroupStruct) o;
    return Objects.equals(this.materialGroupId, materialGroupStruct.materialGroupId)
        && Objects.equals(this.ratio, materialGroupStruct.ratio)
        && Objects.equals(this.materialType, materialGroupStruct.materialType)
        && Objects.equals(this.materials, materialGroupStruct.materials)
        && Objects.equals(
            this.originalCreativeTemplates, materialGroupStruct.originalCreativeTemplates)
        && Objects.equals(this.targetCreativeTemplates, materialGroupStruct.targetCreativeTemplates)
        && Objects.equals(this.previews, materialGroupStruct.previews)
        && Objects.equals(this.recommendTemplates, materialGroupStruct.recommendTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        materialGroupId,
        ratio,
        materialType,
        materials,
        originalCreativeTemplates,
        targetCreativeTemplates,
        previews,
        recommendTemplates);
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

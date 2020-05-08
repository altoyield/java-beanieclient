/*
 * Beanie ERP API
 * An API specification for interacting with the Beanie ERP system
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@bean.ie
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Work Centre Details
 */
@ApiModel(description = "Work Centre Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T15:06:38.927Z")
public class WorkCentre {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("work_centre_group_id")
  private Long workCentreGroupId = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("state")
  private Long state = null;

  @SerializedName("production_order_id")
  private Long productionOrderId = null;

  public WorkCentre id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WorkCentre createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public WorkCentre updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public WorkCentre name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkCentre description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkCentre workCentreGroupId(Long workCentreGroupId) {
    this.workCentreGroupId = workCentreGroupId;
    return this;
  }

   /**
   * Get workCentreGroupId
   * @return workCentreGroupId
  **/
  @ApiModelProperty(value = "")
  public Long getWorkCentreGroupId() {
    return workCentreGroupId;
  }

  public void setWorkCentreGroupId(Long workCentreGroupId) {
    this.workCentreGroupId = workCentreGroupId;
  }

  public WorkCentre location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public WorkCentre state(Long state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }

  public WorkCentre productionOrderId(Long productionOrderId) {
    this.productionOrderId = productionOrderId;
    return this;
  }

   /**
   * Get productionOrderId
   * @return productionOrderId
  **/
  @ApiModelProperty(value = "")
  public Long getProductionOrderId() {
    return productionOrderId;
  }

  public void setProductionOrderId(Long productionOrderId) {
    this.productionOrderId = productionOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkCentre workCentre = (WorkCentre) o;
    return Objects.equals(this.id, workCentre.id) &&
        Objects.equals(this.createdAt, workCentre.createdAt) &&
        Objects.equals(this.updatedAt, workCentre.updatedAt) &&
        Objects.equals(this.name, workCentre.name) &&
        Objects.equals(this.description, workCentre.description) &&
        Objects.equals(this.workCentreGroupId, workCentre.workCentreGroupId) &&
        Objects.equals(this.location, workCentre.location) &&
        Objects.equals(this.state, workCentre.state) &&
        Objects.equals(this.productionOrderId, workCentre.productionOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, name, description, workCentreGroupId, location, state, productionOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkCentre {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    workCentreGroupId: ").append(toIndentedString(workCentreGroupId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    productionOrderId: ").append(toIndentedString(productionOrderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


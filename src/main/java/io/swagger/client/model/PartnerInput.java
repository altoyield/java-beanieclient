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

/**
 * Partner Details
 */
@ApiModel(description = "Partner Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T15:06:38.927Z")
public class PartnerInput {
  @SerializedName("name")
  private String name = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("net_terms")
  private Integer netTerms = null;

  @SerializedName("credit_limit")
  private Double creditLimit = null;

  @SerializedName("partner_vat")
  private String partnerVat = null;

  public PartnerInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartnerInput currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PartnerInput netTerms(Integer netTerms) {
    this.netTerms = netTerms;
    return this;
  }

   /**
   * Get netTerms
   * @return netTerms
  **/
  @ApiModelProperty(value = "")
  public Integer getNetTerms() {
    return netTerms;
  }

  public void setNetTerms(Integer netTerms) {
    this.netTerms = netTerms;
  }

  public PartnerInput creditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")
  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public PartnerInput partnerVat(String partnerVat) {
    this.partnerVat = partnerVat;
    return this;
  }

   /**
   * Get partnerVat
   * @return partnerVat
  **/
  @ApiModelProperty(value = "")
  public String getPartnerVat() {
    return partnerVat;
  }

  public void setPartnerVat(String partnerVat) {
    this.partnerVat = partnerVat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerInput partnerInput = (PartnerInput) o;
    return Objects.equals(this.name, partnerInput.name) &&
        Objects.equals(this.currencyCode, partnerInput.currencyCode) &&
        Objects.equals(this.netTerms, partnerInput.netTerms) &&
        Objects.equals(this.creditLimit, partnerInput.creditLimit) &&
        Objects.equals(this.partnerVat, partnerInput.partnerVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currencyCode, netTerms, creditLimit, partnerVat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    netTerms: ").append(toIndentedString(netTerms)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    partnerVat: ").append(toIndentedString(partnerVat)).append("\n");
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


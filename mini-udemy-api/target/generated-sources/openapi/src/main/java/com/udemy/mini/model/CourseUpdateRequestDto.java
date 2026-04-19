package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CourseUpdateRequestDto
 */

@JsonTypeName("CourseUpdateRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T07:24:36.109244200+03:00[Europe/Sofia]")
public class CourseUpdateRequestDto {

  private String title;

  private String description;

  private BigDecimal priceAmount;

  private Long teacherId;

  public CourseUpdateRequestDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CourseUpdateRequestDto(String title) {
    this.title = title;
  }

  public CourseUpdateRequestDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CourseUpdateRequestDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CourseUpdateRequestDto priceAmount(BigDecimal priceAmount) {
    this.priceAmount = priceAmount;
    return this;
  }

  /**
   * Get priceAmount
   * minimum: 0
   * @return priceAmount
  */
  @Valid @DecimalMin("0") 
  @Schema(name = "priceAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceAmount")
  public BigDecimal getPriceAmount() {
    return priceAmount;
  }

  public void setPriceAmount(BigDecimal priceAmount) {
    this.priceAmount = priceAmount;
  }

  public CourseUpdateRequestDto teacherId(Long teacherId) {
    this.teacherId = teacherId;
    return this;
  }

  /**
   * ID of the teacher if you want to change it
   * @return teacherId
  */
  
  @Schema(name = "teacherId", description = "ID of the teacher if you want to change it", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teacherId")
  public Long getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Long teacherId) {
    this.teacherId = teacherId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseUpdateRequestDto courseUpdateRequest = (CourseUpdateRequestDto) o;
    return Objects.equals(this.title, courseUpdateRequest.title) &&
        Objects.equals(this.description, courseUpdateRequest.description) &&
        Objects.equals(this.priceAmount, courseUpdateRequest.priceAmount) &&
        Objects.equals(this.teacherId, courseUpdateRequest.teacherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, priceAmount, teacherId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseUpdateRequestDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priceAmount: ").append(toIndentedString(priceAmount)).append("\n");
    sb.append("    teacherId: ").append(toIndentedString(teacherId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


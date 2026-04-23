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
 * CourseCreateRequestDto
 */

@JsonTypeName("CourseCreateRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-23T19:19:30.819979600+03:00[Europe/Sofia]")
public class CourseCreateRequestDto {

  private String title;

  private String description;

  private BigDecimal priceAmount;

  private Long teacherId;

  public CourseCreateRequestDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CourseCreateRequestDto(String title, Long teacherId) {
    this.title = title;
    this.teacherId = teacherId;
  }

  public CourseCreateRequestDto title(String title) {
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

  public CourseCreateRequestDto description(String description) {
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

  public CourseCreateRequestDto priceAmount(BigDecimal priceAmount) {
    this.priceAmount = priceAmount;
    return this;
  }

  /**
   * Get priceAmount
   * @return priceAmount
  */
  @Valid 
  @Schema(name = "priceAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceAmount")
  public BigDecimal getPriceAmount() {
    return priceAmount;
  }

  public void setPriceAmount(BigDecimal priceAmount) {
    this.priceAmount = priceAmount;
  }

  public CourseCreateRequestDto teacherId(Long teacherId) {
    this.teacherId = teacherId;
    return this;
  }

  /**
   * Get teacherId
   * @return teacherId
  */
  @NotNull 
  @Schema(name = "teacherId", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CourseCreateRequestDto courseCreateRequest = (CourseCreateRequestDto) o;
    return Objects.equals(this.title, courseCreateRequest.title) &&
        Objects.equals(this.description, courseCreateRequest.description) &&
        Objects.equals(this.priceAmount, courseCreateRequest.priceAmount) &&
        Objects.equals(this.teacherId, courseCreateRequest.teacherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, priceAmount, teacherId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseCreateRequestDto {\n");
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


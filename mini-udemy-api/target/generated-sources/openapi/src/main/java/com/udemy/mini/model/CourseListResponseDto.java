package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.udemy.mini.model.CourseDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CourseListResponseDto
 */

@JsonTypeName("CourseListResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-23T19:19:30.819979600+03:00[Europe/Sofia]")
public class CourseListResponseDto {

  @Valid
  private List<@Valid CourseDto> data = new ArrayList<>();

  private Long totalElements;

  private Integer totalPages;

  private Integer currentPage;

  public CourseListResponseDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CourseListResponseDto(List<@Valid CourseDto> data, Long totalElements, Integer totalPages, Integer currentPage) {
    this.data = data;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
    this.currentPage = currentPage;
  }

  public CourseListResponseDto data(List<@Valid CourseDto> data) {
    this.data = data;
    return this;
  }

  public CourseListResponseDto addDataItem(CourseDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid CourseDto> getData() {
    return data;
  }

  public void setData(List<@Valid CourseDto> data) {
    this.data = data;
  }

  public CourseListResponseDto totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull 
  @Schema(name = "totalElements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public CourseListResponseDto totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull 
  @Schema(name = "totalPages", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public CourseListResponseDto currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Get currentPage
   * @return currentPage
  */
  @NotNull 
  @Schema(name = "currentPage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseListResponseDto courseListResponse = (CourseListResponseDto) o;
    return Objects.equals(this.data, courseListResponse.data) &&
        Objects.equals(this.totalElements, courseListResponse.totalElements) &&
        Objects.equals(this.totalPages, courseListResponse.totalPages) &&
        Objects.equals(this.currentPage, courseListResponse.currentPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalElements, totalPages, currentPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseListResponseDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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


package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.udemy.mini.model.TeacherDto;
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
 * TeacherListResponseDto
 */

@JsonTypeName("TeacherListResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T07:24:36.109244200+03:00[Europe/Sofia]")
public class TeacherListResponseDto {

  @Valid
  private List<@Valid TeacherDto> data = new ArrayList<>();

  public TeacherListResponseDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TeacherListResponseDto(List<@Valid TeacherDto> data) {
    this.data = data;
  }

  public TeacherListResponseDto data(List<@Valid TeacherDto> data) {
    this.data = data;
    return this;
  }

  public TeacherListResponseDto addDataItem(TeacherDto dataItem) {
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
  public List<@Valid TeacherDto> getData() {
    return data;
  }

  public void setData(List<@Valid TeacherDto> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeacherListResponseDto teacherListResponse = (TeacherListResponseDto) o;
    return Objects.equals(this.data, teacherListResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeacherListResponseDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


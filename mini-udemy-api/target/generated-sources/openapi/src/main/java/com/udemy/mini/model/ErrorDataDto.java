package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ErrorDataDto
 */

@JsonTypeName("ErrorData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-16T16:15:57.078087800+03:00[Europe/Sofia]")
public class ErrorDataDto {

  private String type;

  private String title;

  private Integer status;

  private String detail;

  public ErrorDataDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorDataDto(String type, String title, Integer status, String detail) {
    this.type = type;
    this.title = title;
    this.status = status;
    this.detail = detail;
  }

  public ErrorDataDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A URI reference that identifies the problem type.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "A URI reference that identifies the problem type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ErrorDataDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short, human-readable summary of the problem type.
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Short, human-readable summary of the problem type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ErrorDataDto status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "HTTP status code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorDataDto detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Human-readable explanation specific to this occurrence.
   * @return detail
  */
  @NotNull 
  @Schema(name = "detail", description = "Human-readable explanation specific to this occurrence.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDataDto errorData = (ErrorDataDto) o;
    return Objects.equals(this.type, errorData.type) &&
        Objects.equals(this.title, errorData.title) &&
        Objects.equals(this.status, errorData.status) &&
        Objects.equals(this.detail, errorData.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDataDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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


package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.udemy.mini.model.ErrorDataDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RFC7807-compliant error wrapper.
 */

@Schema(name = "ErrorResponse", description = "RFC7807-compliant error wrapper.")
@JsonTypeName("ErrorResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-23T19:19:30.819979600+03:00[Europe/Sofia]")
public class ErrorResponseDto {

  private ErrorDataDto error;

  public ErrorResponseDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorResponseDto(ErrorDataDto error) {
    this.error = error;
  }

  public ErrorResponseDto error(ErrorDataDto error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @NotNull @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error")
  public ErrorDataDto getError() {
    return error;
  }

  public void setError(ErrorDataDto error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseDto errorResponse = (ErrorResponseDto) o;
    return Objects.equals(this.error, errorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseDto {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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


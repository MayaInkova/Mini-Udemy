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
 * TeacherUpdateRequestDto
 */

@JsonTypeName("TeacherUpdateRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T07:24:36.109244200+03:00[Europe/Sofia]")
public class TeacherUpdateRequestDto {

  private String fullName;

  private String email;

  private String bio;

  public TeacherUpdateRequestDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TeacherUpdateRequestDto(String fullName) {
    this.fullName = fullName;
  }

  public TeacherUpdateRequestDto fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  @NotNull @Size(min = 1, max = 255) 
  @Schema(name = "fullName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public TeacherUpdateRequestDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TeacherUpdateRequestDto bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Get bio
   * @return bio
  */
  
  @Schema(name = "bio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeacherUpdateRequestDto teacherUpdateRequest = (TeacherUpdateRequestDto) o;
    return Objects.equals(this.fullName, teacherUpdateRequest.fullName) &&
        Objects.equals(this.email, teacherUpdateRequest.email) &&
        Objects.equals(this.bio, teacherUpdateRequest.bio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, bio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeacherUpdateRequestDto {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
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


package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.udemy.mini.model.CourseDto;
import com.udemy.mini.model.StudentDto;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EnrollmentDto
 */

@JsonTypeName("Enrollment")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-08T00:12:04.302624200+03:00[Europe/Sofia]")
public class EnrollmentDto {

  private Long id;

  private StudentDto student;

  private CourseDto course;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime enrolledAt;

  public EnrollmentDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EnrollmentDto student(StudentDto student) {
    this.student = student;
    return this;
  }

  /**
   * Get student
   * @return student
  */
  @Valid 
  @Schema(name = "student", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("student")
  public StudentDto getStudent() {
    return student;
  }

  public void setStudent(StudentDto student) {
    this.student = student;
  }

  public EnrollmentDto course(CourseDto course) {
    this.course = course;
    return this;
  }

  /**
   * Get course
   * @return course
  */
  @Valid 
  @Schema(name = "course", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("course")
  public CourseDto getCourse() {
    return course;
  }

  public void setCourse(CourseDto course) {
    this.course = course;
  }

  public EnrollmentDto enrolledAt(OffsetDateTime enrolledAt) {
    this.enrolledAt = enrolledAt;
    return this;
  }

  /**
   * Get enrolledAt
   * @return enrolledAt
  */
  @Valid 
  @Schema(name = "enrolledAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enrolledAt")
  public OffsetDateTime getEnrolledAt() {
    return enrolledAt;
  }

  public void setEnrolledAt(OffsetDateTime enrolledAt) {
    this.enrolledAt = enrolledAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentDto enrollment = (EnrollmentDto) o;
    return Objects.equals(this.id, enrollment.id) &&
        Objects.equals(this.student, enrollment.student) &&
        Objects.equals(this.course, enrollment.course) &&
        Objects.equals(this.enrolledAt, enrollment.enrolledAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, student, course, enrolledAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    enrolledAt: ").append(toIndentedString(enrolledAt)).append("\n");
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


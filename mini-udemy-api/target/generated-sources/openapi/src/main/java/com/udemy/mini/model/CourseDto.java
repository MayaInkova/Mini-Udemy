package com.udemy.mini.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.udemy.mini.model.PriceDto;
import com.udemy.mini.model.TeacherDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CourseDto
 */

@JsonTypeName("Course")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-06T17:08:25.399883800+03:00[Europe/Sofia]")
public class CourseDto {

  private Long id;

  private String title;

  private String description;

  private PriceDto price;

  private TeacherDto teacher;

  public CourseDto id(Long id) {
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

  public CourseDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CourseDto description(String description) {
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

  public CourseDto price(PriceDto price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public PriceDto getPrice() {
    return price;
  }

  public void setPrice(PriceDto price) {
    this.price = price;
  }

  public CourseDto teacher(TeacherDto teacher) {
    this.teacher = teacher;
    return this;
  }

  /**
   * Get teacher
   * @return teacher
  */
  @Valid 
  @Schema(name = "teacher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teacher")
  public TeacherDto getTeacher() {
    return teacher;
  }

  public void setTeacher(TeacherDto teacher) {
    this.teacher = teacher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseDto course = (CourseDto) o;
    return Objects.equals(this.id, course.id) &&
        Objects.equals(this.title, course.title) &&
        Objects.equals(this.description, course.description) &&
        Objects.equals(this.price, course.price) &&
        Objects.equals(this.teacher, course.teacher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, price, teacher);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
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


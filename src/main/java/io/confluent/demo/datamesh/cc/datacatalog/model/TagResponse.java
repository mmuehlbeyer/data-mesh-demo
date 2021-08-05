/*
 * Confluent Data Catalog
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.confluent.demo.datamesh.cc.datacatalog.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.confluent.demo.datamesh.cc.datacatalog.model.ErrorMessage;
import io.confluent.demo.datamesh.cc.datacatalog.model.TimeBoundary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * TagResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-05T12:27:07.994303-05:00[America/Chicago]")
public class TagResponse {
  @SerializedName("typeName")
  private String typeName = null;

  @SerializedName("attributes")
  private Map<String, Object> attributes = null;

  @SerializedName("entityGuid")
  private String entityGuid = null;

  /**
   * Gets or Sets entityStatus
   */
  @JsonAdapter(EntityStatusEnum.Adapter.class)
  public enum EntityStatusEnum {
    ACTIVE("ACTIVE"),
    DELETED("DELETED"),
    PURGED("PURGED");

    private String value;

    EntityStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EntityStatusEnum fromValue(String text) {
      for (EntityStatusEnum b : EntityStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EntityStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EntityStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("entityStatus")
  private EntityStatusEnum entityStatus = null;

  @SerializedName("propagate")
  private Boolean propagate = null;

  @SerializedName("validityPeriods")
  private List<TimeBoundary> validityPeriods = null;

  @SerializedName("removePropagationsOnEntityDelete")
  private Boolean removePropagationsOnEntityDelete = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("error")
  private ErrorMessage error = null;

  public TagResponse typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @Schema(description = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public TagResponse attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TagResponse putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public TagResponse entityGuid(String entityGuid) {
    this.entityGuid = entityGuid;
    return this;
  }

   /**
   * Get entityGuid
   * @return entityGuid
  **/
  @Schema(description = "")
  public String getEntityGuid() {
    return entityGuid;
  }

  public void setEntityGuid(String entityGuid) {
    this.entityGuid = entityGuid;
  }

  public TagResponse entityStatus(EntityStatusEnum entityStatus) {
    this.entityStatus = entityStatus;
    return this;
  }

   /**
   * Get entityStatus
   * @return entityStatus
  **/
  @Schema(description = "")
  public EntityStatusEnum getEntityStatus() {
    return entityStatus;
  }

  public void setEntityStatus(EntityStatusEnum entityStatus) {
    this.entityStatus = entityStatus;
  }

  public TagResponse propagate(Boolean propagate) {
    this.propagate = propagate;
    return this;
  }

   /**
   * Get propagate
   * @return propagate
  **/
  @Schema(description = "")
  public Boolean isPropagate() {
    return propagate;
  }

  public void setPropagate(Boolean propagate) {
    this.propagate = propagate;
  }

  public TagResponse validityPeriods(List<TimeBoundary> validityPeriods) {
    this.validityPeriods = validityPeriods;
    return this;
  }

  public TagResponse addValidityPeriodsItem(TimeBoundary validityPeriodsItem) {
    if (this.validityPeriods == null) {
      this.validityPeriods = new ArrayList<TimeBoundary>();
    }
    this.validityPeriods.add(validityPeriodsItem);
    return this;
  }

   /**
   * Get validityPeriods
   * @return validityPeriods
  **/
  @Schema(description = "")
  public List<TimeBoundary> getValidityPeriods() {
    return validityPeriods;
  }

  public void setValidityPeriods(List<TimeBoundary> validityPeriods) {
    this.validityPeriods = validityPeriods;
  }

  public TagResponse removePropagationsOnEntityDelete(Boolean removePropagationsOnEntityDelete) {
    this.removePropagationsOnEntityDelete = removePropagationsOnEntityDelete;
    return this;
  }

   /**
   * Get removePropagationsOnEntityDelete
   * @return removePropagationsOnEntityDelete
  **/
  @Schema(description = "")
  public Boolean isRemovePropagationsOnEntityDelete() {
    return removePropagationsOnEntityDelete;
  }

  public void setRemovePropagationsOnEntityDelete(Boolean removePropagationsOnEntityDelete) {
    this.removePropagationsOnEntityDelete = removePropagationsOnEntityDelete;
  }

  public TagResponse entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @Schema(description = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public TagResponse entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @Schema(description = "")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public TagResponse error(ErrorMessage error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public ErrorMessage getError() {
    return error;
  }

  public void setError(ErrorMessage error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResponse tagResponse = (TagResponse) o;
    return Objects.equals(this.typeName, tagResponse.typeName) &&
        Objects.equals(this.attributes, tagResponse.attributes) &&
        Objects.equals(this.entityGuid, tagResponse.entityGuid) &&
        Objects.equals(this.entityStatus, tagResponse.entityStatus) &&
        Objects.equals(this.propagate, tagResponse.propagate) &&
        Objects.equals(this.validityPeriods, tagResponse.validityPeriods) &&
        Objects.equals(this.removePropagationsOnEntityDelete, tagResponse.removePropagationsOnEntityDelete) &&
        Objects.equals(this.entityType, tagResponse.entityType) &&
        Objects.equals(this.entityName, tagResponse.entityName) &&
        Objects.equals(this.error, tagResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, attributes, entityGuid, entityStatus, propagate, validityPeriods, removePropagationsOnEntityDelete, entityType, entityName, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResponse {\n");
    
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    entityGuid: ").append(toIndentedString(entityGuid)).append("\n");
    sb.append("    entityStatus: ").append(toIndentedString(entityStatus)).append("\n");
    sb.append("    propagate: ").append(toIndentedString(propagate)).append("\n");
    sb.append("    validityPeriods: ").append(toIndentedString(validityPeriods)).append("\n");
    sb.append("    removePropagationsOnEntityDelete: ").append(toIndentedString(removePropagationsOnEntityDelete)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

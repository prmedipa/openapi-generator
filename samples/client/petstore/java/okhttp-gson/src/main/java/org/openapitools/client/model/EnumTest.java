/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.OuterEnum;
import org.openapitools.client.model.OuterEnumDefaultValue;
import org.openapitools.client.model.OuterEnumInteger;
import org.openapitools.client.model.OuterEnumIntegerDefaultValue;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * EnumTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class EnumTest {
  /**
   * Gets or Sets enumString
   */
  @JsonAdapter(EnumStringEnum.Adapter.class)
  public enum EnumStringEnum {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumStringEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumStringEnum fromValue(String value) {
      for (EnumStringEnum b : EnumStringEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumStringEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumStringEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumStringEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnumStringEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EnumStringEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENUM_STRING = "enum_string";
  @SerializedName(SERIALIZED_NAME_ENUM_STRING)
  private EnumStringEnum enumString;

  /**
   * Gets or Sets enumStringRequired
   */
  @JsonAdapter(EnumStringRequiredEnum.Adapter.class)
  public enum EnumStringRequiredEnum {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumStringRequiredEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumStringRequiredEnum fromValue(String value) {
      for (EnumStringRequiredEnum b : EnumStringRequiredEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumStringRequiredEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumStringRequiredEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumStringRequiredEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnumStringRequiredEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EnumStringRequiredEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENUM_STRING_REQUIRED = "enum_string_required";
  @SerializedName(SERIALIZED_NAME_ENUM_STRING_REQUIRED)
  private EnumStringRequiredEnum enumStringRequired;

  /**
   * Gets or Sets enumInteger
   */
  @JsonAdapter(EnumIntegerEnum.Adapter.class)
  public enum EnumIntegerEnum {
    NUMBER_1(1),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    EnumIntegerEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumIntegerEnum fromValue(Integer value) {
      for (EnumIntegerEnum b : EnumIntegerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumIntegerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumIntegerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumIntegerEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return EnumIntegerEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      EnumIntegerEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENUM_INTEGER = "enum_integer";
  @SerializedName(SERIALIZED_NAME_ENUM_INTEGER)
  private EnumIntegerEnum enumInteger;

  /**
   * Gets or Sets enumIntegerOnly
   */
  @JsonAdapter(EnumIntegerOnlyEnum.Adapter.class)
  public enum EnumIntegerOnlyEnum {
    NUMBER_2(2),
    
    NUMBER_MINUS_2(-2);

    private Integer value;

    EnumIntegerOnlyEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumIntegerOnlyEnum fromValue(Integer value) {
      for (EnumIntegerOnlyEnum b : EnumIntegerOnlyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumIntegerOnlyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumIntegerOnlyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumIntegerOnlyEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return EnumIntegerOnlyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      EnumIntegerOnlyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENUM_INTEGER_ONLY = "enum_integer_only";
  @SerializedName(SERIALIZED_NAME_ENUM_INTEGER_ONLY)
  private EnumIntegerOnlyEnum enumIntegerOnly;

  /**
   * Gets or Sets enumNumber
   */
  @JsonAdapter(EnumNumberEnum.Adapter.class)
  public enum EnumNumberEnum {
    NUMBER_1_DOT_1(1.1),
    
    NUMBER_MINUS_1_DOT_2(-1.2);

    private Double value;

    EnumNumberEnum(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumNumberEnum fromValue(Double value) {
      for (EnumNumberEnum b : EnumNumberEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumNumberEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumNumberEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumNumberEnum read(final JsonReader jsonReader) throws IOException {
        Double value =  jsonReader.nextDouble();
        return EnumNumberEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Double value = jsonElement.getAsDouble();
      EnumNumberEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENUM_NUMBER = "enum_number";
  @SerializedName(SERIALIZED_NAME_ENUM_NUMBER)
  private EnumNumberEnum enumNumber;

  public static final String SERIALIZED_NAME_OUTER_ENUM = "outerEnum";
  @SerializedName(SERIALIZED_NAME_OUTER_ENUM)
  private OuterEnum outerEnum;

  public static final String SERIALIZED_NAME_OUTER_ENUM_INTEGER = "outerEnumInteger";
  @SerializedName(SERIALIZED_NAME_OUTER_ENUM_INTEGER)
  private OuterEnumInteger outerEnumInteger;

  public static final String SERIALIZED_NAME_OUTER_ENUM_DEFAULT_VALUE = "outerEnumDefaultValue";
  @SerializedName(SERIALIZED_NAME_OUTER_ENUM_DEFAULT_VALUE)
  private OuterEnumDefaultValue outerEnumDefaultValue = OuterEnumDefaultValue.PLACED;

  public static final String SERIALIZED_NAME_OUTER_ENUM_INTEGER_DEFAULT_VALUE = "outerEnumIntegerDefaultValue";
  @SerializedName(SERIALIZED_NAME_OUTER_ENUM_INTEGER_DEFAULT_VALUE)
  private OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue = OuterEnumIntegerDefaultValue.NUMBER_0;

  public EnumTest() {
  }

  public EnumTest enumString(EnumStringEnum enumString) {
    this.enumString = enumString;
    return this;
  }

  /**
   * Get enumString
   * @return enumString
   */
  @javax.annotation.Nullable
  public EnumStringEnum getEnumString() {
    return enumString;
  }

  public void setEnumString(EnumStringEnum enumString) {
    this.enumString = enumString;
  }


  public EnumTest enumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
    return this;
  }

  /**
   * Get enumStringRequired
   * @return enumStringRequired
   */
  @javax.annotation.Nonnull
  public EnumStringRequiredEnum getEnumStringRequired() {
    return enumStringRequired;
  }

  public void setEnumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }


  public EnumTest enumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

  /**
   * Get enumInteger
   * @return enumInteger
   */
  @javax.annotation.Nullable
  public EnumIntegerEnum getEnumInteger() {
    return enumInteger;
  }

  public void setEnumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
  }


  public EnumTest enumIntegerOnly(EnumIntegerOnlyEnum enumIntegerOnly) {
    this.enumIntegerOnly = enumIntegerOnly;
    return this;
  }

  /**
   * Get enumIntegerOnly
   * @return enumIntegerOnly
   */
  @javax.annotation.Nullable
  public EnumIntegerOnlyEnum getEnumIntegerOnly() {
    return enumIntegerOnly;
  }

  public void setEnumIntegerOnly(EnumIntegerOnlyEnum enumIntegerOnly) {
    this.enumIntegerOnly = enumIntegerOnly;
  }


  public EnumTest enumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

  /**
   * Get enumNumber
   * @return enumNumber
   */
  @javax.annotation.Nullable
  public EnumNumberEnum getEnumNumber() {
    return enumNumber;
  }

  public void setEnumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
  }


  public EnumTest outerEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
    return this;
  }

  /**
   * Get outerEnum
   * @return outerEnum
   */
  @javax.annotation.Nullable
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }

  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }


  public EnumTest outerEnumInteger(OuterEnumInteger outerEnumInteger) {
    this.outerEnumInteger = outerEnumInteger;
    return this;
  }

  /**
   * Get outerEnumInteger
   * @return outerEnumInteger
   */
  @javax.annotation.Nullable
  public OuterEnumInteger getOuterEnumInteger() {
    return outerEnumInteger;
  }

  public void setOuterEnumInteger(OuterEnumInteger outerEnumInteger) {
    this.outerEnumInteger = outerEnumInteger;
  }


  public EnumTest outerEnumDefaultValue(OuterEnumDefaultValue outerEnumDefaultValue) {
    this.outerEnumDefaultValue = outerEnumDefaultValue;
    return this;
  }

  /**
   * Get outerEnumDefaultValue
   * @return outerEnumDefaultValue
   */
  @javax.annotation.Nullable
  public OuterEnumDefaultValue getOuterEnumDefaultValue() {
    return outerEnumDefaultValue;
  }

  public void setOuterEnumDefaultValue(OuterEnumDefaultValue outerEnumDefaultValue) {
    this.outerEnumDefaultValue = outerEnumDefaultValue;
  }


  public EnumTest outerEnumIntegerDefaultValue(OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue) {
    this.outerEnumIntegerDefaultValue = outerEnumIntegerDefaultValue;
    return this;
  }

  /**
   * Get outerEnumIntegerDefaultValue
   * @return outerEnumIntegerDefaultValue
   */
  @javax.annotation.Nullable
  public OuterEnumIntegerDefaultValue getOuterEnumIntegerDefaultValue() {
    return outerEnumIntegerDefaultValue;
  }

  public void setOuterEnumIntegerDefaultValue(OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue) {
    this.outerEnumIntegerDefaultValue = outerEnumIntegerDefaultValue;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EnumTest instance itself
   */
  public EnumTest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTest enumTest = (EnumTest) o;
    return Objects.equals(this.enumString, enumTest.enumString) &&
        Objects.equals(this.enumStringRequired, enumTest.enumStringRequired) &&
        Objects.equals(this.enumInteger, enumTest.enumInteger) &&
        Objects.equals(this.enumIntegerOnly, enumTest.enumIntegerOnly) &&
        Objects.equals(this.enumNumber, enumTest.enumNumber) &&
        Objects.equals(this.outerEnum, enumTest.outerEnum) &&
        Objects.equals(this.outerEnumInteger, enumTest.outerEnumInteger) &&
        Objects.equals(this.outerEnumDefaultValue, enumTest.outerEnumDefaultValue) &&
        Objects.equals(this.outerEnumIntegerDefaultValue, enumTest.outerEnumIntegerDefaultValue)&&
        Objects.equals(this.additionalProperties, enumTest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumStringRequired, enumInteger, enumIntegerOnly, enumNumber, outerEnum, outerEnumInteger, outerEnumDefaultValue, outerEnumIntegerDefaultValue, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTest {\n");
    sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
    sb.append("    enumStringRequired: ").append(toIndentedString(enumStringRequired)).append("\n");
    sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
    sb.append("    enumIntegerOnly: ").append(toIndentedString(enumIntegerOnly)).append("\n");
    sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
    sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
    sb.append("    outerEnumInteger: ").append(toIndentedString(outerEnumInteger)).append("\n");
    sb.append("    outerEnumDefaultValue: ").append(toIndentedString(outerEnumDefaultValue)).append("\n");
    sb.append("    outerEnumIntegerDefaultValue: ").append(toIndentedString(outerEnumIntegerDefaultValue)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("enum_string");
    openapiFields.add("enum_string_required");
    openapiFields.add("enum_integer");
    openapiFields.add("enum_integer_only");
    openapiFields.add("enum_number");
    openapiFields.add("outerEnum");
    openapiFields.add("outerEnumInteger");
    openapiFields.add("outerEnumDefaultValue");
    openapiFields.add("outerEnumIntegerDefaultValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enum_string_required");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnumTest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnumTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnumTest is not found in the empty JSON string", EnumTest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnumTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("enum_string") != null && !jsonObj.get("enum_string").isJsonNull()) && !jsonObj.get("enum_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enum_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enum_string").toString()));
      }
      // validate the optional field `enum_string`
      if (jsonObj.get("enum_string") != null && !jsonObj.get("enum_string").isJsonNull()) {
        EnumStringEnum.validateJsonElement(jsonObj.get("enum_string"));
      }
      if (!jsonObj.get("enum_string_required").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enum_string_required` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enum_string_required").toString()));
      }
      // validate the required field `enum_string_required`
      EnumStringRequiredEnum.validateJsonElement(jsonObj.get("enum_string_required"));
      // validate the optional field `enum_integer`
      if (jsonObj.get("enum_integer") != null && !jsonObj.get("enum_integer").isJsonNull()) {
        EnumIntegerEnum.validateJsonElement(jsonObj.get("enum_integer"));
      }
      // validate the optional field `enum_integer_only`
      if (jsonObj.get("enum_integer_only") != null && !jsonObj.get("enum_integer_only").isJsonNull()) {
        EnumIntegerOnlyEnum.validateJsonElement(jsonObj.get("enum_integer_only"));
      }
      // validate the optional field `enum_number`
      if (jsonObj.get("enum_number") != null && !jsonObj.get("enum_number").isJsonNull()) {
        EnumNumberEnum.validateJsonElement(jsonObj.get("enum_number"));
      }
      // validate the optional field `outerEnum`
      if (jsonObj.get("outerEnum") != null && !jsonObj.get("outerEnum").isJsonNull()) {
        OuterEnum.validateJsonElement(jsonObj.get("outerEnum"));
      }
      // validate the optional field `outerEnumInteger`
      if (jsonObj.get("outerEnumInteger") != null && !jsonObj.get("outerEnumInteger").isJsonNull()) {
        OuterEnumInteger.validateJsonElement(jsonObj.get("outerEnumInteger"));
      }
      // validate the optional field `outerEnumDefaultValue`
      if (jsonObj.get("outerEnumDefaultValue") != null && !jsonObj.get("outerEnumDefaultValue").isJsonNull()) {
        OuterEnumDefaultValue.validateJsonElement(jsonObj.get("outerEnumDefaultValue"));
      }
      // validate the optional field `outerEnumIntegerDefaultValue`
      if (jsonObj.get("outerEnumIntegerDefaultValue") != null && !jsonObj.get("outerEnumIntegerDefaultValue").isJsonNull()) {
        OuterEnumIntegerDefaultValue.validateJsonElement(jsonObj.get("outerEnumIntegerDefaultValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnumTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnumTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnumTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnumTest.class));

       return (TypeAdapter<T>) new TypeAdapter<EnumTest>() {
           @Override
           public void write(JsonWriter out, EnumTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EnumTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EnumTest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnumTest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnumTest
   * @throws IOException if the JSON string is invalid with respect to EnumTest
   */
  public static EnumTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnumTest.class);
  }

  /**
   * Convert an instance of EnumTest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


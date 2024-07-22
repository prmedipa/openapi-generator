/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Query
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Query {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  /**
   * Gets or Sets outcomes
   */
  @JsonAdapter(OutcomesEnum.Adapter.class)
  public enum OutcomesEnum {
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    SKIPPED("SKIPPED");

    private String value;

    OutcomesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutcomesEnum fromValue(String value) {
      for (OutcomesEnum b : OutcomesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutcomesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutcomesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutcomesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutcomesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private List<OutcomesEnum> outcomes = new ArrayList<>(Arrays.asList(OutcomesEnum.SUCCESS, OutcomesEnum.FAILURE));

  public Query() {
  }

  public Query id(Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * Query
   * @return id
   */
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Query outcomes(List<OutcomesEnum> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public Query addOutcomesItem(OutcomesEnum outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>(Arrays.asList(OutcomesEnum.SUCCESS, OutcomesEnum.FAILURE));
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   * @return outcomes
   */
  @javax.annotation.Nullable

  public List<OutcomesEnum> getOutcomes() {
    return outcomes;
  }


  public void setOutcomes(List<OutcomesEnum> outcomes) {
    this.outcomes = outcomes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.id, query.id) &&
        Objects.equals(this.outcomes, query.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
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


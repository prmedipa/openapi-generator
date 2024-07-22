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
import java.util.List;
import org.openapitools.client.model.Scalar;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Value extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Value.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Value.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Value' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Scalar> adapterScalar = gson.getDelegateAdapter(this, TypeToken.get(Scalar.class));

            final Type typeInstanceListScalar = new TypeToken<List<Scalar>>(){}.getType();
            final TypeAdapter<List<Scalar>> adapterListScalar = (TypeAdapter<List<Scalar>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListScalar));

            return (TypeAdapter<T>) new TypeAdapter<Value>() {
                @Override
                public void write(JsonWriter out, Value value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Scalar`
                    if (value.getActualInstance() instanceof Scalar) {
                        JsonElement element = adapterScalar.toJsonTree((Scalar)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `List<Scalar>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof Scalar) {
                            JsonArray array = adapterListScalar.toJsonTree((List<Scalar>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<Scalar>, Scalar");
                }

                @Override
                public Value read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Scalar
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Scalar.validateJsonElement(jsonElement);
                        actualAdapter = adapterScalar;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Scalar'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Scalar failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Scalar'", e);
                    }
                    // deserialize List<Scalar>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            Scalar.validateJsonElement(element);
                        }
                        actualAdapter = adapterListScalar;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<Scalar>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<Scalar> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<Scalar>'", e);
                    }

                    if (match == 1) {
                        Value ret = new Value();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Value: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Value() {
        super("oneOf", Boolean.FALSE);
    }

    public Value(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Scalar", Scalar.class);
        schemas.put("List<Scalar>", List.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Value.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<Scalar>, Scalar
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Scalar) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof Scalar) {
                super.setActualInstance(instance);
                return;
            }
        }

        throw new RuntimeException("Invalid instance type. Must be List<Scalar>, Scalar");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Scalar>, Scalar
     *
     * @return The actual instance (List<Scalar>, Scalar)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Scalar`. If the actual instance is not `Scalar`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Scalar`
     * @throws ClassCastException if the instance is not `Scalar`
     */
    public Scalar getScalar() throws ClassCastException {
        return (Scalar)super.getActualInstance();
    }
    /**
     * Get the actual instance of `List<Scalar>`. If the actual instance is not `List<Scalar>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Scalar>`
     * @throws ClassCastException if the instance is not `List<Scalar>`
     */
    public List<Scalar> getListScalar() throws ClassCastException {
        return (List<Scalar>)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Value
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Scalar
        try {
            Scalar.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Scalar failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with List<Scalar>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                Scalar.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<Scalar> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Value with oneOf schemas: List<Scalar>, Scalar. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Value given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Value
     * @throws IOException if the JSON string is invalid with respect to Value
     */
    public static Value fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Value.class);
    }

    /**
     * Convert an instance of Value to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


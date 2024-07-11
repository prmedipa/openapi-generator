/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// The value may be a shape or the &#39;null&#39; value. This is introduced in OAS schema &gt;&#x3D; 3.1.
    /// </summary>
    [JsonConverter(typeof(ShapeOrNullJsonConverter))]
    [DataContract(Name = "ShapeOrNull")]
    public partial class ShapeOrNull : AbstractOpenAPISchema, IEquatable<ShapeOrNull>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ShapeOrNull" /> class.
        /// </summary>
        public ShapeOrNull()
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ShapeOrNull" /> class
        /// with the <see cref="Triangle" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Triangle.</param>
        public ShapeOrNull(Triangle actualInstance)
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ShapeOrNull" /> class
        /// with the <see cref="Quadrilateral" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Quadrilateral.</param>
        public ShapeOrNull(Quadrilateral actualInstance)
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance;
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(Quadrilateral) || value is Quadrilateral)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(Triangle) || value is Triangle)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Quadrilateral, Triangle");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Triangle`. If the actual instance is not `Triangle`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Triangle</returns>
        public Triangle GetTriangle()
        {
            return (Triangle)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Quadrilateral`. If the actual instance is not `Quadrilateral`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Quadrilateral</returns>
        public Quadrilateral GetQuadrilateral()
        {
            return (Quadrilateral)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ShapeOrNull {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, ShapeOrNull.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of ShapeOrNull
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of ShapeOrNull</returns>
        public static ShapeOrNull FromJson(string jsonString)
        {
            ShapeOrNull newShapeOrNull = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newShapeOrNull;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Quadrilateral).GetProperty("AdditionalProperties") == null)
                {
                    newShapeOrNull = new ShapeOrNull(JsonConvert.DeserializeObject<Quadrilateral>(jsonString, ShapeOrNull.SerializerSettings));
                }
                else
                {
                    newShapeOrNull = new ShapeOrNull(JsonConvert.DeserializeObject<Quadrilateral>(jsonString, ShapeOrNull.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Quadrilateral");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Quadrilateral: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Triangle).GetProperty("AdditionalProperties") == null)
                {
                    newShapeOrNull = new ShapeOrNull(JsonConvert.DeserializeObject<Triangle>(jsonString, ShapeOrNull.SerializerSettings));
                }
                else
                {
                    newShapeOrNull = new ShapeOrNull(JsonConvert.DeserializeObject<Triangle>(jsonString, ShapeOrNull.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Triangle");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Triangle: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + String.Join(",", matchedTypes));
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newShapeOrNull;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ShapeOrNull);
        }

        /// <summary>
        /// Returns true if ShapeOrNull instances are equal
        /// </summary>
        /// <param name="input">Instance of ShapeOrNull to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ShapeOrNull input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }
    }

    /// <summary>
    /// Custom JSON converter for ShapeOrNull
    /// </summary>
    public class ShapeOrNullJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(ShapeOrNull).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            switch(reader.TokenType) 
            {
                case JsonToken.StartObject:
                    return ShapeOrNull.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return ShapeOrNull.FromJson(JArray.Load(reader).ToString(Formatting.None));
                default:
                    return null;
            }
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}

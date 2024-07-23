/*
Test

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the NestedObject2 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &NestedObject2{}

// NestedObject2 struct for NestedObject2
type NestedObject2 struct {
	// Specifies an action name to be used with the Android Intent class.
	Field2 string `json:"field2"`
}

type _NestedObject2 NestedObject2

// NewNestedObject2 instantiates a new NestedObject2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNestedObject2(field2 string) *NestedObject2 {
	this := NestedObject2{}
	this.Field2 = field2
	return &this
}

// NewNestedObject2WithDefaults instantiates a new NestedObject2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNestedObject2WithDefaults() *NestedObject2 {
	this := NestedObject2{}
	return &this
}

// GetField2 returns the Field2 field value
func (o *NestedObject2) GetField2() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Field2
}

// GetField2Ok returns a tuple with the Field2 field value
// and a boolean to check if the value has been set.
func (o *NestedObject2) GetField2Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Field2, true
}

// SetField2 sets field value
func (o *NestedObject2) SetField2(v string) {
	o.Field2 = v
}

func (o NestedObject2) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o NestedObject2) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["field2"] = o.Field2
	return toSerialize, nil
}

func (o *NestedObject2) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"field2",
	}

	allProperties := make(map[string]interface{})
	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties){
		if value, exists := allProperties[requiredProperty]; !exists || value == ""{
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}
	varNestedObject2 := _NestedObject2{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNestedObject2)

	if err != nil {
		return err
	}

	*o = NestedObject2(varNestedObject2)

	return err
}

type NullableNestedObject2 struct {
	value *NestedObject2
	isSet bool
}

func (v NullableNestedObject2) Get() *NestedObject2 {
	return v.value
}

func (v *NullableNestedObject2) Set(val *NestedObject2) {
	v.value = val
	v.isSet = true
}

func (v NullableNestedObject2) IsSet() bool {
	return v.isSet
}

func (v *NullableNestedObject2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNestedObject2(val *NestedObject2) *NullableNestedObject2 {
	return &NullableNestedObject2{value: val, isSet: true}
}

func (v NullableNestedObject2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNestedObject2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



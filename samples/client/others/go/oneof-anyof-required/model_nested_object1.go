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

// checks if the NestedObject1 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &NestedObject1{}

// NestedObject1 struct for NestedObject1
type NestedObject1 struct {
	// Specifies an action name to be used with the Android Intent class.
	Field1 string `json:"field1"`
}

type _NestedObject1 NestedObject1

// NewNestedObject1 instantiates a new NestedObject1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNestedObject1(field1 string) *NestedObject1 {
	this := NestedObject1{}
	this.Field1 = field1
	return &this
}

// NewNestedObject1WithDefaults instantiates a new NestedObject1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNestedObject1WithDefaults() *NestedObject1 {
	this := NestedObject1{}
	return &this
}

// GetField1 returns the Field1 field value
func (o *NestedObject1) GetField1() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Field1
}

// GetField1Ok returns a tuple with the Field1 field value
// and a boolean to check if the value has been set.
func (o *NestedObject1) GetField1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Field1, true
}

// SetField1 sets field value
func (o *NestedObject1) SetField1(v string) {
	o.Field1 = v
}


func (o NestedObject1) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o NestedObject1) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["field1"] = o.Field1
	return toSerialize, nil
}

func (o *NestedObject1) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"field1",
	}

	defaultValueFuncMap := map[string]func() interface{} {
	}

	allProperties := make(map[string]interface{})
	var defaultValueApplied bool
	err = json.Unmarshal(data, &allProperties)
	if err != nil {
		return err;
	}
	for _, requiredProperty := range(requiredProperties){
		if value, exists := allProperties[requiredProperty]; !exists || value == ""{
			if _, ok := defaultValueFuncMap[requiredProperty]; ok {
				allProperties[requiredProperty] = defaultValueFuncMap[requiredProperty]()
				defaultValueApplied = true
			}
		}
		if value, exists := allProperties[requiredProperty]; !exists || value == ""{
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}
	if defaultValueApplied{
		data, err = json.Marshal(allProperties)
		if err != nil{
			return err
		}
	}
	varNestedObject1 := _NestedObject1{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNestedObject1)

	if err != nil {
		return err
	}

	*o = NestedObject1(varNestedObject1)

	return err
}

type NullableNestedObject1 struct {
	value *NestedObject1
	isSet bool
}

func (v NullableNestedObject1) Get() *NestedObject1 {
	return v.value
}

func (v *NullableNestedObject1) Set(val *NestedObject1) {
	v.value = val
	v.isSet = true
}

func (v NullableNestedObject1) IsSet() bool {
	return v.isSet
}

func (v *NullableNestedObject1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNestedObject1(val *NestedObject1) *NullableNestedObject1 {
	return &NullableNestedObject1{value: val, isSet: true}
}

func (v NullableNestedObject1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNestedObject1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



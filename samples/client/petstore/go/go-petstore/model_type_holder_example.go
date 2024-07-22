/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the TypeHolderExample type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TypeHolderExample{}

// TypeHolderExample struct for TypeHolderExample
type TypeHolderExample struct {
	StringItem string `json:"string_item"`
	NumberItem float32 `json:"number_item"`
	FloatItem float32 `json:"float_item"`
	IntegerItem int32 `json:"integer_item"`
	BoolItem bool `json:"bool_item"`
	ArrayItem []int32 `json:"array_item"`
}

type _TypeHolderExample TypeHolderExample

// NewTypeHolderExample instantiates a new TypeHolderExample object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTypeHolderExample(stringItem string, numberItem float32, floatItem float32, integerItem int32, boolItem bool, arrayItem []int32) *TypeHolderExample {
	this := TypeHolderExample{}
	this.StringItem = stringItem
	this.NumberItem = numberItem
	this.FloatItem = floatItem
	this.IntegerItem = integerItem
	this.BoolItem = boolItem
	this.ArrayItem = arrayItem
	return &this
}

// NewTypeHolderExampleWithDefaults instantiates a new TypeHolderExample object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTypeHolderExampleWithDefaults() *TypeHolderExample {
	this := TypeHolderExample{}
	return &this
}

// GetStringItem returns the StringItem field value
func (o *TypeHolderExample) GetStringItem() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.StringItem
}

// GetStringItemOk returns a tuple with the StringItem field value
// and a boolean to check if the value has been set.
func (o *TypeHolderExample) GetStringItemOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.StringItem, true
}

// SetStringItem sets field value
func (o *TypeHolderExample) SetStringItem(v string) {
	o.StringItem = v
}

// GetNumberItem returns the NumberItem field value
func (o *TypeHolderExample) GetNumberItem() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.NumberItem
}

// GetNumberItemOk returns a tuple with the NumberItem field value
// and a boolean to check if the value has been set.
func (o *TypeHolderExample) GetNumberItemOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NumberItem, true
}

// SetNumberItem sets field value
func (o *TypeHolderExample) SetNumberItem(v float32) {
	o.NumberItem = v
}

// GetFloatItem returns the FloatItem field value
func (o *TypeHolderExample) GetFloatItem() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.FloatItem
}

// GetFloatItemOk returns a tuple with the FloatItem field value
// and a boolean to check if the value has been set.
func (o *TypeHolderExample) GetFloatItemOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.FloatItem, true
}

// SetFloatItem sets field value
func (o *TypeHolderExample) SetFloatItem(v float32) {
	o.FloatItem = v
}

// GetIntegerItem returns the IntegerItem field value
func (o *TypeHolderExample) GetIntegerItem() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.IntegerItem
}

// GetIntegerItemOk returns a tuple with the IntegerItem field value
// and a boolean to check if the value has been set.
func (o *TypeHolderExample) GetIntegerItemOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.IntegerItem, true
}

// SetIntegerItem sets field value
func (o *TypeHolderExample) SetIntegerItem(v int32) {
	o.IntegerItem = v
}

// GetBoolItem returns the BoolItem field value
func (o *TypeHolderExample) GetBoolItem() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.BoolItem
}

// GetBoolItemOk returns a tuple with the BoolItem field value
// and a boolean to check if the value has been set.
func (o *TypeHolderExample) GetBoolItemOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BoolItem, true
}

// SetBoolItem sets field value
func (o *TypeHolderExample) SetBoolItem(v bool) {
	o.BoolItem = v
}

// GetArrayItem returns the ArrayItem field value
func (o *TypeHolderExample) GetArrayItem() []int32 {
	if o == nil {
		var ret []int32
		return ret
	}

	return o.ArrayItem
}

// GetArrayItemOk returns a tuple with the ArrayItem field value
// and a boolean to check if the value has been set.
func (o *TypeHolderExample) GetArrayItemOk() ([]int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.ArrayItem, true
}

// SetArrayItem sets field value
func (o *TypeHolderExample) SetArrayItem(v []int32) {
	o.ArrayItem = v
}

func (o TypeHolderExample) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TypeHolderExample) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["string_item"] = o.StringItem
	toSerialize["number_item"] = o.NumberItem
	toSerialize["float_item"] = o.FloatItem
	toSerialize["integer_item"] = o.IntegerItem
	toSerialize["bool_item"] = o.BoolItem
	toSerialize["array_item"] = o.ArrayItem
	return toSerialize, nil
}

func (o *TypeHolderExample) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"string_item",
		"number_item",
		"float_item",
		"integer_item",
		"bool_item",
		"array_item",
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
	varTypeHolderExample := _TypeHolderExample{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varTypeHolderExample)

	if err != nil {
		return err
	}

	*o = TypeHolderExample(varTypeHolderExample)

	return err
}

type NullableTypeHolderExample struct {
	value *TypeHolderExample
	isSet bool
}

func (v NullableTypeHolderExample) Get() *TypeHolderExample {
	return v.value
}

func (v *NullableTypeHolderExample) Set(val *TypeHolderExample) {
	v.value = val
	v.isSet = true
}

func (v NullableTypeHolderExample) IsSet() bool {
	return v.isSet
}

func (v *NullableTypeHolderExample) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTypeHolderExample(val *TypeHolderExample) *NullableTypeHolderExample {
	return &NullableTypeHolderExample{value: val, isSet: true}
}

func (v NullableTypeHolderExample) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTypeHolderExample) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



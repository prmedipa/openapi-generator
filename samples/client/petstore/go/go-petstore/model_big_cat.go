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

// checks if the BigCat type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BigCat{}

// BigCat struct for BigCat
type BigCat struct {
	Cat
	Kind *string `json:"kind,omitempty"`
}

type _BigCat BigCat

// NewBigCat instantiates a new BigCat object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBigCat(className string) *BigCat {
	this := BigCat{}
	this.ClassName = className
	var color string = "red"
	this.Color = &color
	return &this
}

// NewBigCatWithDefaults instantiates a new BigCat object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBigCatWithDefaults() *BigCat {
	this := BigCat{}
	return &this
}

// GetKind returns the Kind field value if set, zero value otherwise.
func (o *BigCat) GetKind() string {
	if o == nil || IsNil(o.Kind) {
		var ret string
		return ret
	}
	return *o.Kind
}

// GetKindOk returns a tuple with the Kind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BigCat) GetKindOk() (*string, bool) {
	if o == nil || IsNil(o.Kind) {
		return nil, false
	}
	return o.Kind, true
}

// HasKind returns a boolean if a field has been set.
func (o *BigCat) HasKind() bool {
	if o != nil && !IsNil(o.Kind) {
		return true
	}

	return false
}

// SetKind gets a reference to the given string and assigns it to the Kind field.
func (o *BigCat) SetKind(v string) {
	o.Kind = &v
}

func (o BigCat) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BigCat) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	serializedCat, errCat := json.Marshal(o.Cat)
	if errCat != nil {
		return map[string]interface{}{}, errCat
	}
	errCat = json.Unmarshal([]byte(serializedCat), &toSerialize)
	if errCat != nil {
		return map[string]interface{}{}, errCat
	}
	if !IsNil(o.Kind) {
		toSerialize["kind"] = o.Kind
	}
	return toSerialize, nil
}

func (o *BigCat) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"className",
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
	varBigCat := _BigCat{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBigCat)

	if err != nil {
		return err
	}

	*o = BigCat(varBigCat)

	return err
}

type NullableBigCat struct {
	value *BigCat
	isSet bool
}

func (v NullableBigCat) Get() *BigCat {
	return v.value
}

func (v *NullableBigCat) Set(val *BigCat) {
	v.value = val
	v.isSet = true
}

func (v NullableBigCat) IsSet() bool {
	return v.isSet
}

func (v *NullableBigCat) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBigCat(val *BigCat) *NullableBigCat {
	return &NullableBigCat{value: val, isSet: true}
}

func (v NullableBigCat) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBigCat) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



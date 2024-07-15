/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"fmt"
)

// checks if the Zebra type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Zebra{}

// Zebra struct for Zebra
type Zebra struct {
	Type *string `json:"type,omitempty"`
	ClassName string `json:"className"`
	AdditionalProperties map[string]interface{}
}

type _Zebra Zebra

// NewZebra instantiates a new Zebra object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewZebra(className string) *Zebra {
	this := Zebra{}
	this.ClassName = className
	return &this
}

// NewZebraWithDefaults instantiates a new Zebra object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewZebraWithDefaults() *Zebra {
	this := Zebra{}
	return &this
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *Zebra) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Zebra) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *Zebra) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *Zebra) SetType(v string) {
	o.Type = &v
}

// GetClassName returns the ClassName field value
func (o *Zebra) GetClassName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value
// and a boolean to check if the value has been set.
func (o *Zebra) GetClassNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ClassName, true
}

// SetClassName sets field value
func (o *Zebra) SetClassName(v string) {
	o.ClassName = v
}


func (o Zebra) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Zebra) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	toSerialize["className"] = o.ClassName

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *Zebra) UnmarshalJSON(data []byte) (err error) {
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
	varZebra := _Zebra{}

	err = json.Unmarshal(data, &varZebra)

	if err != nil {
		return err
	}

	*o = Zebra(varZebra)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "type")
		delete(additionalProperties, "className")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableZebra struct {
	value *Zebra
	isSet bool
}

func (v NullableZebra) Get() *Zebra {
	return v.value
}

func (v *NullableZebra) Set(val *Zebra) {
	v.value = val
	v.isSet = true
}

func (v NullableZebra) IsSet() bool {
	return v.isSet
}

func (v *NullableZebra) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableZebra(val *Zebra) *NullableZebra {
	return &NullableZebra{value: val, isSet: true}
}

func (v NullableZebra) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableZebra) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



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

// checks if the BananaReq type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BananaReq{}

// BananaReq struct for BananaReq
type BananaReq struct {
	LengthCm float32 `json:"lengthCm"`
	Sweet *bool `json:"sweet,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _BananaReq BananaReq

// NewBananaReq instantiates a new BananaReq object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBananaReq(lengthCm float32) *BananaReq {
	this := BananaReq{}
	this.LengthCm = lengthCm
	return &this
}

// NewBananaReqWithDefaults instantiates a new BananaReq object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBananaReqWithDefaults() *BananaReq {
	this := BananaReq{}
	return &this
}

// GetLengthCm returns the LengthCm field value
func (o *BananaReq) GetLengthCm() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.LengthCm
}

// GetLengthCmOk returns a tuple with the LengthCm field value
// and a boolean to check if the value has been set.
func (o *BananaReq) GetLengthCmOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LengthCm, true
}

// SetLengthCm sets field value
func (o *BananaReq) SetLengthCm(v float32) {
	o.LengthCm = v
}

// GetSweet returns the Sweet field value if set, zero value otherwise.
func (o *BananaReq) GetSweet() bool {
	if o == nil || IsNil(o.Sweet) {
		var ret bool
		return ret
	}
	return *o.Sweet
}

// GetSweetOk returns a tuple with the Sweet field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BananaReq) GetSweetOk() (*bool, bool) {
	if o == nil || IsNil(o.Sweet) {
		return nil, false
	}
	return o.Sweet, true
}

// HasSweet returns a boolean if a field has been set.
func (o *BananaReq) HasSweet() bool {
	if o != nil && !IsNil(o.Sweet) {
		return true
	}

	return false
}

// SetSweet gets a reference to the given bool and assigns it to the Sweet field.
func (o *BananaReq) SetSweet(v bool) {
	o.Sweet = &v
}

func (o BananaReq) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BananaReq) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["lengthCm"] = o.LengthCm
	if !IsNil(o.Sweet) {
		toSerialize["sweet"] = o.Sweet
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *BananaReq) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"lengthCm",
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
	varBananaReq := _BananaReq{}

	err = json.Unmarshal(data, &varBananaReq)

	if err != nil {
		return err
	}

	*o = BananaReq(varBananaReq)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "lengthCm")
		delete(additionalProperties, "sweet")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableBananaReq struct {
	value *BananaReq
	isSet bool
}

func (v NullableBananaReq) Get() *BananaReq {
	return v.value
}

func (v *NullableBananaReq) Set(val *BananaReq) {
	v.value = val
	v.isSet = true
}

func (v NullableBananaReq) IsSet() bool {
	return v.isSet
}

func (v *NullableBananaReq) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBananaReq(val *BananaReq) *NullableBananaReq {
	return &NullableBananaReq{value: val, isSet: true}
}

func (v NullableBananaReq) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBananaReq) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



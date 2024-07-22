/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"time"
	"fmt"
)

// checks if the Foo type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Foo{}

// Foo struct for Foo
type Foo struct {
	Bar string `json:"bar"`
	Map *map[string][]time.Time `json:"map,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _Foo Foo

// NewFoo instantiates a new Foo object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFoo(bar string) *Foo {
	this := Foo{}
	this.Bar = bar
	return &this
}

// NewFooWithDefaults instantiates a new Foo object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFooWithDefaults() *Foo {
	this := Foo{}
	var bar string = "bar"
	this.Bar = bar
	return &this
}

// GetBar returns the Bar field value
func (o *Foo) GetBar() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Bar
}

// GetBarOk returns a tuple with the Bar field value
// and a boolean to check if the value has been set.
func (o *Foo) GetBarOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Bar, true
}

// SetBar sets field value
func (o *Foo) SetBar(v string) {
	o.Bar = v
}

// GetDefaultbar function assigns the default value &quot;bar&quot; to the Bar field
// of the Foo struct and returns the "bar".
func (o *Foo) GetDefaultbar() interface{}  { 
	o.Bar = "bar"
	return "bar"
}
// GetMap returns the Map field value if set, zero value otherwise.
func (o *Foo) GetMap() map[string][]time.Time {
	if o == nil || IsNil(o.Map) {
		var ret map[string][]time.Time
		return ret
	}
	return *o.Map
}

// GetMapOk returns a tuple with the Map field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Foo) GetMapOk() (*map[string][]time.Time, bool) {
	if o == nil || IsNil(o.Map) {
		return nil, false
	}
	return o.Map, true
}

// HasMap returns a boolean if a field has been set.
func (o *Foo) HasMap() bool {
	if o != nil && !IsNil(o.Map) {
		return true
	}

	return false
}

// SetMap gets a reference to the given map[string][]time.Time and assigns it to the Map field.
func (o *Foo) SetMap(v map[string][]time.Time) {
	o.Map = &v
}

func (o Foo) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Foo) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if _, exists := toSerialize["bar"]; !exists {
		toSerialize["bar"] = o.GetDefaultbar()
	}
	toSerialize["bar"] = o.Bar
	if !IsNil(o.Map) {
		toSerialize["map"] = o.Map
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *Foo) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"bar",
	}

	defaultValueFuncMap := map[string]func() interface{} {
		"bar": o.GetDefaultbar,
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
	varFoo := _Foo{}

	err = json.Unmarshal(data, &varFoo)

	if err != nil {
		return err
	}

	*o = Foo(varFoo)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "bar")
		delete(additionalProperties, "map")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableFoo struct {
	value *Foo
	isSet bool
}

func (v NullableFoo) Get() *Foo {
	return v.value
}

func (v *NullableFoo) Set(val *Foo) {
	v.value = val
	v.isSet = true
}

func (v NullableFoo) IsSet() bool {
	return v.isSet
}

func (v *NullableFoo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFoo(val *Foo) *NullableFoo {
	return &NullableFoo{value: val, isSet: true}
}

func (v NullableFoo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFoo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



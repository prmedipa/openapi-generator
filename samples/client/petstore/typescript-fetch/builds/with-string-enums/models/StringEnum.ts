/* tslint:disable */
/* eslint-disable */
/**
 * Enum test
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * 
 * @export
 * @enum {string}
 */
export enum StringEnum {
    One = 'one',
    Two = 'two',
    Three = 'three'
}


export function instanceOfStringEnum(value: any): boolean {
    for (const key in StringEnum) {
        if (Object.prototype.hasOwnProperty.call(StringEnum, key)) {
            if (StringEnum[key as keyof typeof StringEnum] === value) {
                return true;
            }
        }
    }
    return false;
}

export function StringEnumFromJSON(json: any): StringEnum {
    return StringEnumFromJSONTyped(json, false);
}

export function StringEnumFromJSONTyped(json: any, ignoreDiscriminator: boolean): StringEnum {
    return json as StringEnum;
}

export function StringEnumToJSON(value?: StringEnum | null): any {
    return value as any;
}


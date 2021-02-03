/*
 * Bewoning
 * API voor het zoeken en raadplegen van bewoningen en metagegevens over bewoning (verloop). Een bewoning is een adresseerbaar object (verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. Overleden personen maken onderdeel uit van een bewoning tot het moment van overlijden. Gegevens over de bewoners zijn actueel. 
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
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * De aanduiding die wordt gebruikt voor adressen die geen straatnaam en huisnummeraanduidingen hebben * &#x60;tegenover&#x60; - to * &#x60;bij&#x60; - by 
 */
@JsonAdapter(AanduidingBijHuisnummerEnum.Adapter.class)
public enum AanduidingBijHuisnummerEnum {
  
  TEGENOVER("tegenover"),
  
  BIJ("bij");

  private String value;

  AanduidingBijHuisnummerEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AanduidingBijHuisnummerEnum fromValue(String value) {
    for (AanduidingBijHuisnummerEnum b : AanduidingBijHuisnummerEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AanduidingBijHuisnummerEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AanduidingBijHuisnummerEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AanduidingBijHuisnummerEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AanduidingBijHuisnummerEnum.fromValue(value);
    }
  }
}


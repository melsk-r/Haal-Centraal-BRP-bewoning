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
 * De manier waarop de geslachtsnaam van persoon en partner van persoon moet worden verwerkt in de manier waarop persoon wil worden aangesproken * &#x60;eigen&#x60; - E - gebruik alleen de eigen naam * &#x60;eigen_partner&#x60; - N - gebruik de eigen naam voor de partnernaam * &#x60;partner&#x60; - P gebruik alleen de partnernaam * &#x60;partner_eigen&#x60; - V - gebruik de partnernaam voor de eigen naam.   De aanduiding naamgebruik is verwerkt in Aanhef, Aanschrijfwijze en gebruikInLopendeTekst.\&quot; 
 */
@JsonAdapter(NaamgebruikEnum.Adapter.class)
public enum NaamgebruikEnum {
  
  EIGEN("eigen"),
  
  EIGEN_PARTNER("eigen_partner"),
  
  PARTNER("partner"),
  
  PARTNER_EIGEN("partner_eigen");

  private String value;

  NaamgebruikEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NaamgebruikEnum fromValue(String value) {
    for (NaamgebruikEnum b : NaamgebruikEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NaamgebruikEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final NaamgebruikEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NaamgebruikEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NaamgebruikEnum.fromValue(value);
    }
  }
}


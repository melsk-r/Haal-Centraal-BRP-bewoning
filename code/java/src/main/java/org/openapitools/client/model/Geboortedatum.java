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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.DatumOnvolledig;

/**
 * Gegevens over de geboorte van respectievelijk de persoon, de ouder, de echtgenoot/geregistreerd partner, de eerdere echtgenoot/geregistreerd partner of het kind. * **datum** : Datum waarop de persoon is geboren * **land** : Land waar de persoon is geboren * **plaats** : De plaats waar de persoon is geboren. Voor een plaats buiten Nederland is gemeentecode&#x3D;1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding. 
 */
@ApiModel(description = "Gegevens over de geboorte van respectievelijk de persoon, de ouder, de echtgenoot/geregistreerd partner, de eerdere echtgenoot/geregistreerd partner of het kind. * **datum** : Datum waarop de persoon is geboren * **land** : Land waar de persoon is geboren * **plaats** : De plaats waar de persoon is geboren. Voor een plaats buiten Nederland is gemeentecode=1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T15:01:26.333Z[Etc/UTC]")
public class Geboortedatum {
  public static final String SERIALIZED_NAME_DATUM = "datum";
  @SerializedName(SERIALIZED_NAME_DATUM)
  private DatumOnvolledig datum;


  public Geboortedatum datum(DatumOnvolledig datum) {
    
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatum() {
    return datum;
  }


  public void setDatum(DatumOnvolledig datum) {
    this.datum = datum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Geboortedatum geboortedatum = (Geboortedatum) o;
    return Objects.equals(this.datum, geboortedatum.datum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geboortedatum {\n");
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


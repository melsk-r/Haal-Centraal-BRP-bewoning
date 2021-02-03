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
import org.openapitools.client.model.NaamInOnderzoek;
import org.openapitools.client.model.NaamPersoonInOnderzoekAllOf;

/**
 * NaamPersoonInOnderzoek
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T13:57:27.519Z[Etc/UTC]")
public class NaamPersoonInOnderzoek {
  public static final String SERIALIZED_NAME_GESLACHTSNAAM = "geslachtsnaam";
  @SerializedName(SERIALIZED_NAME_GESLACHTSNAAM)
  private Boolean geslachtsnaam;

  public static final String SERIALIZED_NAME_VOORNAMEN = "voornamen";
  @SerializedName(SERIALIZED_NAME_VOORNAMEN)
  private Boolean voornamen;

  public static final String SERIALIZED_NAME_VOORVOEGSEL = "voorvoegsel";
  @SerializedName(SERIALIZED_NAME_VOORVOEGSEL)
  private Boolean voorvoegsel;

  public static final String SERIALIZED_NAME_ADELLIJKE_TITEL_PREDIKAAT = "adellijkeTitelPredikaat";
  @SerializedName(SERIALIZED_NAME_ADELLIJKE_TITEL_PREDIKAAT)
  private Boolean adellijkeTitelPredikaat;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;

  public static final String SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK = "aanduidingNaamgebruik";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK)
  private Boolean aanduidingNaamgebruik;


  public NaamPersoonInOnderzoek geslachtsnaam(Boolean geslachtsnaam) {
    
    this.geslachtsnaam = geslachtsnaam;
    return this;
  }

   /**
   * Get geslachtsnaam
   * @return geslachtsnaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGeslachtsnaam() {
    return geslachtsnaam;
  }


  public void setGeslachtsnaam(Boolean geslachtsnaam) {
    this.geslachtsnaam = geslachtsnaam;
  }


  public NaamPersoonInOnderzoek voornamen(Boolean voornamen) {
    
    this.voornamen = voornamen;
    return this;
  }

   /**
   * Get voornamen
   * @return voornamen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVoornamen() {
    return voornamen;
  }


  public void setVoornamen(Boolean voornamen) {
    this.voornamen = voornamen;
  }


  public NaamPersoonInOnderzoek voorvoegsel(Boolean voorvoegsel) {
    
    this.voorvoegsel = voorvoegsel;
    return this;
  }

   /**
   * Get voorvoegsel
   * @return voorvoegsel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVoorvoegsel() {
    return voorvoegsel;
  }


  public void setVoorvoegsel(Boolean voorvoegsel) {
    this.voorvoegsel = voorvoegsel;
  }


  public NaamPersoonInOnderzoek adellijkeTitelPredikaat(Boolean adellijkeTitelPredikaat) {
    
    this.adellijkeTitelPredikaat = adellijkeTitelPredikaat;
    return this;
  }

   /**
   * Get adellijkeTitelPredikaat
   * @return adellijkeTitelPredikaat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAdellijkeTitelPredikaat() {
    return adellijkeTitelPredikaat;
  }


  public void setAdellijkeTitelPredikaat(Boolean adellijkeTitelPredikaat) {
    this.adellijkeTitelPredikaat = adellijkeTitelPredikaat;
  }


  public NaamPersoonInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  public NaamPersoonInOnderzoek aanduidingNaamgebruik(Boolean aanduidingNaamgebruik) {
    
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
    return this;
  }

   /**
   * Get aanduidingNaamgebruik
   * @return aanduidingNaamgebruik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAanduidingNaamgebruik() {
    return aanduidingNaamgebruik;
  }


  public void setAanduidingNaamgebruik(Boolean aanduidingNaamgebruik) {
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaamPersoonInOnderzoek naamPersoonInOnderzoek = (NaamPersoonInOnderzoek) o;
    return Objects.equals(this.geslachtsnaam, naamPersoonInOnderzoek.geslachtsnaam) &&
        Objects.equals(this.voornamen, naamPersoonInOnderzoek.voornamen) &&
        Objects.equals(this.voorvoegsel, naamPersoonInOnderzoek.voorvoegsel) &&
        Objects.equals(this.adellijkeTitelPredikaat, naamPersoonInOnderzoek.adellijkeTitelPredikaat) &&
        Objects.equals(this.datumIngangOnderzoek, naamPersoonInOnderzoek.datumIngangOnderzoek) &&
        Objects.equals(this.aanduidingNaamgebruik, naamPersoonInOnderzoek.aanduidingNaamgebruik);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geslachtsnaam, voornamen, voorvoegsel, adellijkeTitelPredikaat, datumIngangOnderzoek, aanduidingNaamgebruik);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaamPersoonInOnderzoek {\n");
    sb.append("    geslachtsnaam: ").append(toIndentedString(geslachtsnaam)).append("\n");
    sb.append("    voornamen: ").append(toIndentedString(voornamen)).append("\n");
    sb.append("    voorvoegsel: ").append(toIndentedString(voorvoegsel)).append("\n");
    sb.append("    adellijkeTitelPredikaat: ").append(toIndentedString(adellijkeTitelPredikaat)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
    sb.append("    aanduidingNaamgebruik: ").append(toIndentedString(aanduidingNaamgebruik)).append("\n");
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


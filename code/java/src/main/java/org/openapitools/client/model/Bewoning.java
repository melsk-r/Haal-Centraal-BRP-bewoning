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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AdresUitgebreid;
import org.openapitools.client.model.Bewoner;

/**
 * Een bewoning is een adresseerbaar object(verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. 
 */
@ApiModel(description = "Een bewoning is een adresseerbaar object(verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T15:01:26.333Z[Etc/UTC]")
public class Bewoning {
  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE = "adresseerbaarObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE)
  private String adresseerbaarObjectIdentificatie;

  public static final String SERIALIZED_NAME_BEWONERS = "bewoners";
  @SerializedName(SERIALIZED_NAME_BEWONERS)
  private List<Bewoner> bewoners = null;

  public static final String SERIALIZED_NAME_INDICATIE_VEEL_BEWONERS = "indicatieVeelBewoners";
  @SerializedName(SERIALIZED_NAME_INDICATIE_VEEL_BEWONERS)
  private Boolean indicatieVeelBewoners;

  public static final String SERIALIZED_NAME_ADRESSEN = "adressen";
  @SerializedName(SERIALIZED_NAME_ADRESSEN)
  private List<AdresUitgebreid> adressen = null;


  public Bewoning adresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
    return this;
  }

   /**
   * De unieke identificatie van een verblijfsobject, standplaats of ligplaats. 
   * @return adresseerbaarObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De unieke identificatie van een verblijfsobject, standplaats of ligplaats. ")

  public String getAdresseerbaarObjectIdentificatie() {
    return adresseerbaarObjectIdentificatie;
  }


  public void setAdresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
  }


  public Bewoning bewoners(List<Bewoner> bewoners) {
    
    this.bewoners = bewoners;
    return this;
  }

  public Bewoning addBewonersItem(Bewoner bewonersItem) {
    if (this.bewoners == null) {
      this.bewoners = new ArrayList<>();
    }
    this.bewoners.add(bewonersItem);
    return this;
  }

   /**
   * Get bewoners
   * @return bewoners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Bewoner> getBewoners() {
    return bewoners;
  }


  public void setBewoners(List<Bewoner> bewoners) {
    this.bewoners = bewoners;
  }


  public Bewoning indicatieVeelBewoners(Boolean indicatieVeelBewoners) {
    
    this.indicatieVeelBewoners = indicatieVeelBewoners;
    return this;
  }

   /**
   * Geeft aan dat het adresseerbaar object zo veel bewoners heeft of had in de gevraagde periode dat zij niet in het antwoord worden opgenomen, met uitzondering van de persoon waarvan de BSN is opgegeven. 
   * @return indicatieVeelBewoners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Geeft aan dat het adresseerbaar object zo veel bewoners heeft of had in de gevraagde periode dat zij niet in het antwoord worden opgenomen, met uitzondering van de persoon waarvan de BSN is opgegeven. ")

  public Boolean getIndicatieVeelBewoners() {
    return indicatieVeelBewoners;
  }


  public void setIndicatieVeelBewoners(Boolean indicatieVeelBewoners) {
    this.indicatieVeelBewoners = indicatieVeelBewoners;
  }


  public Bewoning adressen(List<AdresUitgebreid> adressen) {
    
    this.adressen = adressen;
    return this;
  }

  public Bewoning addAdressenItem(AdresUitgebreid adressenItem) {
    if (this.adressen == null) {
      this.adressen = new ArrayList<>();
    }
    this.adressen.add(adressenItem);
    return this;
  }

   /**
   * Get adressen
   * @return adressen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdresUitgebreid> getAdressen() {
    return adressen;
  }


  public void setAdressen(List<AdresUitgebreid> adressen) {
    this.adressen = adressen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bewoning bewoning = (Bewoning) o;
    return Objects.equals(this.adresseerbaarObjectIdentificatie, bewoning.adresseerbaarObjectIdentificatie) &&
        Objects.equals(this.bewoners, bewoning.bewoners) &&
        Objects.equals(this.indicatieVeelBewoners, bewoning.indicatieVeelBewoners) &&
        Objects.equals(this.adressen, bewoning.adressen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adresseerbaarObjectIdentificatie, bewoners, indicatieVeelBewoners, adressen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bewoning {\n");
    sb.append("    adresseerbaarObjectIdentificatie: ").append(toIndentedString(adresseerbaarObjectIdentificatie)).append("\n");
    sb.append("    bewoners: ").append(toIndentedString(bewoners)).append("\n");
    sb.append("    indicatieVeelBewoners: ").append(toIndentedString(indicatieVeelBewoners)).append("\n");
    sb.append("    adressen: ").append(toIndentedString(adressen)).append("\n");
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


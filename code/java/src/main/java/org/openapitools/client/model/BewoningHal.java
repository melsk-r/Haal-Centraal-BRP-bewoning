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
import org.openapitools.client.model.BewoningEmbedded;
import org.openapitools.client.model.BewoningHalAllOf;
import org.openapitools.client.model.BewoningHalBasis;
import org.openapitools.client.model.BewoningLinks;

/**
 * BewoningHal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T11:12:35.961Z[Etc/UTC]")
public class BewoningHal {
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

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private BewoningLinks links;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private BewoningEmbedded embedded;


  public BewoningHal adresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    
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


  public BewoningHal bewoners(List<Bewoner> bewoners) {
    
    this.bewoners = bewoners;
    return this;
  }

  public BewoningHal addBewonersItem(Bewoner bewonersItem) {
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


  public BewoningHal indicatieVeelBewoners(Boolean indicatieVeelBewoners) {
    
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


  public BewoningHal adressen(List<AdresUitgebreid> adressen) {
    
    this.adressen = adressen;
    return this;
  }

  public BewoningHal addAdressenItem(AdresUitgebreid adressenItem) {
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


  public BewoningHal links(BewoningLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BewoningLinks getLinks() {
    return links;
  }


  public void setLinks(BewoningLinks links) {
    this.links = links;
  }


  public BewoningHal embedded(BewoningEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BewoningEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(BewoningEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BewoningHal bewoningHal = (BewoningHal) o;
    return Objects.equals(this.adresseerbaarObjectIdentificatie, bewoningHal.adresseerbaarObjectIdentificatie) &&
        Objects.equals(this.bewoners, bewoningHal.bewoners) &&
        Objects.equals(this.indicatieVeelBewoners, bewoningHal.indicatieVeelBewoners) &&
        Objects.equals(this.adressen, bewoningHal.adressen) &&
        Objects.equals(this.links, bewoningHal.links) &&
        Objects.equals(this.embedded, bewoningHal.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adresseerbaarObjectIdentificatie, bewoners, indicatieVeelBewoners, adressen, links, embedded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BewoningHal {\n");
    sb.append("    adresseerbaarObjectIdentificatie: ").append(toIndentedString(adresseerbaarObjectIdentificatie)).append("\n");
    sb.append("    bewoners: ").append(toIndentedString(bewoners)).append("\n");
    sb.append("    indicatieVeelBewoners: ").append(toIndentedString(indicatieVeelBewoners)).append("\n");
    sb.append("    adressen: ").append(toIndentedString(adressen)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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


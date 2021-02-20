/*
 * Bewoning
 *
 * API voor het zoeken en raadplegen van bewoningen en metagegevens over bewoning (verloop). Een bewoning is een adresseerbaar object (verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. Overleden personen maken onderdeel uit van een bewoning tot het moment van overlijden. Gegevens over de bewoners zijn actueel. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Gegevens over het overlijden van de persoon. * **datum** : datum waarop de persoon is overleden. * **land** : land waar de persoon is overleden. * **plaats** : gemeente waar de persoon is overleden. Is de persoon overleden buiten Nederland, dan bevat het antwoord alleen een buitenlandse plaatsnaam of aanduiding. 
    /// </summary>
    [DataContract(Name = "Overlijden")]
    public partial class Overlijden : IEquatable<Overlijden>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Overlijden" /> class.
        /// </summary>
        /// <param name="indicatieOverleden">Geeft aan dat iemand is overleden (waarde true), ongeacht of de overlijdensdatum bekend is. .</param>
        /// <param name="datum">datum.</param>
        /// <param name="land">land.</param>
        /// <param name="plaats">plaats.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        public Overlijden(bool indicatieOverleden = default(bool), DatumOnvolledig datum = default(DatumOnvolledig), Waardetabel land = default(Waardetabel), Waardetabel plaats = default(Waardetabel), OverlijdenInOnderzoek inOnderzoek = default(OverlijdenInOnderzoek))
        {
            this.IndicatieOverleden = indicatieOverleden;
            this.Datum = datum;
            this.Land = land;
            this.Plaats = plaats;
            this.InOnderzoek = inOnderzoek;
        }

        /// <summary>
        /// Geeft aan dat iemand is overleden (waarde true), ongeacht of de overlijdensdatum bekend is. 
        /// </summary>
        /// <value>Geeft aan dat iemand is overleden (waarde true), ongeacht of de overlijdensdatum bekend is. </value>
        [DataMember(Name = "indicatieOverleden", EmitDefaultValue = false)]
        public bool IndicatieOverleden { get; set; }

        /// <summary>
        /// Gets or Sets Datum
        /// </summary>
        [DataMember(Name = "datum", EmitDefaultValue = false)]
        public DatumOnvolledig Datum { get; set; }

        /// <summary>
        /// Gets or Sets Land
        /// </summary>
        [DataMember(Name = "land", EmitDefaultValue = false)]
        public Waardetabel Land { get; set; }

        /// <summary>
        /// Gets or Sets Plaats
        /// </summary>
        [DataMember(Name = "plaats", EmitDefaultValue = false)]
        public Waardetabel Plaats { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name = "inOnderzoek", EmitDefaultValue = false)]
        public OverlijdenInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Overlijden {\n");
            sb.Append("  IndicatieOverleden: ").Append(IndicatieOverleden).Append("\n");
            sb.Append("  Datum: ").Append(Datum).Append("\n");
            sb.Append("  Land: ").Append(Land).Append("\n");
            sb.Append("  Plaats: ").Append(Plaats).Append("\n");
            sb.Append("  InOnderzoek: ").Append(InOnderzoek).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Overlijden);
        }

        /// <summary>
        /// Returns true if Overlijden instances are equal
        /// </summary>
        /// <param name="input">Instance of Overlijden to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Overlijden input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IndicatieOverleden == input.IndicatieOverleden ||
                    this.IndicatieOverleden.Equals(input.IndicatieOverleden)
                ) && 
                (
                    this.Datum == input.Datum ||
                    (this.Datum != null &&
                    this.Datum.Equals(input.Datum))
                ) && 
                (
                    this.Land == input.Land ||
                    (this.Land != null &&
                    this.Land.Equals(input.Land))
                ) && 
                (
                    this.Plaats == input.Plaats ||
                    (this.Plaats != null &&
                    this.Plaats.Equals(input.Plaats))
                ) && 
                (
                    this.InOnderzoek == input.InOnderzoek ||
                    (this.InOnderzoek != null &&
                    this.InOnderzoek.Equals(input.InOnderzoek))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = hashCode * 59 + this.IndicatieOverleden.GetHashCode();
                if (this.Datum != null)
                    hashCode = hashCode * 59 + this.Datum.GetHashCode();
                if (this.Land != null)
                    hashCode = hashCode * 59 + this.Land.GetHashCode();
                if (this.Plaats != null)
                    hashCode = hashCode * 59 + this.Plaats.GetHashCode();
                if (this.InOnderzoek != null)
                    hashCode = hashCode * 59 + this.InOnderzoek.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
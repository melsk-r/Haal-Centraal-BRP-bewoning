/* 
 * Bewoning
 *
 * API voor het zoeken en raadplegen van bewoningen en metagegevens over bewoning (verloop). Een bewoning is een adresseerbaar object (verblijfsobject, ligplaats of standplaats) met ingeschreven bewoner(s). Iedere samenstelling van bewoners van het object is een bewoning. Overleden personen maken onderdeel uit van een bewoning tot het moment van overlijden. Gegevens over de bewoners zijn actueel. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Geeft aan welke gegevens van de gezagsverhouding in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) 
    /// </summary>
    [DataContract]
    public partial class GezagsverhoudingInOnderzoek :  IEquatable<GezagsverhoudingInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GezagsverhoudingInOnderzoek" /> class.
        /// </summary>
        /// <param name="indicatieCurateleRegister">indicatieCurateleRegister.</param>
        /// <param name="indicatieGezagMinderjarige">indicatieGezagMinderjarige.</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public GezagsverhoudingInOnderzoek(bool indicatieCurateleRegister = default(bool), bool indicatieGezagMinderjarige = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.IndicatieCurateleRegister = indicatieCurateleRegister;
            this.IndicatieGezagMinderjarige = indicatieGezagMinderjarige;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }
        
        /// <summary>
        /// Gets or Sets IndicatieCurateleRegister
        /// </summary>
        [DataMember(Name="indicatieCurateleRegister", EmitDefaultValue=false)]
        public bool IndicatieCurateleRegister { get; set; }

        /// <summary>
        /// Gets or Sets IndicatieGezagMinderjarige
        /// </summary>
        [DataMember(Name="indicatieGezagMinderjarige", EmitDefaultValue=false)]
        public bool IndicatieGezagMinderjarige { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name="datumIngangOnderzoek", EmitDefaultValue=false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GezagsverhoudingInOnderzoek {\n");
            sb.Append("  IndicatieCurateleRegister: ").Append(IndicatieCurateleRegister).Append("\n");
            sb.Append("  IndicatieGezagMinderjarige: ").Append(IndicatieGezagMinderjarige).Append("\n");
            sb.Append("  DatumIngangOnderzoek: ").Append(DatumIngangOnderzoek).Append("\n");
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
            return this.Equals(input as GezagsverhoudingInOnderzoek);
        }

        /// <summary>
        /// Returns true if GezagsverhoudingInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of GezagsverhoudingInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GezagsverhoudingInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IndicatieCurateleRegister == input.IndicatieCurateleRegister ||
                    (this.IndicatieCurateleRegister != null &&
                    this.IndicatieCurateleRegister.Equals(input.IndicatieCurateleRegister))
                ) && 
                (
                    this.IndicatieGezagMinderjarige == input.IndicatieGezagMinderjarige ||
                    (this.IndicatieGezagMinderjarige != null &&
                    this.IndicatieGezagMinderjarige.Equals(input.IndicatieGezagMinderjarige))
                ) && 
                (
                    this.DatumIngangOnderzoek == input.DatumIngangOnderzoek ||
                    (this.DatumIngangOnderzoek != null &&
                    this.DatumIngangOnderzoek.Equals(input.DatumIngangOnderzoek))
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
                if (this.IndicatieCurateleRegister != null)
                    hashCode = hashCode * 59 + this.IndicatieCurateleRegister.GetHashCode();
                if (this.IndicatieGezagMinderjarige != null)
                    hashCode = hashCode * 59 + this.IndicatieGezagMinderjarige.GetHashCode();
                if (this.DatumIngangOnderzoek != null)
                    hashCode = hashCode * 59 + this.DatumIngangOnderzoek.GetHashCode();
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

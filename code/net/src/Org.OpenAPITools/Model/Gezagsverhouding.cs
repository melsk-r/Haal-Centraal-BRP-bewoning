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
    /// Gegevens over het gezag over de persoon. 
    /// </summary>
    [DataContract]
    public partial class Gezagsverhouding :  IEquatable<Gezagsverhouding>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Gezagsverhouding" /> class.
        /// </summary>
        /// <param name="indicatieCurateleRegister">Geeft aan dat de persoon onder curatele is gesteld. .</param>
        /// <param name="indicatieGezagMinderjarige">indicatieGezagMinderjarige.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        public Gezagsverhouding(bool indicatieCurateleRegister = default(bool), IndicatieGezagMinderjarigeEnum indicatieGezagMinderjarige = default(IndicatieGezagMinderjarigeEnum), GezagsverhoudingInOnderzoek inOnderzoek = default(GezagsverhoudingInOnderzoek))
        {
            this.IndicatieCurateleRegister = indicatieCurateleRegister;
            this.IndicatieGezagMinderjarige = indicatieGezagMinderjarige;
            this.InOnderzoek = inOnderzoek;
        }
        
        /// <summary>
        /// Geeft aan dat de persoon onder curatele is gesteld. 
        /// </summary>
        /// <value>Geeft aan dat de persoon onder curatele is gesteld. </value>
        [DataMember(Name="indicatieCurateleRegister", EmitDefaultValue=false)]
        public bool IndicatieCurateleRegister { get; set; }

        /// <summary>
        /// Gets or Sets IndicatieGezagMinderjarige
        /// </summary>
        [DataMember(Name="indicatieGezagMinderjarige", EmitDefaultValue=false)]
        public IndicatieGezagMinderjarigeEnum IndicatieGezagMinderjarige { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name="inOnderzoek", EmitDefaultValue=false)]
        public GezagsverhoudingInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Gezagsverhouding {\n");
            sb.Append("  IndicatieCurateleRegister: ").Append(IndicatieCurateleRegister).Append("\n");
            sb.Append("  IndicatieGezagMinderjarige: ").Append(IndicatieGezagMinderjarige).Append("\n");
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
            return this.Equals(input as Gezagsverhouding);
        }

        /// <summary>
        /// Returns true if Gezagsverhouding instances are equal
        /// </summary>
        /// <param name="input">Instance of Gezagsverhouding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Gezagsverhouding input)
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
                if (this.IndicatieCurateleRegister != null)
                    hashCode = hashCode * 59 + this.IndicatieCurateleRegister.GetHashCode();
                if (this.IndicatieGezagMinderjarige != null)
                    hashCode = hashCode * 59 + this.IndicatieGezagMinderjarige.GetHashCode();
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

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
    /// Verloop
    /// </summary>
    [DataContract]
    public partial class Verloop :  IEquatable<Verloop>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Verloop" /> class.
        /// </summary>
        /// <param name="inVerhuizingen">Het aantal keren dat een alleenstaande of een gezin naar het verblijfsobject, de ligplaats of de standplaats is verhuisd binnen de opgegeven periode. .</param>
        /// <param name="uitVerhuizingen">Het aantal keren dat een alleenstaande of een gezin naar een ander verblijfsobject, ligplaats of standplaats is verhuisd binnen de opgegeven periode. .</param>
        /// <param name="gemiddeldAantalBewoners">Het gemiddelde aantal bewoners van het verblijfsobject, de ligplaats of de standplaats in de opgegeven periode. .</param>
        public Verloop(int inVerhuizingen = default(int), int uitVerhuizingen = default(int), float gemiddeldAantalBewoners = default(float))
        {
            this.InVerhuizingen = inVerhuizingen;
            this.UitVerhuizingen = uitVerhuizingen;
            this.GemiddeldAantalBewoners = gemiddeldAantalBewoners;
        }
        
        /// <summary>
        /// Het aantal keren dat een alleenstaande of een gezin naar het verblijfsobject, de ligplaats of de standplaats is verhuisd binnen de opgegeven periode. 
        /// </summary>
        /// <value>Het aantal keren dat een alleenstaande of een gezin naar het verblijfsobject, de ligplaats of de standplaats is verhuisd binnen de opgegeven periode. </value>
        [DataMember(Name="inVerhuizingen", EmitDefaultValue=false)]
        public int InVerhuizingen { get; set; }

        /// <summary>
        /// Het aantal keren dat een alleenstaande of een gezin naar een ander verblijfsobject, ligplaats of standplaats is verhuisd binnen de opgegeven periode. 
        /// </summary>
        /// <value>Het aantal keren dat een alleenstaande of een gezin naar een ander verblijfsobject, ligplaats of standplaats is verhuisd binnen de opgegeven periode. </value>
        [DataMember(Name="uitVerhuizingen", EmitDefaultValue=false)]
        public int UitVerhuizingen { get; set; }

        /// <summary>
        /// Het gemiddelde aantal bewoners van het verblijfsobject, de ligplaats of de standplaats in de opgegeven periode. 
        /// </summary>
        /// <value>Het gemiddelde aantal bewoners van het verblijfsobject, de ligplaats of de standplaats in de opgegeven periode. </value>
        [DataMember(Name="gemiddeldAantalBewoners", EmitDefaultValue=false)]
        public float GemiddeldAantalBewoners { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Verloop {\n");
            sb.Append("  InVerhuizingen: ").Append(InVerhuizingen).Append("\n");
            sb.Append("  UitVerhuizingen: ").Append(UitVerhuizingen).Append("\n");
            sb.Append("  GemiddeldAantalBewoners: ").Append(GemiddeldAantalBewoners).Append("\n");
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
            return this.Equals(input as Verloop);
        }

        /// <summary>
        /// Returns true if Verloop instances are equal
        /// </summary>
        /// <param name="input">Instance of Verloop to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Verloop input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.InVerhuizingen == input.InVerhuizingen ||
                    (this.InVerhuizingen != null &&
                    this.InVerhuizingen.Equals(input.InVerhuizingen))
                ) && 
                (
                    this.UitVerhuizingen == input.UitVerhuizingen ||
                    (this.UitVerhuizingen != null &&
                    this.UitVerhuizingen.Equals(input.UitVerhuizingen))
                ) && 
                (
                    this.GemiddeldAantalBewoners == input.GemiddeldAantalBewoners ||
                    (this.GemiddeldAantalBewoners != null &&
                    this.GemiddeldAantalBewoners.Equals(input.GemiddeldAantalBewoners))
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
                if (this.InVerhuizingen != null)
                    hashCode = hashCode * 59 + this.InVerhuizingen.GetHashCode();
                if (this.UitVerhuizingen != null)
                    hashCode = hashCode * 59 + this.UitVerhuizingen.GetHashCode();
                if (this.GemiddeldAantalBewoners != null)
                    hashCode = hashCode * 59 + this.GemiddeldAantalBewoners.GetHashCode();
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

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
    /// Geeft aan dat de persoon een man of vrouw is, of dat het geslacht (nog) onbekend is * &#x60;man&#x60; - M * &#x60;vrouw&#x60; - V * &#x60;onbekend&#x60; - O 
    /// </summary>
    /// <value>Geeft aan dat de persoon een man of vrouw is, of dat het geslacht (nog) onbekend is * &#x60;man&#x60; - M * &#x60;vrouw&#x60; - V * &#x60;onbekend&#x60; - O </value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum GeslachtEnum
    {
        /// <summary>
        /// Enum Man for value: man
        /// </summary>
        [EnumMember(Value = "man")]
        Man = 1,

        /// <summary>
        /// Enum Vrouw for value: vrouw
        /// </summary>
        [EnumMember(Value = "vrouw")]
        Vrouw = 2,

        /// <summary>
        /// Enum Onbekend for value: onbekend
        /// </summary>
        [EnumMember(Value = "onbekend")]
        Onbekend = 3

    }

}

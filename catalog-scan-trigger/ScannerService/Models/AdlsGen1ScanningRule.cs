// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class AdlsGen1ScanningRule
    {
        /// <summary>
        /// Initializes a new instance of the AdlsGen1ScanningRule class.
        /// </summary>
        public AdlsGen1ScanningRule()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AdlsGen1ScanningRule class.
        /// </summary>
        public AdlsGen1ScanningRule(IList<string> fileExtensions = default(IList<string>))
        {
            FileExtensions = fileExtensions;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "fileExtensions")]
        public IList<string> FileExtensions { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (FileExtensions != null)
            {
                if (FileExtensions.Count != System.Linq.Enumerable.Count(System.Linq.Enumerable.Distinct(FileExtensions)))
                {
                    throw new ValidationException(ValidationRules.UniqueItems, "FileExtensions");
                }
            }
        }
    }
}

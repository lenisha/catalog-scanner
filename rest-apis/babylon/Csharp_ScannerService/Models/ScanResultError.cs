// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService.Models
{
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class ScanResultError : ErrorModel
    {
        /// <summary>
        /// Initializes a new instance of the ScanResultError class.
        /// </summary>
        public ScanResultError()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ScanResultError class.
        /// </summary>
        public ScanResultError(string code = default(string), string message = default(string), string target = default(string), IList<ErrorModel> details = default(IList<ErrorModel>))
            : base(code, message, target, details)
        {
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

    }
}

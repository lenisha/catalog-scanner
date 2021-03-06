// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace DataCatalogGen2
{
    using Microsoft.Rest;
    using Models;
    using Newtonsoft.Json;

    /// <summary>
    /// The Azure Data Catalog Gen 2 API provides a RESTful set of web services
    /// that interact with Azure Data Catalog Gen 2 services.
    /// </summary>
    public partial interface IDataCatalogClient : System.IDisposable
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        System.Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        JsonSerializerSettings SerializationSettings { get; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        JsonSerializerSettings DeserializationSettings { get; }

        /// <summary>
        /// The page size - by default there is no paging.
        /// </summary>
        string Limit { get; set; }

        /// <summary>
        /// The offset for pagination purpose.
        /// </summary>
        string Offset { get; set; }

        /// <summary>
        /// The sort order, ASC (default) or DESC.
        /// </summary>
        string Sort { get; set; }

        /// <summary>
        /// Limits the result to only entities tagged with the given
        /// classification or its sub-types.
        /// </summary>
        string Classification { get; set; }

        /// <summary>
        /// Limits whether excludes deleted entities. True if excludes the
        /// deleted ones.
        /// </summary>
        bool? ExcludeDeletedEntities { get; set; }

        /// <summary>
        /// Limits the result set to only include the specified number of
        /// entries.
        /// </summary>
        int? Limit1 { get; set; }

        /// <summary>
        /// The start offset for pagination purpose.
        /// </summary>
        int? Offset1 { get; set; }

        /// <summary>
        /// The fulltext query string.
        /// </summary>
        string Query { get; set; }

        /// <summary>
        /// Limits the result to only entities of specified type or its
        /// sub-types.
        /// </summary>
        string TypeName1 { get; set; }

        /// <summary>
        /// The keyword to get auto complete.
        /// </summary>
        string Keyword { get; set; }

        /// <summary>
        /// The number of hops for lineage.
        /// </summary>
        int? Depth { get; set; }

        /// <summary>
        /// The direction of the lineage, which could be INPUT, OUTPUT or BOTH.
        /// Possible values include: 'BOTH', 'INPUT', 'OUTPUT'
        /// </summary>
        string Direction { get; set; }

        /// <summary>
        /// Limits whether includes extended information.
        /// </summary>
        bool? ExtendedInfo { get; set; }

        /// <summary>
        /// Subscription credentials which uniquely identify client
        /// subscription.
        /// </summary>
        ServiceClientCredentials Credentials { get; }


        /// <summary>
        /// Gets the IEntityREST.
        /// </summary>
        IEntityREST EntityREST { get; }

        /// <summary>
        /// Gets the IGlossaryREST.
        /// </summary>
        IGlossaryREST GlossaryREST { get; }

        /// <summary>
        /// Gets the IDiscoveryREST.
        /// </summary>
        IDiscoveryREST DiscoveryREST { get; }

        /// <summary>
        /// Gets the ILineageREST.
        /// </summary>
        ILineageREST LineageREST { get; }

        /// <summary>
        /// Gets the IRelationshipREST.
        /// </summary>
        IRelationshipREST RelationshipREST { get; }

        /// <summary>
        /// Gets the ITypesREST.
        /// </summary>
        ITypesREST TypesREST { get; }

        /// <summary>
        /// Gets the IAccessControlREST.
        /// </summary>
        IAccessControlREST AccessControlREST { get; }

    }
}

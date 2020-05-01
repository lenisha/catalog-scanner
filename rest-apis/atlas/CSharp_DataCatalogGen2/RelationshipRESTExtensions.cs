// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace DataCatalogGen2
{
    using Models;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// Extension methods for RelationshipREST.
    /// </summary>
    public static partial class RelationshipRESTExtensions
    {
            /// <summary>
            /// Creates a new relationship between entities.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='relationship'>
            /// The AtlasRelationship object containing the information for the
            /// relationship to be created.
            /// </param>
            public static JsonAtlasRelationship Create(this IRelationshipREST operations, JsonAtlasRelationship relationship)
            {
                return operations.CreateAsync(relationship).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates a new relationship between entities.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='relationship'>
            /// The AtlasRelationship object containing the information for the
            /// relationship to be created.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<JsonAtlasRelationship> CreateAsync(this IRelationshipREST operations, JsonAtlasRelationship relationship, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.CreateWithHttpMessagesAsync(relationship, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Updates an existing relationship between entities.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='relationship'>
            /// The AtlasRelationship object containing the information for the
            /// relationship to be created.
            /// </param>
            public static JsonAtlasRelationship Update(this IRelationshipREST operations, JsonAtlasRelationship relationship)
            {
                return operations.UpdateAsync(relationship).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Updates an existing relationship between entities.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='relationship'>
            /// The AtlasRelationship object containing the information for the
            /// relationship to be created.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<JsonAtlasRelationship> UpdateAsync(this IRelationshipREST operations, JsonAtlasRelationship relationship, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.UpdateWithHttpMessagesAsync(relationship, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Gets relationship information between entities by its GUID.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='guid'>
            /// The globally unique identifier of the relationship.
            /// </param>
            public static JsonAtlasRelationshipWithExtInfo GetById2(this IRelationshipREST operations, string guid)
            {
                return operations.GetById2Async(guid).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Gets relationship information between entities by its GUID.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='guid'>
            /// The globally unique identifier of the relationship.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<JsonAtlasRelationshipWithExtInfo> GetById2Async(this IRelationshipREST operations, string guid, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetById2WithHttpMessagesAsync(guid, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Deletes a relationship between entities by its GUID.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='guid'>
            /// The globally unique identifier of the relationship.
            /// </param>
            public static void DeleteById(this IRelationshipREST operations, string guid)
            {
                operations.DeleteByIdAsync(guid).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Deletes a relationship between entities by its GUID.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='guid'>
            /// The globally unique identifier of the relationship.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task DeleteByIdAsync(this IRelationshipREST operations, string guid, CancellationToken cancellationToken = default(CancellationToken))
            {
                (await operations.DeleteByIdWithHttpMessagesAsync(guid, null, cancellationToken).ConfigureAwait(false)).Dispose();
            }

    }
}
// -----------------------------------------------------------------------
//  <copyright>
//      Copyright (C) Microsoft Corporation. All rights reserved.
//  </copyright>
// -----------------------------------------------------------------------

using System.Threading;
using System.Threading.Tasks;

namespace Microsoft.Azure.Babylon.DataAccess.GenericOperations
{
    /// <summary>
    /// Defines a contract for creating or updating persistent entities.
    /// </summary>
    /// <typeparam name="TEntity">The type of the entity.</typeparam>
    public interface ICreateOrUpdateOperation<TEntity>
    {
        /// <summary>
        /// Updates an entity in persistence or creates it if it does not exist.
        /// </summary>
        /// <param name="entity">The entity information.</param>
        /// <param name="cancellationToken"></param>
        /// <returns>The created or updated entity.</returns>
        Task<TEntity> CreateOrUpdate(TEntity entity, CancellationToken cancellationToken);
    }
}
// -----------------------------------------------------------------------
//  <copyright file="IUpdateOperation.cs" company="Microsoft Corporation">
//      Copyright (C) Microsoft Corporation. All rights reserved.
//  </copyright>
// -----------------------------------------------------------------------

namespace Microsoft.Azure.Babylon.DataAccess.GenericOperations
{
    using System.Threading.Tasks;

    /// <summary>
    /// Defines a contract for updating persistent entities.
    /// </summary>
    /// <typeparam name="TEntity">The type of the entity.</typeparam>
    public interface IUpdateOperation<TEntity>
    {
        /// <summary>
        /// Updates an entity in persistence.
        /// </summary>
        /// <param name="entity">The entity information.</param>
        /// <returns>The updated entity.</returns>
        Task<TEntity> Update(TEntity entity);
    }
}

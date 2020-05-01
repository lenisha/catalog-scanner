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
    /// Defines a contract for getting a single entity from persistence.
    /// </summary>
    /// <typeparam name="TEntity">The type of the entity.</typeparam>
    /// <typeparam name="TEntityLocator">The type of the entity locator.</typeparam>
    public interface IGetSingleOperation<TEntity, in TEntityLocator>
    {
        /// <summary>
        /// Gets a single entity value.
        /// </summary>
        /// <param name="entityLocator">The entity locator.</param>
        /// <param name="cancellationToken"></param>
        /// <returns></returns>
        Task<TEntity> GetSingle(TEntityLocator entityLocator, CancellationToken cancellationToken);
    }
}
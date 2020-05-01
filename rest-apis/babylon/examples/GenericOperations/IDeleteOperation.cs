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
    /// Defines a contract for removing an entity from persistence.
    /// </summary>
    /// <typeparam name="TEntityLocator">The type of the entity locator.</typeparam>
    public interface IDeleteOperation<in TEntityLocator>
    {
        /// <summary>
        /// Removes an entity from persistence.
        /// </summary>
        /// <param name="entityLocator">Information needed to locate the entity.</param>
        /// <param name="cancellationToken"></param>
        /// <returns>A task.</returns>
        Task Delete(TEntityLocator entityLocator, CancellationToken cancellationToken);
    }
}
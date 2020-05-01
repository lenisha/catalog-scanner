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
    /// Defines a contract for checking if an from persistence matches the criteria.
    /// </summary>
    /// <typeparam name="TEntityLocator">The type of the entity locator.</typeparam>
    public interface IExistsAnyOperation<in TEntityLocator>
    {
        /// <summary>
        /// Check if any entity exists that can be mapped using entityLocator
        /// </summary>
        /// <param name="entityLocator"></param>
        /// <param name="cancellationToken"></param>
        /// <returns></returns>
        Task<bool> ExistsAny(TEntityLocator entityLocator, CancellationToken cancellationToken);
    }
}
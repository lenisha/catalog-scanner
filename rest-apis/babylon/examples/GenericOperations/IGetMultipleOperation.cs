// -----------------------------------------------------------------------
//  <copyright>
//      Copyright (C) Microsoft Corporation. All rights reserved.
//  </copyright>
// -----------------------------------------------------------------------

using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Microsoft.Azure.Babylon.DataAccess.GenericOperations
{
    /// <summary>
    /// Defines a contract for querying multiple entities from persistence.
    /// </summary>
    /// <typeparam name="TEntity">The type of the entity.</typeparam>
    /// <typeparam name="TCriteria">The type of search criteria to apply.</typeparam>
    public interface IGetMultipleOperation<TEntity, in TCriteria>
    {
        /// <summary>
        /// Querying multiple entities from persistence which match a certain criteria.
        /// </summary>
        /// <param name="criteria">The search criteria.</param>
        /// <param name="continuationToken">Continuation token</param>
        /// <param name="cancellationToken"></param>
        /// <returns>The matching results.</returns>
        Task<IBatchResults<TEntity>> GetMultiple(TCriteria criteria, string continuationToken, CancellationToken cancellationToken);
    }
}
// -----------------------------------------------------------------------
//  <copyright file="IGetMultipleOperation.cs" company="Microsoft Corporation">
//      Copyright (C) Microsoft Corporation. All rights reserved.
//  </copyright>
// -----------------------------------------------------------------------

namespace Microsoft.Azure.Babylon.DataAccess.GenericOperations
{
    using System.Threading.Tasks;

    /// <summary>
    /// Defines a contract for querying multiple entities from persistence.
    /// </summary>
    /// <typeparam name="TEntity">The type of the entity.</typeparam>
    /// <typeparam name="TCriteria">The type of search criteria to apply.</typeparam>
    /// <typeparam name="TOrderBy">The type of the order by clause type.</typeparam>
    public interface IGetMultipleOperationOrderBy<TEntity, in TCriteria, in TOrderBy>
    {
        /// <summary>
        /// Querying multiple entities from persistence which match a certain criteria.
        /// </summary>
        /// <param name="criteria">The search criteria.</param>
        /// <param name="orderBy">The order by clause type.</param>
        /// <param name="continuationToken">Continuation token</param>
        /// <returns>
        /// The matching results.
        /// </returns>
        Task<IBatchResults<TEntity>> GetMultiple(TCriteria criteria, TOrderBy orderBy, string continuationToken = null);
    }
}

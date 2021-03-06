// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace ScannerBabylonService
{
    using Models;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// Extension methods for Filters.
    /// </summary>
    public static partial class FiltersExtensions
    {
            /// <summary>
            /// Get a filter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            public static Filter Get(this IFilters operations, string dataSourceName, string scanName)
            {
                return operations.GetAsync(dataSourceName, scanName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a filter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Filter> GetAsync(this IFilters operations, string dataSourceName, string scanName, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetWithHttpMessagesAsync(dataSourceName, scanName, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Creates or updates a filter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            /// <param name='body'>
            /// </param>
            public static Filter CreateOrUpdate(this IFilters operations, string dataSourceName, string scanName, Filter body = default(Filter))
            {
                return operations.CreateOrUpdateAsync(dataSourceName, scanName, body).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates or updates a filter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            /// <param name='body'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Filter> CreateOrUpdateAsync(this IFilters operations, string dataSourceName, string scanName, Filter body = default(Filter), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.CreateOrUpdateWithHttpMessagesAsync(dataSourceName, scanName, body, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Deletes a filter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            public static void Delete(this IFilters operations, string dataSourceName, string scanName)
            {
                operations.DeleteAsync(dataSourceName, scanName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Deletes a filter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task DeleteAsync(this IFilters operations, string dataSourceName, string scanName, CancellationToken cancellationToken = default(CancellationToken))
            {
                (await operations.DeleteWithHttpMessagesAsync(dataSourceName, scanName, null, cancellationToken).ConfigureAwait(false)).Dispose();
            }

            /// <summary>
            /// List filters in Scan
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            /// <param name='skipToken'>
            /// </param>
            public static FilterList ListByScan(this IFilters operations, string dataSourceName, string scanName, string skipToken = default(string))
            {
                return operations.ListByScanAsync(dataSourceName, scanName, skipToken).GetAwaiter().GetResult();
            }

            /// <summary>
            /// List filters in Scan
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dataSourceName'>
            /// </param>
            /// <param name='scanName'>
            /// </param>
            /// <param name='skipToken'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<FilterList> ListByScanAsync(this IFilters operations, string dataSourceName, string scanName, string skipToken = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.ListByScanWithHttpMessagesAsync(dataSourceName, scanName, skipToken, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}

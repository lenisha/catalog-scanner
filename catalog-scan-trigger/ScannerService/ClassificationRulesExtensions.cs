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
    /// Extension methods for ClassificationRules.
    /// </summary>
    public static partial class ClassificationRulesExtensions
    {
            /// <summary>
            /// Get a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            public static ClassificationRule Get(this IClassificationRules operations, string classificationRuleName)
            {
                return operations.GetAsync(classificationRuleName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ClassificationRule> GetAsync(this IClassificationRules operations, string classificationRuleName, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.GetWithHttpMessagesAsync(classificationRuleName, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Creates or Updates a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='body'>
            /// </param>
            public static ClassificationRule CreateOrUpdate(this IClassificationRules operations, string classificationRuleName, ClassificationRule body = default(ClassificationRule))
            {
                return operations.CreateOrUpdateAsync(classificationRuleName, body).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Creates or Updates a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='body'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ClassificationRule> CreateOrUpdateAsync(this IClassificationRules operations, string classificationRuleName, ClassificationRule body = default(ClassificationRule), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.CreateOrUpdateWithHttpMessagesAsync(classificationRuleName, body, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Deletes a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            public static void Delete(this IClassificationRules operations, string classificationRuleName)
            {
                operations.DeleteAsync(classificationRuleName).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Deletes a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task DeleteAsync(this IClassificationRules operations, string classificationRuleName, CancellationToken cancellationToken = default(CancellationToken))
            {
                (await operations.DeleteWithHttpMessagesAsync(classificationRuleName, null, cancellationToken).ConfigureAwait(false)).Dispose();
            }

            /// <summary>
            /// List classification rules in Account
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='skipToken'>
            /// </param>
            public static ClassificationRuleList ListAll(this IClassificationRules operations, string skipToken = default(string))
            {
                return operations.ListAllAsync(skipToken).GetAwaiter().GetResult();
            }

            /// <summary>
            /// List classification rules in Account
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='skipToken'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ClassificationRuleList> ListAllAsync(this IClassificationRules operations, string skipToken = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.ListAllWithHttpMessagesAsync(skipToken, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Lists the rule versions of a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='skipToken'>
            /// </param>
            public static ClassificationRuleList ListVersionsByClassificationRuleName(this IClassificationRules operations, string classificationRuleName, string skipToken = default(string))
            {
                return operations.ListVersionsByClassificationRuleNameAsync(classificationRuleName, skipToken).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Lists the rule versions of a classification rule
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='skipToken'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<ClassificationRuleList> ListVersionsByClassificationRuleNameAsync(this IClassificationRules operations, string classificationRuleName, string skipToken = default(string), CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.ListVersionsByClassificationRuleNameWithHttpMessagesAsync(classificationRuleName, skipToken, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

            /// <summary>
            /// Sets Classification Action on a specific classification rule version.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='classificationRuleVersion'>
            /// </param>
            /// <param name='body'>
            /// </param>
            public static OperationResponse SetClassificationActionForVersion(this IClassificationRules operations, string classificationRuleName, int classificationRuleVersion, ClassificationRuleVersionAction body)
            {
                return operations.SetClassificationActionForVersionAsync(classificationRuleName, classificationRuleVersion, body).GetAwaiter().GetResult();
            }

            /// <summary>
            /// Sets Classification Action on a specific classification rule version.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='classificationRuleName'>
            /// </param>
            /// <param name='classificationRuleVersion'>
            /// </param>
            /// <param name='body'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<OperationResponse> SetClassificationActionForVersionAsync(this IClassificationRules operations, string classificationRuleName, int classificationRuleVersion, ClassificationRuleVersionAction body, CancellationToken cancellationToken = default(CancellationToken))
            {
                using (var _result = await operations.SetClassificationActionForVersionWithHttpMessagesAsync(classificationRuleName, classificationRuleVersion, body, null, cancellationToken).ConfigureAwait(false))
                {
                    return _result.Body;
                }
            }

    }
}

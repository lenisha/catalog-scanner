
using System;

using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Configuration;
using System.IO;
using Microsoft.Extensions.Logging;

namespace catalog_scan_trigger
{
    class Program
    {
          static void Main(string[] args)
        {


            Console.WriteLine("Scan Trigger Client");

            // create service collection
            var serviceCollection = new ServiceCollection();
            ConfigureServices(serviceCollection);

            // create service provider
            var serviceProvider = serviceCollection.BuildServiceProvider();

            // run app
            serviceProvider.GetService <DataCatalogScanTrigger>().Run();

        }

        private static void ConfigureServices(IServiceCollection serviceCollection)
        {

            string env = Environment.GetEnvironmentVariable("ASPNETCORE_ENVIRONMENT");
            if (String.IsNullOrEmpty(env))
                env = "Production";

            // Set up configuration sources.
            var configuration = new ConfigurationBuilder()
              .SetBasePath(Directory.GetCurrentDirectory())
              .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true)
              .AddJsonFile($"appsettings.{env}.json", optional: true, reloadOnChange: true)
              .AddEnvironmentVariables()
              .Build();

            // add logging
            serviceCollection.AddLogging(builder =>
            {
                builder.AddConsole();
                builder.AddDebug();
            });

            // Add Config
            serviceCollection.AddSingleton<IConfiguration>(configuration);
            serviceCollection.AddOptions();
            // add app
            serviceCollection.AddTransient <DataCatalogScanTrigger>();
            Console.WriteLine("\nDataCatalogScanTrigger Loaded.");
        }
    }
}

using System;
using RiakApp;
using RiakClient.Models;

namespace RiakClient
{
    class Program
    {
        private const string Bucket = "s10776";

        static void Main(string[] args)
        {
            var cluster = RiakCluster.FromConfig("riakConfig");
            var client = cluster.CreateClient();
            var person = new Person("diana@example.com", "Diana", 15);
            var document = new RiakObject(Bucket, person.Email, person);

            Console.WriteLine($"Adding a person document using key {person.Email}...");
            client.Put(document);
            var initialResult = GetPerson(person.Email, client);
            DisplayPersonData(initialResult);

            Console.WriteLine($"Removing a person document using key {person.Email}...");
            client.Delete(document);
            var finalResult = GetPerson(person.Email, client);
            DisplayPersonData(finalResult);

            Console.ReadKey();
        }

        private static Person GetPerson(string key, IRiakClient client)
        {
            Console.WriteLine($"Requesting a person document using key {key}...");
            var result = client.Get(Bucket, key);
            try
            {
                if (result.IsSuccess)
                {
                    return result.Value.GetObject<Person>();
                }
            }
            catch (Exception)
            {
                Console.WriteLine("The returned document is either empty or not a valid Person");
            }

            return null;
        }

        private static void DisplayPersonData(Person person)
        {
            if (person == null)
            {
                Console.WriteLine("Requested document was not found");
            }
            else
            {
                Console.WriteLine($"Returned person with: ");
                Console.WriteLine($"Email: {person.Email}");
                Console.WriteLine($"Name: {person.Name} ");
                Console.WriteLine($"Age: {person.Age} ");
            }
        }

    }
}

namespace RiakApp
{
    public class Person
    {
        public string Email { get;}
        public string Name { get; }
        public int Age { get; }

        public Person(string email, string name, int age)
        {
            Email = email;
            Name = name;
            Age = age;
        }
    }
}

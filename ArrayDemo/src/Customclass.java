
class Employee
{
    int id;
    String name;
    int salary;

    public void printDetails
        {
            System.out.println("My id is " + id);
            System.out.println("My name is " + name);
            System.out.println("My salary is " + salary);
        }

    public class Customclass
    {
        public static void main(String[] args)
        {
            Employee Pranit = new Employee();
            Pranit.id = 1;
            Pranit.name = "Pranit Khamkar";
            Pranit.salary = 50000;

            Pranit.printDetails();
        }
    }
}
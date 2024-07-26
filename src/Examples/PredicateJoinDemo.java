import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateJoinDemo
{
public static void main (String args[])
{
    Employee e1= new Employee("vikram", "jabalpur", "Devops");
    Employee e2= new Employee("vishal", "jabalpur", "Developer");
    Employee e3= new Employee("vinay", "jabalpur", "Tester");
    Employee e4= new Employee("vivek", "jabalpur", "Marketing");
    Employee e5= new Employee("Vipul", "jabalpur", "Production");

    List<Employee> emp=Arrays.asList(e1,e2,e3,e4,e5);

   Predic ate<Employee> p1= e -> e.location.equals("Jabalpur");

  

}

}
class Employee {
    String name;
    String location;
    String Dept;

    public Employee(String name,String location,String Dept)
    {
        this.name=name;
        this.location=location;
        this.Dept=Dept;
    }

    public String getDept()
    {
        return Dept ;
    }
    public String getLocation()
    {
        return location;
    }
    public String getName()
    {
        return name;
    }
    public void setDept(String Dept)
    {
        this.Dept=Dept;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
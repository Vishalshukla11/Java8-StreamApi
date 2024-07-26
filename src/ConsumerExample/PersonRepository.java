package ConsumerExample;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PersonRepository
{
public static List<Person> getAllPersons()
{
    Person p1= new Person("vikram",165,2000,"Male",2,Arrays.asList("cricket","Swimming"));
    Person p2= new Person("vishal",165,3000,"Male",2,Arrays.asList("cricket","Swimming","books reading "));
    Person p3= new Person("vinay",170,4000,"Male",2,Arrays.asList("cricket"));
    Person p4= new Person("vipul",170,5000,"Male",2,Arrays.asList("Swimming"));
    Person p5= new Person("vivek",155,6000,"Male",2,Arrays.asList("cricket","Swimming"));
     return Arrays.asList(p1,p2,p3,p4,p5);

}
public  static Person getPerson()
{
   return new Person("vikram",165,2000,"Male",2,Arrays.asList("cricket","Swimming"));
}

}
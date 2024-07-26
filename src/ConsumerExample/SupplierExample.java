package ConsumerExample;
import java.util.List;
import java.util.function.Supplier;

class SupplierExample
{
    static Supplier<Person> s1= () -> PersonRepository.getPerson();
    static Supplier<List<Person>> s2= () -> PersonRepository.getAllPersons();
 // in personRepositoty class getAllperson it the best example of suppilier because there we are not passing anything but getting result 
  public static void main(String args[])
    {
        // List<Person> personsList= PersonRepository.getAllPersons();
    System.out.println("Supplier result 1=> " + s1.get());
    System.out.println("Supplier result 2: " + s2.get());

    }
}
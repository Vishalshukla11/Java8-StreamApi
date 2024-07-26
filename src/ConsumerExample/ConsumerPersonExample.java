package ConsumerExample;

import java.util.List;
import java.util.function.Consumer;
class ConsumerPersonExample
{
    static Consumer<Person> c1=(p) -> System.out.println(p);
    static Consumer<Person> c2= (p) -> System.out.println(p.getName().toUpperCase());
    static Consumer<Person> c3 =(p) -> System.out.println(p.getHobbies());

    static void printNameAndHobbies()
    {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(c1.andThen(c3));
    }
    public static void main(String args[])
    {
        // c1.accept(PersonRepository.getPerson());
        
        // c2.accept(PersonRepository.getPerson());
        
        // c3.accept(PersonRepository.getPerson());
    
       // c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson()); 
      printNameAndHobbies();
    }

}
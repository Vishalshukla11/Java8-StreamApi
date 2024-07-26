package Stream;

import java.util.Optional;
import java.util.function.Predicate;
import ConsumerExample.PersonRepository;

import ConsumerExample.Person;

public class StreamFindAnyFirstExample{
    static Predicate<String> p1= num -> num.length()>7;
    static Predicate<Person> p2= per -> per.getHeight() >=140;
    static Predicate <Person> p3= per -> per.getGender().equals("Male");
    public static void main(String args[])
    {
                //for check print if anyone is present 
                Optional<Person> findF=findAny();
                if(findF.isPresent())
                    System.out.println("FInd Any if present Result:-" + findAny().get());
                
System.out.println("Find Any result: " + findAny().get() );
       
    }
    public static Optional<Person> findAny(){
      return 
        PersonRepository.getAllPersons()
        .stream()
        .filter(p2)
        .findAny();
        
    }
    
}
package Stream;

import java.util.Optional;
import java.util.function.Predicate;

import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

class StreamFindFirst{
    static Predicate<String> p1= num -> num.length()>7;
    static Predicate<Person> p2= per -> per.getHeight()>=140;
    static Predicate<Person> p3= per -> per.getGender().equals("female ");
    public static void main(String args[])
    {
        //for check print if anyone is print 
        Optional<Person> findF=findFirst();
        if(findF.isPresent())
            System.out.println("FInd First if present Result:-" + findFirst().get());
            else
            System.out.println("No record found");

        // print only first don't check anyone is present or not 
        System.out.println("Result of FindFirst:- " + findFirst().get());
    }

    static Optional<Person> findFirst()
    {
       return 
        PersonRepository.getAllPersons()
        .stream()
        .filter(p3)
        .findFirst();

    }

}
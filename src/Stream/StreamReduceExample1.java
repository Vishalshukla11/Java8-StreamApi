package Stream;

import java.util.Optional;

import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

class StreamReduceExample1
{
public static void main(String args[])
{
    CombineNames();
    System.out.println("Tallest Person is " + getTallesPerson());

}

private static void CombineNames()
{
    
    String names=
    PersonRepository.getAllPersons().stream()
    .map(Person:: getName)
    .reduce("",(a,b) -> a.concat(b));
    System.out.println("Names are :  " + names);
}

private static Optional<Person> getTallesPerson()
{
    return
    PersonRepository.getAllPersons()
    .stream()
    .reduce((x,y) -> x.getHeight()>y.getHeight()?x:y);

}
}
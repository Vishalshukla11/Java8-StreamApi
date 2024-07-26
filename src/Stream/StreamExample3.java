package Stream;

import java.util.List;
import java.util.stream.Collectors;

import ConsumerExample.PersonRepository;
import ConsumerExample.Person;

class StreamExample3
{
    public static void main(String args[])
    {
      List<String> personHobbies= PersonRepository
        .getAllPersons()//itereate all persons
        .stream()//stream of persons
        .map(Person::getHobbies)//stream<List<String>
        .flatMap(List::stream)
        .distinct()
        .collect(Collectors.toList());
        System.out.println("Person Hobbies List:" + personHobbies);
      
    }
}
package Stream;

import java.util.Comparator;

import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

class StreamCustoSortExample
{
    public static void main(String args[])
    {
        System.out.println("Sort by Name");
        PersonRepository.getAllPersons().stream()
        .sorted(Comparator.comparing(Person::getName))
        .forEach(System.out::println);

        System.out.println("Sort by height");
        PersonRepository.getAllPersons().stream()
        .sorted(Comparator.comparing(Person::getHeight))
        .forEach(System.out:: println);

        System.out.println("Reverse sort by name");
        PersonRepository.getAllPersons().stream()
        .sorted(Comparator.comparing(Person::getName).reversed())
        .forEach(System.out::println);


    }

}
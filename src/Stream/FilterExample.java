package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ConsumerExample.PersonRepository;

class FilterExample{
    public static void main(String args[])
    {
        List<String> names=Arrays.asList("Sam","ram","Pam","Piter","Vishal","nancy");
        Stream<String> allNames=names.stream();
        Stream<String> updatedList = allNames.filter(s -> s.length()>5);

        updatedList.forEach(System.out::println);

        System.out.println("another way simple way");
        //another way 
        names.stream().filter(s -> s.length()>3)
        .collect(Collectors.toList())
        .forEach(System.out::println);

        System.out.println("Personal repository");
        PersonRepository.getAllPersons().stream()
        .filter(hlo -> hlo.getHeight()>165)
        .collect(Collectors.toList())
        .forEach(System.out::println);
    }

}
package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

class StreamMinMaxByExample{
    
    
    public static void main(String args[]){
        System.out.println("Tallest person Using ByMax : " + getTallestPerson());
        System.out.println("Smalles Person Using MinBy : " + getSmallestPerson());
        System.out.println("Tallest person with duplicate emeber is present : " +FiltermUltipulePersons() );
       
    }

        private static Optional<Person> getTallestPerson()
        {
        return 
          PersonRepository.getAllPersons()
          .stream()
          .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));

        } 

        private static Optional<Person> getSmallestPerson(){
            return
            PersonRepository.getAllPersons()
            .stream()
            .collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));
           
        }

        //if there are two person with same heights 
        private static List<Person> FiltermUltipulePersons()
        {
            List<Person> pList=new ArrayList<Person>();
            Optional<Person> maxHeight = getTallestPerson();
            Person per= maxHeight.isPresent()? maxHeight.get():null;
            if(null != per)
            {
                PersonRepository.getAllPersons()
                .stream()
                .filter(pers -> pers.getHeight() == pers.getHeight())
                .collect(Collectors.toList());
            }
            return pList;
        }

}
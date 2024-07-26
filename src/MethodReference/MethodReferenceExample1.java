package MethodReference;
import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

class MethodReferenceExample1
{
static Function<String,String> f1=  name -> name.toUpperCase();
//by using method reference 
static Function<String,String> f2=  String::toUpperCase; 

// predicate 
static Predicate<Person> p1= MethodReferenceExample1 :: heightCheck;
static BiPredicate<Person,Integer> p2=MethodReferenceExample1:: heightCheckWithParam;

public static void main(String[] args) {

    System.out.println("result lambda expression => " +f1.apply("java 8"));
    System.out.println("result 2 lambda expression => " +f2.apply("java 8 test using method reference "));
   System.out.println("Predicate 1 result: " + p1.test(PersonRepository.getPerson()));
   System.out.println("Predicate 2 result: " + p2.test(PersonRepository.getPerson(),145));

}

static boolean heightCheck(Person per)
{
    return per.getHeight() >= 140;
}
static boolean heightCheckWithParam(Person per,Integer height)
{
    return per.getHeight() >= height;
}

}
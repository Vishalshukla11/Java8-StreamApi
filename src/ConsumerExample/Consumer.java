package ConsumerExample;
import java.util.function.Consumer;
class ConsumerExam
{
    public static void main(String args[]){
    Consumer<String> con1 = (s) -> {System.out.println(s.toLowerCase());};
    //con1.accept("java 8");

    Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
     //con2.accept("java 8 ");

     con1.andThen(con2).accept("another cool  thing in java 8 ");

    }
}
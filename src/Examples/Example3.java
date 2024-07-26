// Comparator  lambda expression example 
//conparator return if a>b= 1:1, a<b = 1:-1 ,a=b => 1:0
import java.util.Comparator;

class Example3
{
public static void main(String []args)
{
    //before java 8
    Comparator<Integer> c1 = new Comparator<>() {
        public int compare(Integer x ,Integer y)
        {
            return x.compareTo(y);
        }
        
    };

    System.out.println("comparator result before java 8=> " + c1.compare(10, 20));

  //after java 8
  Comparator<Integer> c2=(Integer x ,Integer y) -> x.compareTo(y);
  System.out.println("After java 8 result => " + c2.compare(12,20));

  Comparator<Integer> c3=( x , y) -> x.compareTo(y);
  System.out.println("After java 8 result => " + c3.compare(30,20));
  
  Comparator<Integer> c4=( x , y) -> x.compareTo(y);
  System.out.println("After java 8 result => " + c4.compare(12,12));
}

}
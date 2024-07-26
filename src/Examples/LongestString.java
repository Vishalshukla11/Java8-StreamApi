//to find longest string from given array
import java.util.Arrays;
import java.util.Scanner;
class LongestString
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array  ");
    int size=sc.nextInt();
    String [] arr = new String[size];

    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextLine();
    }
    sc.close();
    
    //fine the longest string 
    String longestString= Arrays.stream(arr)
     .max((s1,s2) -> Integer.compare(s1.length(),s2.length()))
     .orElse(null);
     
     if(longestString != null)
     {
        System.out.println("Longest String in the array : "  + longestString);
     }
     else
     {
        System.out.println("Array is empty or all emements are null ");
     }
}
}

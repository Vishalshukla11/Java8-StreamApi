// find the 2nd highest number from a given array

import java.util.Arrays;
import java.util.Scanner;

class SecondHighestNumber
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size =sc.nextInt();
        int []arr= new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        sc.close();

        if(arr.length < 2)
        {
            System.out.println("Array should have atleast two elements");
            return;
        }

        //find the second highest number
        Integer secondHighest=Arrays.stream(arr) // created a stream from the array 
        .distinct() // remove duplicates from the stream
        
        //we are using this boxed function because without boxed function we can't use 
        // opeartions like findfirst(),sorted() wouldn't be possible  directly on an Intstream
        .boxed() //convert each primitive int to Integer object
        .sorted((a,b) -> b-a) // sort the stream in descending order
        .skip(1) //skip the first element (highest element) and make second element as a first element 
        .findFirst() // find the fist element in the remaining stream
        .orElseThrow(() -> new  IllegalStateException("No second highest element found")); // thwor exception if no element found
        
        System.out.println("Secod highest element is : " + secondHighest);
    }

}
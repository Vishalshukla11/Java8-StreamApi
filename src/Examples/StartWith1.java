// to find all elements from array who starts with 1

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class StartWith1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements:- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //find all element start with the digit 1
        List<Integer> elementStartWithOne= Arrays.stream(arr)
        .boxed()//conver int[] to Integer stream
        .map(String :: valueOf) // convert each integer to a String
        .filter(s -> s.startsWith("1")) // filter string starting with '1'
        .map(Integer :: valueOf) // again convert string to Integer
        .collect(Collectors.toList()); // collect result into a list
        
        //print the result 
        System.out.println("Element Starting with '1' :-  " + elementStartWithOne );

    }

}
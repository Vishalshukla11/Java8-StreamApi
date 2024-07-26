//find the 2nd lowest number from a given array

import java.util.Arrays;
import java.util.Scanner;

class FinfSecondLowestNumber
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

        //find the second Lowest  number
        Integer secondLowest = Arrays.stream(arr) // created a stream from the array 
        .distinct() // remove duplicates from the stream
        .sorted()
        .skip(1)
        .findFirst()
        .orElseThrow(() -> new IllegalStateException("no second lowest element found"));
        System.out.println("Second lowest numbe is " + secondLowest);
    }
}
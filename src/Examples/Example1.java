//sun of the range of the number 

import java.util.stream.IntStream;

class Example1
{
    public static void main(String args[])
    {

        //before 
        int sum=0;
        for(int i=0;i<=50;i++)
        {
            sum=sum+i;
        }
        System.out.println("total Sum is => "+ sum);

        //after java 8

        int total= IntStream.rangeClosed(0, 50)
        .sum();
        System.out.println("totai in java 8 =>" + total);


        
        
    }
}
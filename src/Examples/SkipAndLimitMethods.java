// skip & Limit method use case based example

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SkipAndLimitMethods
{
    private List<String> posts;
    

    //constructor

   public  SkipAndLimitMethods()
   {
     // initialize with some sample posts 
     
     posts=  Arrays.asList(
        "Post 1", "Post 2", "Post 3", "Post 4", 
        "Post 5", "Post 6", "Post 7", "Post 8", 
        "Post 9", "Post 10"
     );
     
   }

   public List<String> getPosts(int pageNumber, int pageSize)
   {
    //calculate start index based on pagenumber and pagesize
    
    int startIndex= (pageNumber - 1 ) * pageSize;

    // stream the list of posts ,skip to startIndex,and limit to pagesize 
    return posts.stream()
      .skip(startIndex)
      .limit(pageSize)
     .collect(Collectors.toList());  // convert stream to List 

   }

   // main method 
   public static void main(String args[])
   {
    SkipAndLimitMethods feed= new SkipAndLimitMethods();

    // get posts for page 2 with 3 posts per page 
    int pageNumber=2;
    int pageSize=3;

    List<String> pagePosts = feed.getPosts(pageNumber,pageSize);

    //print the posts 
    System.out.println("page " + pageNumber + "posts: " ) ;
    pagePosts.forEach(System.out ::  println);
   }
}
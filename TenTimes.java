public class TenTimes
{
   public static void main(String[] args)
   {  
      String phrase = "Mr. Mitchell is cool.";
      
      for(int n = 1; n <= 10; n = n + 1)
      {
         System.out.println(n + ". " + phrase);
      }
   }
}
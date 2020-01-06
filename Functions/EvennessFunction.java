public class EvennessFunction
{
   public static void main(String[] args)
   {
      for(int i = 1; i <= 20; i++)
      {
         System.out.print(i + " ");
         
         if(isEven(i))
            System.out.print("<");
         if(isDivisibleBy3(i))
            System.out.print("=");
            
         System.out.println();
      }
   }
   
   public static boolean isEven(int n)
   {
      return (n % 2 == 0);
   }
   
   public static boolean isDivisibleBy3(int n)
   {
      return (n % 3 == 0);
   }
}
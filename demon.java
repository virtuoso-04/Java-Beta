import java.util.*;
public class demon 
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
         int i=0;int fact=1;
         for(i=0;i<n;i++)
         {
            fact=fact*i;

         }
         System.out.println(fact);

    }
    
}
import java.io.*;  
import java.util.*;  
public class Gcd  
{     
  public static void main(String args[])  
  {  
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter First Number : ");
       int num1=sc.nextInt();
       System.out.print("\nEnter Second Number : ");
       int num2=sc.nextInt();
       int gcd=(num1<=num2)? num1: num2;
       while(gcd>=1)
       {
           if(num1%gcd==0 && num2%gcd==0)
           { 
              break;
           }
           gcd--;
       }
       System.out.print("\nGCD of two numbers is : "+gcd);     
  }  
}  

 //Problem Statement –

//Write a function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2 + b3.

//Write a program to accept three values in order of a, b and c and get the result of the above equation.

import java.util.*;
public class Infosys1{
public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    int a,b;
    int solve=0;
     System.out.println("enter a");
     a=sc.nextInt();
    
    System.out.println("enter b");
    b=sc.nextInt();
    
    solve=a*a*a + 3*a*a*b + 3*a*b*b + b*b*b;
    System.out.println(solve);
    
}
}
/* 
Problem Statement:

Capgemini, in its online written test, has a coding question where students are given a string containing multiple characters that are repeated consecutively. Your task is to reduce the size of the string by replacing each group of consecutive repeated characters with the character followed by its count.

Example 1

Input:

aabbbbeeeeffggg

Output:

a2b4e4f2g3
Example 2

Input:

abbccccc

Output:

ab2c5

*/


import java.util.*;
public  class Capgemini1{
    public static void main(String[] args){
        String s="aabbbbeeeeffggg";
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=i;j<s.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
                else{
                    break;
                }
                
            }
            System.out.print(ch[i]+""+count);
            i=i+count-1;
        }
    }
}
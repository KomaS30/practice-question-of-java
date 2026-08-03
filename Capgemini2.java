 /* 
input=Move#Hash#to#Front;
output=###MoveHashtoFront
*/





import java.util.*;
 public class Capgemini2{
     public static void main(String[] args)
     {
         String s="Move#Hash#to#Front";
         String hash = "";
String other = "";

for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == '#') {
        hash += s.charAt(i);
    } else {
        other += s.charAt(i);
    }
}

System.out.println(hash + other);
}
 }
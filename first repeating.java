
import java.util.*;
public class Main
{
	public static void main(String[] args) {
   String s="abcvytabc";
   HashSet<Character>h=new HashSet<>();
   for(char c:s.toCharArray()){
       if(h.contains(c)){
           System.out.print(c);
      break;
      }else{
          h.add(c);
      }
       
       }
   }
}
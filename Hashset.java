
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int[] arr={1,2,3,3,8,8};
    HashSet<Integer> h=new HashSet<>();
    for(int l: arr){
        h.add(l);
    }
    System.out.print(h);
	}
}
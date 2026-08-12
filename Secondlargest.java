

public class Main
{
	public static void main(String[] args) {
	    int[]arr={10,7,9,70,45,2};
		int largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		for(int num:arr){
		    if(num>largest){
		        SecondLargest=largest;
		        largest=num;
		    }
		    else if(num>SecondLargest&&num!=largest){
		        SecondLargest=num;
		    }
		}
		System.out.print("SecondLargest: "+SecondLargest);
		
		    }
		}
				        
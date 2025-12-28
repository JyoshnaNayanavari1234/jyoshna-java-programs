public class Evenoddnumbers
{
	public static void main(String[] args) {
	    int evensum=0;
	    int oddproduct=1;
	    int n=653725;
	    while(n>0){
	        int digit=n%10;
	        if(digit%2==0){
	            evensum=evensum+digit;
	    }
	    else{
	        oddproduct=oddproduct+digit;
	    }
	    n=n/10;
	    }
		System.out.println("evensum: " + evensum);
		System.out.println("oddproduct: " + oddproduct);
	}
}
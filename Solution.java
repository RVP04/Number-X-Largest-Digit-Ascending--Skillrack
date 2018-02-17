import java.util.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    long number = sc.nextLong();
	    int x = sc.nextInt();
	    
	    ArrayList<Long> digits = new ArrayList<Long>();
	    while(number>0)
	    {
	        long temp = number%10;
	        
	        if(!(digits.contains(temp)))
	        digits.add(temp);
	        
	        number=number/10;
	    }
	    
	    Collections.sort(digits);
	    
	    for(int i = digits.size()-x;i<digits.size();i++)
	    {
	    System.out.print(digits.get(i));
	    }
	}
}

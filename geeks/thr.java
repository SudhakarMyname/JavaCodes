package geeks;
import java.util.*;




public class thr {

	    
	    static void printInFormat(float a, float b){
	        //dividing a by b
	    	
	    Scanner x=new Scanner(System.in);
	    a=x.nextInt();
	    b=x.nextInt();
	    
	        float result = a/b;
	        
	        //printing without formatting
	        System.out.print(result + " ");
	        
	        //printing with formatting
	        System.out.format("%.3f", result);
	        
	    }
}

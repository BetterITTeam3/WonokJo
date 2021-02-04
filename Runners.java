package dd;
import java.util.Arrays;
public class Runners {
    public static String failer(String[] participant,String[] completion) {
    	String failer="";
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	for(int i=0; i<participant.length;i++)
    	{
    		if(participant!=completion) {
    		
    			failer=participant[i];
    		}
    			
    		                        
    		
    	}
    	
    	
    	
    	return failer;
    }
}

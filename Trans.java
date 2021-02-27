package thisex;

public class Trans {
	
	public String solution(String p) {
		return getp(p);
	}
	
	 public String getp(String p) {
	    int plength=p.length();
	    char[] arr= new char[plength];
	    for(int i=0; i<plength;i++) {
	    	
	    	arr[i]=p.charAt(i);
	    }
	   
		 int in=0;
		 int out=0;
		 
	    for(int i=0;i<plength;i++) {
	
	 
	 if(arr[i]=='(') {
		 in++;
	 }
	 else
	 {
		out++;
	
	 }
	    	if(in==out)
	    		break;
	    	
	    	
	    }
	    
 	    int ulength=in+out;
 	    String u=p.substring(0,ulength);
 	    String v=p.substring(ulength);	

 	    if(correct(u))
 	    return u+getp(v);
 	    
 	    else
 	    return "("+getp(v)+")"+remakeu(u);	 	
 	    
	 }
 	    
 	    private boolean correct(String u) {
 	    	int ulength=u.length();
 	    	int in=0;
 	    	for(int i=0;i<ulength;i++) {
 	    		if(u.charAt(i)=='(') {
 	    			in++;
 	    		}
 	    		else {
 	    			if(in==0) 
 	    				return false;
 	    			in--;
 	    		}
 	    		
 	    		
 	    		
 	    	}
 	    	
 	    	
 	    	
 	    	
 	    	return true;
 	    }
	    
	    private String remakeu(String u) {
	    	String remakedu="";
	    	char[] arr= new char[u.length()];
    		for(int z=0; z<u.length();z++) {
    	    	
    	    	arr[z]=u.charAt(z);
    	    }
	    	for(int i=1;i<u.length()-1;i++) {
	    		
	    		
	    		if(arr[i]=='(')
	    			remakedu+=")";
	    		else
	    			remakedu+="(";
	    		
	    		
	    		
	    		
	    	}
	    	
	    	
	    	
	    	return remakedu;
	    }
	    
	    
	    
	    
	    
	 	   
 	    
 	    
 	    
 	    
	    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


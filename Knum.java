package dd;
import java.util.Arrays;
public class Knum {
    public int[] solution(int[] array, int[][] commands) {
    	
    int[] cutarray= {0};
    int cutstart;
    int cutfinal;
    int pointnum;
    int a=0;
    int b=0;
    int[] gathernum= {0};
    for(int i=0;i<commands[i].length;i++) {
    	cutstart=commands[i][0]-0;
    	cutfinal=commands[i][0]-1;
    	pointnum=commands[i][0]-2;
    	for(int j=cutstart; j<=cutfinal;j++)
    	{
    		cutarray[a]=array[j];
    		a++;
    		
    	}
    	Arrays.sort(cutarray);
    	gathernum[b]= cutarray[pointnum];
    	b++;
    	
    }
    return gathernum;
    	
    }
	
	public static void main(String[] args) {


	}

}

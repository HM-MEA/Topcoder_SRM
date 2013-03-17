import java.util.*;

public class FoxAndMp3Easy /*implements Comparator<Object>*/{

	public String[] playList(int n) {
		String ans1[] = new String[n];
		int a;
		if(n > 51){
			 a = 50;
		}else{
			 a = n;
		}
		String ans2[] = new String[a];
		for(int i = 0;i < n;i++){
			ans1[i] = i + 1 +".mp3"; 
		}
		Arrays.sort(ans1);
		for(int i = 0;i < a;i++){
			ans2[i] = ans1[i];
		}
		return ans2;
	}

	/*public int compare(Object arg0, Object arg1) {
		return ((String) arg0).compareTo((String) arg1);
	}*/
}

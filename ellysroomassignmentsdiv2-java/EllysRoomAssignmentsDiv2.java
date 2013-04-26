import java.util.ArrayList;
import java.util.Collections;

public class EllysRoomAssignmentsDiv2 {

	public double getProbability(String[] ratings) {
		int n = ratings.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int Enumber;
		int x;
		int R;
		double ans = 0.0;
		String str = "";
		
		for(int i = 0;i < n;i++){
			str = str + ratings[i];
		}
		String s[] = str.split(" ");
		for(int i = 0;i < s.length;i++){
			list.add(Integer.parseInt(s[i]));
		}
		n = list.size();
		Enumber = list.get(0);
		Collections.sort(list);	
		Collections.reverse(list);
		x = list.indexOf(Enumber);
		if((n % 20) == 0){
			R = n / 20;
		}else{
			R = (n / 20) + 1;
		}
		if((n <= 20)||(x == 0)){
			return 1;
		}
		if(x + 1 <= R){
			return 0;
		}
		ans = 1 / (double)R;
		return ans;
	}

}

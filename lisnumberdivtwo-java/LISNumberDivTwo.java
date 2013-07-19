public class LISNumberDivTwo {

	public int calculate(int[] seq) {
		int ans = 1;
		int f = 0;
		for(int i = 0;i < seq.length;i++){
			if(f < seq[i]){
				f = seq[i];
			}else{
				f = seq[i];
				ans++;
			}
		}
		return ans;
	}
}

public class FoxAndGame {

	public int countStars(String[] result) {
		int n = result.length;
		int ans = 0;
		for(int i = 0;i < n;i++){
			if(result[i].equals("ooo")){
				ans += 3;
			}else if(result[i].equals("oo-")){
				ans += 2;
			}else if(result[i].equals("o--")){
				ans += 1;
			}
		}
		return ans;
	}

}

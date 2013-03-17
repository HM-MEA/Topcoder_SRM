public class MonstersValley2 {

	public int minimumPrice(int[] dread, int[] price) {
		int ans_coins = 0;
		long total_dread = 0;
		int n = dread.length;
		for(int i = 0;i < n;i++){
			if(total_dread < dread[i]){
				total_dread += dread[i];
				ans_coins += price[i];
			}else{
				long a_dread = total_dread;
				a_dread += dread[i];
				int a_coins = 0;
				for(int j = i + 1;j < n;j++){
					if(total_dread < dread[j]&&a_dread >= dread[j]){
						a_coins += price[j];
					}
				}
				if(a_coins > price[i]){
					total_dread += dread[i];
					ans_coins += price[i];
				}
			}
		}
		return ans_coins;
	}

}

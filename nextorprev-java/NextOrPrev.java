public class NextOrPrev {

	public int getMinimum(int nextCost, int prevCost, String start, String goal) {
		int n = start.length();
		int ans = 0;
		char s[] = start.toCharArray();
		char g[] = goal.toCharArray();	
		int z = 0;
		int f = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				if(s[i] > g[i]){
					if(s[j] < g[j]){
						if(s[i] > s[j]&& s[j] > g[i]||s[i] > g[j]&&g[j] > g[i]){
							f = 1;
						}
					}else{
						if(s[i] > s[j]&&g[j] > g[i]){
							f = 1;
						}
					}
				}else if(s[i] < g[i]){
					if(s[j] > g[j]){
						if(g[i] > s[j]&& s[j] > s[i]||g[i] > g[j]&&g[j] > s[i]){
							f = 1;
						}
					}else{
						if(g[i] >= g[j]&&s[j] >= s[i]){
							f = 1;
						}
					}
				}
			}
		}
		if(f == 1)return -1;
		for(int i = 0;i < n;i++){
			if(s[i] > g[i]){
				while(s[i] != g[i]){
					s[i]--;
					ans += prevCost;
				}
			}else if(s[i] < g[i]){
				while(s[i] != g[i]){
					s[i]++;
					ans += nextCost;
				}
			}
		}
		return ans;
	}

}

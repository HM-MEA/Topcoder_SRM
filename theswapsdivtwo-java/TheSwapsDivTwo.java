public class TheSwapsDivTwo {

	public int find(int[] sequence) {
		int n = sequence.length;
		int a[] = new int[48];
		int ans = 0;
		int f = 0;
		for(int i = 0;i < n - 1;i++){
			for(int j = i + 1;j < n;j++){
				if(sequence[i] != sequence[j]){
					ans++;
				}else{
					if(a[sequence[i]] == 0&&f == 0){
						ans++;
						a[sequence[i]]++;
						f++;
					}
				}
			}
		}
		return ans;
	}

}

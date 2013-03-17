public class Chopsticks {

	public int getmax(int[] length) {
		int l = length.length;
		int a[] = new int[101];
		for(int i = 0;i < l;i++){
			a[length[i]]++;
		}
		int ans = 0;
		for(int i = 1;i < 101;i++){
			ans += a[i] / 2;
		}
		return ans;
	}

}

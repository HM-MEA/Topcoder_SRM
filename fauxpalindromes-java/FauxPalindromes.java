public class FauxPalindromes {

	public String classifyIt(String word) {
		int n = word.length();
		char c[] = new char[n];
		char cf[] = new char[n];
		c = word.toCharArray();
		int ans = 0;
		for(int i = 0;i < n;i++){
			if(c[i] != c[n - i - 1]){
				ans = 1;
			}
		}
		if(ans == 0)return "PALINDROME";
		int ans1 = 0;
		int k = 0;
		for(int i = 0;i < n;i++){
			if(i == 0){
				cf[k] = c[i];
				continue;
			}
			if(cf[k] != c[i]){
				cf[k + 1] = c[i];
				k++;
			}
		}
		for(int i = 0;i < k;i++){
			if(cf[i] != cf[k - i]){
				ans1 = 1;
			}
		}
		if(ans1 == 0)return "FAUX";
		return "NOT EVEN FAUX";
		
	}
}


public class ShoutterDiv2 {

	public int count(int[] s, int[] t) {
		int n = s.length;
		int a = 0;
		
		for(int i = 0;i < n;i++){
			for(int j = i + 1;j < n;j++){
				if(!(s[i] > t[j]||t[i] < s[j])){
					a++;
				}
			}
		}
		return a;
	}
}

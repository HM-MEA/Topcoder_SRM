public class TheArray {

	public int find(int n, int d, int first, int last) {
		int max = Math.max(first,last);
		int min = Math.min(first,last);
		int i = 1;
		int a1,a2;
		while(true){
			a1 = min + d*(n - i);
			a2 = max + d*(i - 1);
			if(Math.abs(a2 - a1) <= d)break;
			i++;
		}
		return Math.min(a1, a2);
	}

}

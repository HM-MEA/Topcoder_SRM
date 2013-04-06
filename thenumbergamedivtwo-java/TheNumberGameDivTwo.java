public class TheNumberGameDivTwo {

	public String find(int n) {
		int ans = 0;
		int a;
		while(true){
			a = find_f(n);
			if(a == n)break;
			ans++;
			n = n - a;
		}
		if(ans % 2 == 1){
			return "John";
		}else{
			return "Brus";
		}
	}
	
	int find_f(int a){
		int i;
		for(i = a / 2 ;1 < i;i--){
			if(a % i == 0)break;
		}
		if(i != 1){
			return i;
		}else{
			return a;
		}
	}
}

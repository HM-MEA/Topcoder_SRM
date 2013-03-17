public class NinjaTurtles {

	public int countOpponents(int P, int K) {
		int i = 1;
		int ans;
		while(true){
			ans = (i / 3) + (i / K) * 3;
			if(ans >= P)break;
			i++;
		}
		if(ans == P){
			return i;
		}else{
			return -1;
		}
	}
}

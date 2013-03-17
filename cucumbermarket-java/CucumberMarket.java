import java.util.*;

public class CucumberMarket {

	public String check(int[] price, int budget, int k) {
		Arrays.sort(price);
		int a = 0;
		for(int i = 0;i < k;i++){
			a = a + price[price.length - 1 - i];
		}
		if(a > budget){
			return "NO";
		}else{
			return "YES";
		}
	}

}

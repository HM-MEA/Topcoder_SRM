import java.util.Arrays;

public class PrimalUnlicensedCreatures {

	public int maxWins(int initialLevel, int[] grezPower) {
		int n = grezPower.length;
		Arrays.sort(grezPower);
		int ans = 0;
		while(true){
			if(ans == n)break;
			
			if(initialLevel > grezPower[ans]){
				initialLevel = initialLevel + grezPower[ans] / 2;
				ans++;
				
			}else{
				break;
			}
		}
		return ans;
	}
}

import java.util.Arrays;

public class ValueHistogram {

	public String[] build(int[] values) {
		int a[] = new int[10];
		Arrays.fill(a,0);
		int n = values.length;
		for(int i = 0;i < n;i++){
			a[values[i]]++;
		}
		int f = 0;
		for(int i = 0;i < 10;i++){
			if(a[i] > f)f = a[i];
		}
		String ans[] = new String[f + 1];
		Arrays.fill(ans,"");
		for(int i = f;i > 0 ;i--){
			for(int j = 0;j < 10;j++){
				if(a[j] > 0){
					ans[i] += "X";
					a[j]--;
				}else{
					ans[i] += ".";
				}
			}
		}
		ans[0] = "..........";
		return ans;
	}

}

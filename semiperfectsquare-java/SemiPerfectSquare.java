public class SemiPerfectSquare {

	public String check(int N) {
		
		for(int i = 1;Math.pow(i, 2) <= N;i++){
			if((N % Math.pow(i, 2)) == 0){
				int a = (int)(N / Math.pow(i, 2));
				if(a < i){
					return "Yes";
				}
			}
		}
	
	return "No";
	}

}

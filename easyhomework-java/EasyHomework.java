public class EasyHomework {

	public String determineSign(int[] A) {
		int n = 0;
		for(int i = 0;i < A.length;i++){
			if(A[i] < 0){
				n++;
			}else if(A[i] == 0){
				return "ZERO";
			}
		}
		if(n % 2 == 0){
			return "POSITIVE";
		}else{
			return "NEGATIVE";
		}
	}
		
}

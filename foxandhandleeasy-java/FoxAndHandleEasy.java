

public class FoxAndHandleEasy {
	public String isPossible(String S, String T) {
		int a = T.indexOf(S);
		if(a == -1)return "No";
		int le = S.length();
		StringBuilder sb = new StringBuilder();
		sb.append(T);
		sb.delete(a,a + le);
		if(S.equals(sb.toString())){
			return "Yes";
		}else{
			return "No";
		}	
	}
}

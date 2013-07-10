import java.util.TreeSet;

public class TopFox {

	public int possibleHandles(String familyName, String givenName) {
		TreeSet<String> set = new TreeSet<String>();
		for(int i = 0;i < familyName.length();i++){
			for(int j = 0;j < givenName.length();j++){
				String s = familyName.substring(0,i+1) + givenName.substring(0,j+1);
				set.add(s);
			}
		}
		return set.size();
	}

}

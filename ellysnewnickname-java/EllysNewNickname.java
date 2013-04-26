public class EllysNewNickname {

	public int getLength(String nickname) {
		int a = nickname.length();
		char n[] = new char[a];
		int ans = 0;
		int f = 0;
		
		n = nickname.toCharArray();
		for(int i = 0;i < a;i++){
			if((n[i] == 'a')||(n[i] == 'i')||(n[i] == 'u')||(n[i] == 'e')||(n[i] == 'o')||(n[i] == 'y')){
				if(f == 0){
					ans++;
					f = 1;
				}
			}else{
				ans++;
				f = 0;
			}
		}
		return ans;
	}

}

public class RobotHerbDiv2 {

	public int getdist(int T, int[] a) {
		long x = 0;
		long y = 0;
		int d = 0;
		for(int j = 0;j < T;j++){
			for(int i = 0;i < a.length;i++){
				switch(d){
				case 0: y = y + a[i]; break;
				case 1: x = x + a[i]; break;
				case 2: y = y - a[i]; break;
				case 3: x = x - a[i]; break;
				}
				d += a[i];
				d = d % 4;
				System.out.println(x + " " + y);
			}
		}
		int ans = (int)(Math.abs(x) + Math.abs(y));
		return ans;
	}

}

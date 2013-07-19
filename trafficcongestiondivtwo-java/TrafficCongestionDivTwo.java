public class TrafficCongestionDivTwo {

	public long theMinCars(int treeHeight) {
		long a[] = new long[treeHeight + 2];
		a[0] = 1;
		a[1] = 1;
		if(treeHeight == 0||treeHeight == 1){
			return a[treeHeight];
		}
		
		for(int i = 2;i <= treeHeight;i++){
			a[i] = a[i - 1] + 2 * a[i - 2];
		}
		return a[treeHeight];
	}

}

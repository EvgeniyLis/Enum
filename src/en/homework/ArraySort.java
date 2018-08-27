package en.homework;

public enum ArraySort {
	SORTUP {public void getSort(int[] num) {
		int temp;
		for (int border = 0; border < num.length-1; border++) {
			for (int i = 0; i < num.length-border-1; i++) {
				if (num[i]>num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
	}}, SORTDOWN {public void getSort(int[] num) {
		int temp;
		for (int border = 0; border < num.length-1; border++) {
			for (int i = 0; i < num.length-border-1; i++) {
				if (num[i]<num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
	}};
	
	public abstract void getSort(int[] num);
}

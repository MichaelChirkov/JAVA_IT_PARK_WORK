class Program{
	public static void main(String[] args) {
		int a[] = {4,1,7,3,9,4,2,3,4,7,8,5,4,7};
		int m = 0;
		for (int i = 1; i < a.length - 2; i++){
			if((a[i-1] < a[i]) && (a[i] > a[i+1])){
				m++;
			}
		}
		System.out.println("Kol-vo maksimumov = " + m);
	}
}


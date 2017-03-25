class Program{
	public static void main(String[] args) {
		int[] z = { 2, 4, 6, 8, 10};
		int[] x = { 3, 5, 7, 9, 11};
		int[] b;
		b = Sort.merge(z,x);

		for (int l = 0; l < b.length; l++){
			System.out.println( b[l]);
		}
	}
}
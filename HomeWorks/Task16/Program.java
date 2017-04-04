class Program {
	
	public static int fib(int temp1, int temp2, int n) {
		System.out.println("fib(" + n + ")");
		int temp3;
		if (n > 1) {
			temp3 = temp2 + temp1;
    		temp1 = temp2;
    		temp2 = temp3;
    
			return fib(temp1, temp2, n-1);
		} else {
			return temp2;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(fib(1,1,10));
	}
}
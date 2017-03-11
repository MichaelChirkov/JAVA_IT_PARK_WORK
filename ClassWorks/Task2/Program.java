class Program{
	public static int sum(int x,y){
	for (x;x<y;x++){
	x+=x;
	}
	return x;
	}

	public static void main(String[] args) {
		int a=5,b=10;
		int c=0;
		c=sum(a,b);
		System.out.println(c);
	}
}
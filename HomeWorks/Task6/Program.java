class Program{
	public static void main(String[] args) {
		
		int array[] = {2,2,6,5,5,5,7,1,9,10};
		int a,i,result=1;
		for (i=0; i<array.length;i++)
			System.out.print(" " + array[i]);
		System.out.println("");		
		for (i=0;i<array.length;i++)
			if((i%2==1)&&(array[i]%2==0)==true)
				result=result*array[i];
			
		System.out.println("Proizvedenie ravno = " +result);
	}
}
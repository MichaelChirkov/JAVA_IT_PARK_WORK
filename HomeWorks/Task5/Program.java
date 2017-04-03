class Program{
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int a,i,sum = 0;
		for (i = 0; i < array.length;i++)
			System.out.print(" " + array[i]);
		System.out.println("");		
		for (i = 0; i < array.length;i++)
			sum += array[i];
		System.out.println("Summa vceh elementov massiva = " +sum);
	}
}
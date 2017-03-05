
class Program{
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int a,i;
		for (i=0; i<array.length;i++)
			System.out.print(" " + array[i]);
		System.out.println("");
		int b=array.length;
		for (i=0;i<(b/2);i++){
			int temp = array[b-i-1];
			array[b-i-1]=array[i];
			array[i]=temp;
		}
		for (i=0; i<array.length;i++)
			System.out.print(" " + array[i]);
	}
}
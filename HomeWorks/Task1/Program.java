import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, sum=0,k=0;
		a = scanner.nextInt();
		while (a != -1){
			for (int i=2; i<a ;i++){				
				if (a%i==0){
				k++;
				}			
				if(k==0){ 				
				sum +=a;
				} 					
				a= scanner.nextInt();
				k=0;
			}
		}
		System.out.println("Summa vcex chisel ravna " +sum);
	}
}
import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, sum = 0,k = 1;
		a = scanner.nextInt();
		while (a != -1){			
				if(k%2 == 0){ 				
				sum += a;
				} 					
				a = scanner.nextInt();
				k++;
			
		}
		System.out.println("Summa vcex chisel stoyashih na chetnyh poziciyah ravna " +sum);
	}
}
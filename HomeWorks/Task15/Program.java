import java.util.Scanner;

	class Program{

		public static int fun(int b){
			int sum=0;
			while (b!=0){ 
				sum +=b%10; //накапливаем сумму цифр числа
				b=b/10;
			}
			return sum;	
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		System.out.println("Summa cifr chisla ravna = " + fun(a));
		}
	}
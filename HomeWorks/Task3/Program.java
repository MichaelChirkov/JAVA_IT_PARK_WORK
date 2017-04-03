import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, sum = 0,result = 1, k = 0, b;
		a = scanner.nextInt();
		while (a != -1){
			b=a;
			while (b! = 0){ 
				sum +=b%10; //накапливаем сумму цифр числа
				b = b/10;
			}						
			for (int i = 2; i < sum ;i++){		 // проверяем сумму цифр числа		
				if (sum%i == 0){
					k++;
				}
			}
				if(k == 0){  // если простая умножаем
					result = result * a;
				} 
				
				k =sum = 0;		
				a = scanner.nextInt();			
		} 
		System.out.println("proizvedenie ravno " +result);
	}
}
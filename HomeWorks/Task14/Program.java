import java.util.Scanner;

class Program{

	public static boolean fun(int b){
		String c;
		int k=0;
		for (int i = 2; i < b ; i++){				
				if (b%i == 0)
				k++;
			}	
			System.out.println();		
			if(k==0) 			
			return	true;
			else			
			return	false;
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println();
		a = scanner.nextInt();
		if(fun(a) == true)
			System.out.println("Chislo " + a +" yavlyaetsya prostbim");
		else			
			System.out.println("Chislo " + a +" ne yavlyaetsya prostbim");
		System.out.println();	
	}
}
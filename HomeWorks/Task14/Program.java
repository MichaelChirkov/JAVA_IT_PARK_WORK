import java.util.Scanner;

class Program{

	public static String fun(int b){
		String c;
		int k=0;
		for (int i = 2; i < b ; i++){				
				if (b%i == 0)
				k++;
			}	
			System.out.println();		
			if(k==0) 				
			//System.out.println("Chislo " + b + " prostoe\n");
			return	c="Chislo yavlyaetsya prostbim";
			else
			//System.out.println("Chislo " + b + "  ne yavlyaetsya prostbim \n");
			return	c="Chislo ne yavlyaetsya prostbim";

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println();
		a = scanner.nextInt();
		System.out.println(fun(a));	
		System.out.println();	
	}
}
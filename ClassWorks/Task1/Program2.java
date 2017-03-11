import java.util.Scanner;

class Program{

public static void main(String[] args) {
	int a={1,2,3,4,5,60};
	int index=-1;
	Scanner scanner = new Scanner(System.in);
int x=scanner.nextInt();
		for (int i=0;i<a.lenght;i++){
		if (x==a[i]){
		index=i;
		}

	}
	System.out.println(index);
}
}




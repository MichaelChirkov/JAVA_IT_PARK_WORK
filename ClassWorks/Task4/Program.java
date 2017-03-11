import java.util.Random;
class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		int num=0;
		Random random = new Random();

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
		}

		for(int i = 0; i < 100; i++) {
			System.out.println(ages[i]);
		}

		// вывести на экран количество людей, с возрастами от 0 до 120
		int b[][]=new int[2][1000];
		for (int i=0;i<b.length;i++){ //
			b[0][i]=ages[i];
			b[1][i]=0;
		}

		
			for (int i=0;i<b.length;i++){
			if (i==b[0][i]){
				b[1][i]+=1;
			}
		

		}


		for (int i=0;i<2;i++){
			for (int j=0;j<1000;j++){
				System.out.println(b[i][j]);
			}
			System.out.println();
		}

	}
}
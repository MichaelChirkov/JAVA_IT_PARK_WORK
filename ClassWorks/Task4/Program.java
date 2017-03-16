import java.util.Random;
class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		Random random = new Random();
		int kol[] = new int[121];

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
		}

		for(int i = 0; i < 100; i++) { // 100
			System.out.println(ages[i]);
		}

		for (int j = 0; j<121; j++){ // возраста от 0 до 120
				for(int i = 0; i < ages.length; i++){ // подсчет по всему массиву ages[]
					if (j == ages[i]){
					kol[j] += 1;
					}
			}
		}
		for (int i=0; i<121; i++)
			System.out.println(i + " - " +kol[i] );
		
	}
		// вывести на экран количество людей, с возрастами от 0 до 120
		

}

	class Program{

		public static double arif(int b[][]){
			int kol = 0;
			double sum = 0;
			for (int i = 0;i < b.length; i++){
				for (int j = 0; j < b[0].length; j++){					
						sum += b[i][j];
						kol++;
					}

				}
			return sum/kol;
		}
			
		



		public static void main(String[] args) {
			int a[][] = {{2,3,3,5},
						 {2,5,7,8},
						 {5,6,2,5},
						 {4,5,5,9}};
			System.out.println("Srednee arif matrici = " + arif(a)); 
			
		}

	}
	class Program{

		public static void min(int b[][]){
			int minimum = 0;			
			for (int i = 0;i < b.length;i++){
				minimum = b[i][0];
				for (int j = 0; j < b[0].length-1; j++){					
					if (b[i][j] < minimum){
						minimum = b[i][j];
					}					
				}				
			System.out.println("V stroke "+(i+1)+ " minimum = " +minimum);
			}			
		}
			
		public static void main(String[] args) {
			int a[][] = {{9,6,3,5},
						 {6,5,7,8},
						 {5,6,2,5},
						 {4,5,7,9}};
			min(a);
			
		}
	}

	 
	class Program{

		public static void funv(int b[][]){
						
			for (int i = 0;i < b.length; i++ ){				
				for (int j = 0; j < b[0].length; j++ ){					
					if (i == j)
						b[i][j] = 0;
										
				}				
			}			
		}
			
		public static void main(String[] args) {
			int a[][] = {{9,6,3,5},
						 {6,5,7,8},
						 {5,6,2,5},
						 {4,5,7,9}};
			funv(a);
			for (int i = 0; i < a.length; i++ ){	
				System.out.println();			
				for (int j = 0; j < a[0].length; j++ ){
					System.out.print(a[i][j] + " ");
				}
			}
		}
	}

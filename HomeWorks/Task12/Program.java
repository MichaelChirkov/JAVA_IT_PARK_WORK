class Program{

		public static void funv(int b[][],int d[][]){
			int i,l;			
			for (int k = 0, j = 0; k < b.length; k++, j++){ // А					
				i=0;		
				for (l = b[0].length-1, i = 0; l >= 0 ; l--, i++ ) { //А					
					d[i][j] = b[k][l];																	
				}				
			}		
		}
			
		public static void main(String[] args) {
			int a[][] = {{9,6,3,5},
						 {6,5,7,8},
						 {5,6,2,5},
						 {4,5,7,9}};
						 						 
			int c[][]= new int[a.length][a[0].length];
			
			funv(a,c);
			for (int i = 0; i < c.length; i++ ){	
				System.out.println();			
				for (int j = 0; j < c[0].length; j++ ){
					System.out.print(c[i][j] + " ");
				}
			}
		}
	}

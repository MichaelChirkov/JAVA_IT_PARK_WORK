class Program{

		public static void funv(int b[][],int d[][]){
			int i;
			int j=0;
			for (int k = 0; k < b.length; k++){ // А	
				j++;
				i=0;		
				for (int l = b[0].length-1; l >= 0 ; l-- ) { //А					
					d[i][j] = b[k][l];	
					i++;													
				}				
			}		
		}
			
		public static void main(String[] args) {
			int a[][] = {{9,6,3,5},
						 {6,5,7,8},
						 {5,6,2,5},
						 {4,5,7,9}};
						 						 
			int c[][]= new int[a.length][a[0].length];
			for (int i = 0; i < c.length; i++ ){					
				for (int j = 0; j < c[0].length; j++ ){
					c[i][j]=0;
				}
			}
			
			funv(a,c);
			for (int i = 0; i < c.length; i++ ){	
				System.out.println();			
				for (int j = 0; j < c[0].length; j++ ){
					System.out.print(c[i][j] + " ");
				}
			}
		}
	}

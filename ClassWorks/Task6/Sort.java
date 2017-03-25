class Sort{
 public static int[] merge(int a[], int b[]){

    int[] c = new int[(a.length + b.length)];
 	int k = 0, i = 0, j = 0;
	 while (( i < a.length) && (j < b.length)){
	 		if (a[i] >= b[j]){
	 			c[k] = b[j];
	 			k++; 
	 			j++;
	 		}
	 		if (a[i] <= b[j]){
	 			c[k] = a[i];
	 			k++;
	 			i++;
	 		}

	 	}

	 	while (i < a.length){
	 		c[k] = a[i];
	 		k++;
	 		i++;
	 	}

	 	while (j < b.length){
	 		c[k] = b[j];
	 		k++;
	 		j++;
	 	}
	 

  return c;
 }


}
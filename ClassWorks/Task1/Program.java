class Program{
	public static void main(String[] args) {
		int a[]={-3,10,11,12,15,-5};
		int min=a[0]; 
	  int minn=maxx=0;
		for (int i=0;i<a.length;i++){
			if (min>a[i]){
				min=a[i];
				minn=i;
			
			}
		}
		int max=a[0];
		for (int i=0;i<a.length;i++){
			if (max<a[i]){
				max=a[i];
				maxx=i;
			}
			
		}
		int temp;
		temp=a[minn];
        a[minn]=a[maxx];
        a[maxx]=temp;
   

        for (int i=0;i<a.length;i++)
         System.out.println(a[i]);
       

	}
}
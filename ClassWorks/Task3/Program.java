class Program{
	public static void fun(int x[]){
		int temp=0;
		for (int i=x.length;i>0;i--){
			for (int j=0;j<x.length-1;j++){
				if(x[j]>x[j+1]){
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;

				}
			}
		}

	}

public static void main(String[] args){
	int b[]={9,8,7,6,5,6,3,2};
	fun(b);
	for (int i=0;i<b.length;i++){
		System.out.println(b[i] + " ");
	}
}

	}

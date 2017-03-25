class RationalNumber {
	int numerator;
	int denominator;
	RationalNumber() {
		numerator = 0;
		denominator = 1;
	}
	RationalNumber(int a,int b){
		numerator = a;
		denominator = b;
	}

	public double normalize(){
		return (double)numerator/denominator;
	}
}

class Program{
	public static void main(String[] args) {
		RationalNumber nubmer1 = new RationalNumber();
		RationalNumber number2 = new RationalNumber(9,2);

		System.out.println( nubmer1.numerator + " " + nubmer1.denominator);
		System.out.println( number2.numerator + " " + number2.denominator);

		System.out.println("rezylbtat normalizacii number 1= " + nubmer1.normalize());
		System.out.println("rezylbtat normalizacii number 2= " + number2.normalize());
		
	}
}
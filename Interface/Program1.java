//Pure Abstract class : SRS(Software requirement Specification)
interface ICalculator{

	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
	void div(int a,int b);
}
//Implemented Class : Concreate Class
class CalculatorImpl implements ICalculator{

	@Override
	public void add(int a,int b){
		int sum = a + b;
		System.out.println("The sum is : "+sum);
	}
	@Override
	public void sub(int a,int b){
		int diff = a + b;
		System.out.println("The sub is : "+diff);
	}
	@Override
	public void mul(int a,int b){
		int res = a * b;
		System.out.println("The multiplication is : "+res);
	}
	@Override
	public void div(int a,int b){
		int quotient = a + b;
		System.out.println("The division is : "+quotient);
	}
}
class Program1{

	public static void main(String[] args){

		//Creating Reference of ICalculator
		ICalculator calc;

		calc = new CalculatorImpl();

		//Calling the method based on runtime object
		calc.add(10,20);
		calc.sub(10,20);
		calc.mul(10,20);
		calc.div(10,20);
	}
}
/*
 *The sum is : 30
 *The sub is : 30
 *The multiplication is : 200
 *The division is : 30
*/


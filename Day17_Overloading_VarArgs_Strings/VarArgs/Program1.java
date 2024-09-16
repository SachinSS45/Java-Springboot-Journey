/*
 * Var-Args(Variable no of arguments method)
 * ->Until 1.4v we can't declare a method with variable no of args.
 * ->if there is a change in no of args compulsory we have to define a new method
 * ->This approch increses the length of the code and reduces the readability
 * ->From 1.5v onwards we can declare a method with variable no of args. such type of method are called as "VAR-ARGS METHODS"
 *  Syntax : 
 *  	   access_modifier return_Type(TypeOFData ...variableName){
 *		
 *		//body
 *  	   }
 */

public class Program1{
	
	public void m1(int ...v){
		System.out.println("Var-Arg Method");
	}
	public static void main(String[] args){

		Program1 p = new Program1();
		p.m1();//Var-Arg Method
		p.m1(10);//Var-Arg Method
		p.m1(10,20);//Var-Arg Method
		p.m1(10,20,30);//Var-Arg Method
		p.m1(10,20,30,40);//Var-Arg Method
	}
}

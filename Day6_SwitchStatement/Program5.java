//Duplicate case label are not allowed in switch

public class Program5{

	public static void main(String[] args){

		int x = 10;

		switch(x){

			case 97 : 
			case 99 : 
			case 'a': //CE :  Duplicate case label 'a' becz 'a' Unicode value is 97 
			case 97 : //CE :  Duplicate case label 97 
		}
	}
}

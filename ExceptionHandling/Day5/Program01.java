/*This code tells about : 
 * UserDefined/Custom Exception :(Project Level) 
 *  
 * Driving License Generator App : ageFactor
 *
 * if age>60:: TooOldAgeException
 * if age<18:: TooYoungAgeException
 * OtherWise : issue DL by checking the skill of driving
 *
 * Exception -> CheckedException(partial,fully),UncheckedException
 * CustomException -> UncheckedException (Based on input processing should happen)
 		 RuntimeException should be parent of that 
 * 
 */
import java.util.Scanner;
class TooOldAgeException extends RuntimeException{
	
	TooOldAgeException(String msg){
		super(msg);//Calling parent constructor 
	}
}

class TooYoungAgeException extends RuntimeException{
	
	TooYoungAgeException(String msg){
		super(msg);
	}
}
public class Program01{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the candidate :: ");
		int age = sc.nextInt();
		if(age>60){
			throw new TooOldAgeException("Sorry DL can't be issued for senior citizen people");
		}else if(age<18){
			throw new TooYoungAgeException("Sorry DL can't be issued for minor candidates");
		}else{
			System.out.println("You will get DL soon in registered email...");
		}
	}
}

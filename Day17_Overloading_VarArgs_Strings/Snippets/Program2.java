public class Program2{

	public static void main(String[] args){

		int score = 60;
		switch(score){

			default : 
				System.out.println("Not a valid score");
			case score < 70://CE : boolean can't be converted into int
				System.out.println("Failed");
			case score >= 70:
				System.out.println("Passed");
				break;
		}
	}
}

public class Program1{

	public static void main(String[] args){

		String[] arr[] = { {"%","***"},{"!!!!","@@@@","####"}};

		for(String str[]:arr){
			
			for(String s:str){

				System.out.println(s);
				if(s.length()==4)
					break;
			}
			break;
		}

		//Output : % 
		//         ***
	}
}

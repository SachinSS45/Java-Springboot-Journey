interface IRemote{
	//public static final
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;
}

public class Program3 implements IRemote{

	public static void main(String[] args){

		int MIN_VOLUME = -5;
		System.out.println(MIN_VOLUME);
	}
}

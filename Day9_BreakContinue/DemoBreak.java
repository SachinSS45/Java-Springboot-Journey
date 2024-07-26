/* Here we will learn about break statement in java : 
	Break statement
 		a. Inside switch to avoid fallthrough
 		b. Inside loops to break the loop based on some condition
 		c. Inside label block to break label block execution based on some condition.
*/

public class DemoBreak {

	public static void main(String[] args) {

		// 1. break is used to avoid "fallthrough" in switch.
		int x = 0;
		switch (x) {
			case 0:
				System.out.println("hello");
				break;
			case 1:
				System.out.println("hiee");
		}
		// 2. we can use break inside loop to break the loop based on some condition.
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);// 0 1 2 3 4
		}

		// 3 . break can be used along with blocks also.
		int x1 = 10;
		l1: {
			System.out.println("begin");
			if (x1 == 10)
				break l1;
			System.out.println("end");
		}
		System.out.println("hello");
		// output : begin hello

		// Note: break can be used inside "switch or loop", any other places if we try
		// to use it results in "CompileTime-Error."
		int x2 = 10;
		System.out.println("hello");
		if (x2 == 10)
			//break;//break cannot be used outside of a loop or a switch
		System.out.println("hiee");
	}
}

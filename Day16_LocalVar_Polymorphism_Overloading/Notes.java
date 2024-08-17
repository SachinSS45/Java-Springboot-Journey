/*
Poliymorphism : 1 thing many forms
  - We can also called overloading

  - Two types of polymorphism is present : 1)Method overloading 2)Method Overriding
  - Method Overloading , Compile Time polymorphism , compile Time Binding and Early binding all are same
  - Method overloading takes place in same class
  - For method overloading method name should be same but change in method signature is compulsory 
  - In overloading compiler is responsible becz it will bind methods at compile time only based on signature
  - Steps of matching/binding : 
  	1. Search for exact match
	2. for the arg type perform typepromotion to it's best binding
	3. if doing step 2 also not able to bind even after type promotion then code would
	   result in "CE"
  - Promotion : 
  	byte -> short -> int -> long -> float -> double
	                  ^
			  |
			 char
  - If method doesn't match it will give error like : "No sutaible method found"
  - Primitve -> Exact match(primitive) -> Typecasting -> bind
  - Primitve -> no exact match -> no typecasting -> wrapper classes -> bind

  Note : 
    1.while resolving overloaded methods exact match will get highest priority
    2.while resolving overloaded methods, child class will get more priority than parent class.
    3.while resolving overloaded methods, if both the class from child level only, then it would      result only in "CE".

    Ex : 1
 */    
    class Test{

	    public void m1(String s){
		    System.out.println("String version");
	    }

	    public void m1(Object o){
		    System.out.println("Object version");
	    }

	    public static void main(String[] args){

		    Test t = new Test();

		    t.m1("Sachin");//(Exact match found) //String version
		    t.m1(new Object());//(Exact match found) //Object version

		    t.m1(null);// No it is matching to both String and Object becz both will 
			       // have default value 'null'
			       // But String is child class of Object class so String will get
			       // Priority more than Object.
	    }
    }


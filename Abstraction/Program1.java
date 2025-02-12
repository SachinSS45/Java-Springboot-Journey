//Note : In abstract class we can both abstract and concreate methods 
//	 We can't create object of abstract class we can crate ref of abstract class
//	 We can't write abstract varaibles in abstract class becz varaible needs memory and we can't write incomplete varaibles

//This code is about how we can write and abstract class & how we can override method of abstract class
abstract class Vehicle{
	
	//abstract method
	public abstract int getNoOfWheels();
	
	//concrate method
	public void infoAboutVehicle(){

		System.out.println("Genric Information ...");
	}
}

//Inheriting Vehicle class 

class Bus extends Vehicle{
	
	@Override // We are overriding concrate method of vehicle class
	public void infoAboutVehicle(){
		System.out.println("Vovlo Bus..");
	}
	
	@Override //we need to give body to abstract method
	public int getNoOfWheels(){
		return 7;
	}
}

public class Program1{

	public static void main(String[] args){

		Vehicle v = new Bus();
		v.infoAboutVehicle();
		System.out.println("No Of wheels in Bus : " + v.getNoOfWheels());
	}
}
//Output : Vovlo Bus...   
//         No of wheels in Bus

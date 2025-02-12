//Realtime example of Shape and type of shape

import java.util.Scanner;
abstract class Shapee{
	
	//To store area of shapes
	public float area;
	
	//abstarct method
	public abstract void input();
	public abstract void calArea();
	
	//concreate method : It will used to display the area (Genric Method)
	public void disp(){
		System.out.println("Area is : " + area);
	}
}

class Square extends Shapee{

	private float length;
	
	@Override
	public void input(){
		//We should take input from user of length of sides of square
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		length = sc.nextFloat();
	}

	@Override
	public void calArea(){
		area = length*length;
	}
}

class Circle extends Shapee{

	private float radius;
	
	@Override
	public void input(){
		//We should take input from user of radius of circle
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		radius = sc.nextFloat();
	}

	@Override
	public void calArea(){
		area = 3.1414f*radius*radius;
	}
}
	
public class Program3{

	public static void main(String[] args){

		//Cratating reference of Shapee class
		Shapee s;

		//Creating object of Square class
		s = new Square();
		s.input();
		s.calArea();
		s.disp();

		//Creating object of Circle class
		s = new Circle();
		s.input();
		s.calArea();
		s.disp();
	}
}








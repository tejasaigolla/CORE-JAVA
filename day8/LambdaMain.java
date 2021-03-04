
public class LambdaMain {

 

	public static void main(String[] args) {

		Demoable dm=(a,b)-> a+b;

		int a=dm.add(10, 20);

		int b=dm.add(500, 500);

		System.out.println("Addition: "+a);

		System.out.println("Addition: "+b);

		

	}

 

}

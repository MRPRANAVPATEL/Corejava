public class Pro3{
	public static void main(String[] agrs) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		int biggest = num1;
		
		if (num2 > biggest) {
			biggest = num2;
		}
		
		if (num3 > biggest) {
			biggest = num3;
		}
		System.out.println("the biggest num is:  " + biggest);
	}
		
}
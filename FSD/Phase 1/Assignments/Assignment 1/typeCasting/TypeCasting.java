/*Write a program which will take a string as input and will convert it into other 
 primitive data types.*/
package typeCasting;

public class TypeCasting
{

	public static void main(String[] args) 
	{
		String str = "100";
		System.out.println("String is :"+str);
		byte number=Byte.parseByte(str);
		System.out.println("String to Byte Conversion :"+number);
		int number1= Integer.parseInt(str);
		System.out.println("String to Integer Conversion :"+number1);
		Float number2=Float.parseFloat(str);
		System.out.println("String to Float Conversion :"+number2);
		double number3=Double.parseDouble(str);
		System.out.println("String to Double Conversion :"+number3);
	}

}

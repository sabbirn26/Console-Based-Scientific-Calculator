import java.util.Scanner;
import java.io.*;
public class Cal
{
	public static void main(String[] args)
	{
		
		try
        {
			Scanner s = new Scanner(System.in);
			System.out.println("Welcome to the simple calculator!\n");
			System.out.print("Enter first numbers X:");
			double a = s.nextDouble();
			System.out.print("Enter second numbers Y:");
			double b = s.nextDouble();
			ScientificCalculator obj1= new ScientificCalculator(a,b);
			FileWriter ff = new FileWriter("ResultHolder.txt",true);
			PrintWriter xx = new PrintWriter(ff);
			Scanner ss= new Scanner(System.in);
			System.out.println("Instruction!\n1. Enter sum for summation.\n2. Enter sub for subtraction.\n3. Enter mul to multiply.\n4. Enter div to division.\n5. Enter pow for X power Y.\n6. Enter square for X power 2.\n7. Enter cube for X power 2.\n8. Enter log for log(X).\n9. Enter mod for X%Y.\n");
			System.out.print("How many operation want to perform: ");
			int num=s.nextInt();
			for(int i=1;i<=num;i++)
            {
				System.out.println("Enter the operation: ");
				String operation = ss.nextLine();
                if(operation.equalsIgnoreCase("sum"))
                {
                    xx.print("The summation is: ");
					xx.println(obj1.add());
					
                }
                else if(operation.equalsIgnoreCase("sub"))
                {
                    xx.print("The subtraction is: ");
					xx.println(obj1.subtract());
                }
                else if(operation.equalsIgnoreCase("mul"))
                {
                    xx.print("The multiplication is: ");
					xx.println(obj1.multiply());
                }
                else if(operation.equalsIgnoreCase("div"))
                {
                    xx.print("The divition is: ");
					xx.println(obj1.divide());
                }
                else if(operation.equalsIgnoreCase("pow"))
                {
                    xx.print("X to the power Y is: ");
					xx.println(obj1.toThePow());
				}
				else if(operation.equalsIgnoreCase("square"))
				{
					xx.print("Square of X: ");
					xx.println(obj1.square());
				}
				else if(operation.equalsIgnoreCase("cube"))
				{
					xx.print("Cube of X: ");
					xx.println(obj1.cube());
				}
				else if(operation.equalsIgnoreCase("log"))
				{
					xx.print("Log of first number is: ");
					xx.println(obj1.log());
				}
				else if(operation.equalsIgnoreCase("mod"))
				{
					xx.print("Mod is: ");
					xx.println(obj1.mod());
                }
			}
			xx.close();
			System.out.println("File input done!");
			
			System.out.println("Reading from BufferedReader:");
			String output;
			FileReader rr = new FileReader("ResultHolder.txt"); 
			BufferedReader reader = new BufferedReader(rr); 
			while((output = reader.readLine()) !=null)
			{
				System.out.println(output);
			}
		}
		catch(Exception e)
        {
            System.out.print("Error occurred");
            e.printStackTrace();
        }
	}
}
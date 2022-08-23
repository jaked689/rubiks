import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) throws FileNotFoundException
	{
		Cube c=new Cube();
		
		Scanner scan=new Scanner(System.in);
		
		String inp="";
		System.out.println("Enter what the white face looks like:");
		inp+=scan.nextLine();
		
		System.out.println("Enter what the blue face looks like:");
		inp+=scan.nextLine();
		
		System.out.println("Enter what the orange face looks like:");
		inp+=scan.nextLine();
		
		System.out.println("Enter what the green face looks like:");
		inp+=scan.nextLine();
		
		System.out.println("Enter what the red face looks like:");
		inp+=scan.nextLine();
		
		System.out.println("Enter what the yellow face looks like:");
		inp+=scan.nextLine();
		
		c.setFaces(inp);
		/*"OYR"
		+ "RWW"
		+ "OYG"
		
		+ "WGO"
		+ "YBW"
		+ "YGR"
		
		+ "YOW"
		+ "BOO"
		+ "WOW"
		
		+ "GBB"
		+ "BGO"
		+ "OBB"
		
		+ "YGG"
		+ "YRR"
		+ "YWR"
		
		+ "GWB"
		+ "RYG"
		+ "RRB"*/
		Solver s=new Solver(c);
		s.solve();
		s.get();
	}
	public static void reveal(String a)
	{
		Scanner scan=new Scanner(System.in);
		while(a.length()>0)
		{
			if(scan.nextLine().equals(""))
			{
				System.out.print(a.substring(0,1));
				a=a.substring(1);
			}
		}
			
	}
}
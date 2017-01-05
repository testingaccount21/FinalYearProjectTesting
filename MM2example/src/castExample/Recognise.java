package castExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Recognise {

	private static List bugCollect = new ArrayList();
	private static int bugCount=0;
	private static Boolean BUG = false;
	
	public static void main(String[] args)
	{
		System.out.println("BUG:  int f = (int)(Math.random()*101)*100; //ERROR: cast is higher priority than multiply");
		System.out.println("-------------------------------------------------------------------------------------");
		double testing = Math.random();
		double testingt100 = testing*100;
		int testingint = (int)testing;
		int desired = (int)testingt100;
		int actual = (int)testing*100;
		System.out.println("Math.random() returns a number between 0 and 1 for example: " + testing + 
							"\nThe coder was looking to to multiply this random double by 100 which would have returned: " + testingt100 +
							"\nand then round it to the nearest lesser integer through casting: " + desired +
							"\nbut because the cast has a higher priority what the program actually did was cast the Math.random() result to an integer first: " + testingint +
							"\nwhich will always result in 0, and then multiply 0 by 100: " + actual +
							"\n      i.e the coders random number is always 0");
		
		System.out.println("\n The bug my code should look for is (int)math.random() in that exact sequence with no other brackets etc \n" );
		
		try {
			Read();
		} catch (IOException e) {
		
		}
	}
	
	public static void Read() throws IOException
	{
			String print = null;
			RandomAccessFile accessFile = new RandomAccessFile("TestRead.txt", "rw");
			
			for (int i=1; i<accessFile.length(); i++)
			{
				try{
					 print = accessFile.readLine();
					System.out.println(print);
					
					if ( !(print.equals(null)) & print.contains("(int)(Math.random()*101)"))
\\equals method comparing different varTypes
						BUG = true;
						bugCollect.add(print); 
						bugCount++;
					}
				}
					
				catch (NullPointerException e)
				{
						i = (int) (accessFile.length()*2);
						Report();
				}
					
			}

	}
	
	public static void Report()
	{
		if(BUG)
		{
			System.out.println("There were " + bugCollect.size()+ " bugs found");
			 for(int j = 0; j < bugCollect.size(); j++) {
		            System.out.println(bugCollect.get(j));
		        }
		}
		else
		{
			System.out.println("NO BUGS FOUND");
		}
	}
}

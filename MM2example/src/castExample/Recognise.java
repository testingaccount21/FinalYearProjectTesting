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
		double testing = Math.random();
		double testingt100 = testing*100;
	        System.out.println("enter regex: ");
	        	
	            Pattern pattern =Pattern.compile(in.nextLine());
	            
	            System.out.println("enter string ");
	            Matcher matcher =pattern.matcher(in.nextLine());

	            boolean found = false;
	            while (matcher.find())
		    {
	                System.out.println("I found the text '" +
	                    matcher.group()+ "' starting at " + matcher.start() +
	                    "index,and ending at index " + matcher.end());
	                 
	                found = true;
	            }
	            if(!found){
	                System.out.println("No match found");
		    }
		
		if(testingt100==Double.NaN)
		{
			System.out.println("This is not a numbr");
			bugCount++;
			
		}
		
		
		
	}
}

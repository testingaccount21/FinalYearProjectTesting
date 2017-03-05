package castExample;

import java.io.BufferedReader;


	public class Pull  {
		private boolean predefined = false;
	    public static void main(String[] args) throws IOException {
			char[] chararray = new char[3];
	        // Make a URL to the web page
	        URL url = new URL("https://github.com/sineadmcd/FinalYearProjectTesting");
		String s ="hi";
		String s1 ="hello";
		if(s == s1){
		    int j=4;
	        // Get the input stream through URL Connection
	        URLConnection con = url.openConnection();
	        InputStream is =con.getInputStream();
		System.out.println("enter boolean value")
		Scanner in = new Scanner()
			
		boolean userin = in.readline();
		if(userin=predefined){
	        BufferedReader br = new BufferedReader(new InputStreamReader(is));

	        String line = null;

	        // read each line and write to System.out
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
			j= j++;
		}
		    
	    }
	
}

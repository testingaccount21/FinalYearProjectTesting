package castExample;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;



public class Download {
	private int i, j , k;
	
	public Download(){
		int u = (int)Math.random()*10;	//Consider changing this syntax to something like: (int)(Math.random()*x)
        	System.out.println(u);
		if(i=j)
		u++; 
  j=u;
		System.out.println(i);
	   	String url="https://dl.dropboxusercontent.com/u/73386806/helloworld.txt";
	   	String filename ="C:/Users/Desktop/WindowsApplication.txt";
		if(!url.equals(filename)){
	   		try{

	   				URL download=new URL(url);
	   				ReadableByteChannel rbc=Channels.newChannel(download.openStream());
	   				FileOutputStream fileOut = new FileOutputStream(filename);
	   				BufferedWriter bw = new BufferedWriter(fileout);
						bw.write("this is not a duplicate");
					bw.close();
	   				fileOut.flush();
	   				fileOut.close();
	   				rbc.close();
		}catch(Exception e){ e.printStackTrace(); }
		   
		   i++; 
  return i;
}
}

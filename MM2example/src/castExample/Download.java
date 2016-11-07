package castExample;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download {
	private int i, j , k;
	   public static void main(String[] args){
	int u = (int)(Math.random()*101)*100;
        System.out.println(u);
	   int i = 0;
		   
	   	String url="https://dl.dropboxusercontent.com/u/73386806/Prune%20Juice/Prune%20Juice.exe";
	   	String filename ="PruneJuice.exe";
	long l;
	   		try{
				short s = (short)(Math.random()*101)*100;
	   				URL download=new URL(url);
	   				ReadableByteChannel rbc=Channels.newChannel(download.openStream());
	   				FileOutputStream fileOut = new FileOutputStream(filename);
	   				fileOut.getChannel().transferFrom(rbc, 0, 1 << 24);
	   				fileOut.flush();
	   				fileOut.close();
	   				rbc.close();
	}catch(Exception e){ e.printStackTrace(); }
}

}

import java.io.*;
import java.net.*;


public class MyClient {
	public static void main(String args[])throws Exception{
		try {
			Socket S = new Socket("localhost",3333);
			DataInputStream din = new  DataInputStream(S.getInputStream());
			DataOutputStream dout = new DataOutputStream(S.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String Str = "",Str2 = "";
			while(!Str.equals("stop")) {
				Str = br.readLine();
				dout.writeUTF(Str);
				dout.flush();
				Str2 = br.readLine();
				System.out.println("server says:"+Str2);
			}
			dout.close();
			S.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
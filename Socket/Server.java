import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[])throws Exception{
		try {
			ServerSocket SS = new ServerSocket(3333);
			Socket S = SS.accept();
			DataInputStream din = new DataInputStream(S.getInputStream());
			DataOutputStream dout = new DataOutputStream(S.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String Str = "",Str2 = "";
			while(!Str.equals("stop")) {
				Str = din.readUTF();
				System.out.println("client says:"+Str);
				Str2 = br.readLine();
				dout.writeUTF(Str2);
				dout.flush();
				
			}
			din.close();
			S.close();
			SS.close();		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

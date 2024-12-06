import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class Slave extends Thread {
    Socket s1;

    public Slave (Socket s) {
        this.s1 = s;
    }

    public void run() {
        int n = LoadBalancer.rand.nextInt(LoadBalancer.nbHosts);

        Socket s2;

        try {
            s2 = new Socket(LoadBalancer.hosts[n],LoadBalancer.ports[n]);

            InputStream s1_in = s1.getInputStream();
            OutputStream s1_out = s1.getOutputStream();

            InputStream s2_in = s2.getInputStream();
            OutputStream s2_out = s2.getOutputStream();
    
            byte[] buff = new byte[1024];
            int nblu;
    
            nblu = s1_in.read(buff);
            s2_out.write(buff, 0, nblu);
    
            nblu = s2_in.read(buff);
            s1_out.write(buff, 0, nblu);

            s2.close();
            s1.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

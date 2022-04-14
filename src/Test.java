import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.HttpServer;

public class Test {

	public static void main(String[] args) throws IOException {
		
			InetSocketAddress addr = new InetSocketAddress(9000);
			HttpServer server = HttpServer.create(addr, 0);
			
			server.createContext("/", new MyHandler());
			server.setExecutor(Executors.newCachedThreadPool());
			server.start();
		

	}

}

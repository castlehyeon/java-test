import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class MyHandler implements HttpHandler {
	private String root = "C:\\Users\\qnftk\\Desktop\\java22\\2022school\\Like-lion\\portfolio_html";
	
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		String requestMethod = exchange.getRequestMethod();
		if (requestMethod.equalsIgnoreCase("GET")){
			Headers responseHeaders = exchange.getResponseHeaders();
			//css, img를 불러오기 위해 수정
			responseHeaders.set("Content-Type", "text/html; charset=UTF-8");
			URI uri = exchange.getRequestURI();
			System.out.println(uri.getPath());
			OutputStream responseBody = exchange.getResponseBody();
			BufferedReader br = new BufferedReader(new FileReader(root + uri.getPath()));
			exchange.sendResponseHeaders(200, 0);
			int b = 0;
			
			String str;
			while((str = br.readLine()) != null){
				responseBody(str);
			}
		
			responseBody.close();
		}
	}
}

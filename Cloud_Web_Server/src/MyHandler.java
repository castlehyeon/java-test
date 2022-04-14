import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

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
			
			Writer out = new OutputStreamWriter(exchange.getResponseBody(), "UTF-8");
		
			OutputStream responseBody = exchange.getResponseBody();
			
			BufferedReader br = new BufferedReader(new FileReader(root + uri.getPath()));
			exchange.sendResponseHeaders(200, 0);
			
			
			
			String words= "";
			String str;
			while((str = br.readLine()) != null){
				words += str+"\n";
				System.out.println(str);
				
//				strBuffer= str.getBytes("utf-8");
//				responseBody.write(strBuffer);
			}
			out.write(words);	
//			byte[] bytes = words.getBytes();
//			responseBody.write(bytes);
			
//			br.close();
		
			responseBody.close();
		}
		
	}
}

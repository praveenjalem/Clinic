package test.xmlrpc.webserver;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.webserver.ServletWebServer;
import org.apache.xmlrpc.webserver.XmlRpcServlet;

public class MyServletServer {
	private static final int PORT = 8080;
	
	public static void main(String[] args) throws XmlRpcException, IOException, ServletException {
		XmlRpcServlet servlet = new XmlRpcServlet();
		ServletWebServer webServer = new ServletWebServer(servlet, PORT);
		webServer.start();
		
	}

}

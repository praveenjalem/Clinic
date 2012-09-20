package test.xmlrpc.webserver;

import java.io.IOException;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

import test.xmlrpc.server.CalculatorImpl;

public class MyWebServer {
	private static final int PORT = 8080;
	
	public static void main(String[] args) throws XmlRpcException, IOException {
		WebServer webserver = new WebServer(PORT);
		XmlRpcServer xmlRpcServer = webserver.getXmlRpcServer();
		PropertyHandlerMapping mapping = new PropertyHandlerMapping();
//		mapping.load(Thread.currentThread().getContextClassLoader(),
//                "MyHandlers.properties");		
		mapping.addHandler("Calculator", CalculatorImpl.class);
		//for dynamic proxy add the complete interface path
		mapping.addHandler("test.xmlrpc.server.Calculator", CalculatorImpl.class);
		xmlRpcServer.setHandlerMapping(mapping);
		
		XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl)xmlRpcServer.getConfig();
		serverConfig.setContentLengthOptional(false);
		serverConfig.setEnabledForExtensions(true);
		
		webserver.start();
		
	}

}

package test.xmlrpc;

import java.io.IOException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class RPCClient {

	public static void main(String[] args) throws IOException, XmlRpcException {
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		//config.setServerURL(new URL("http://localhost:8080/XMLRPC/xmlrpc"));
		config.setServerURL(new URL("http://localhost:8080/XMLRPC/xmlrpc2"));
		config.setBasicPassword("admin");
		config.setBasicUserName("admin");
		
		XmlRpcClient client = new XmlRpcClient();
		// transport factory determines the way the client communicates with the
		// server
		//client.setTransportFactory(new XmlRpcCommonsTransportFactory(client));//This doesn't work due to closure of commons httpclient project.
		client.setConfig(config);
		Object[] params = new Object[] { new Integer(33), new Integer(44) };
		Integer result = (Integer) client.execute("Calculator.addIntegers",
				params);
		System.out.println("The result is :: " + result);
	}
}

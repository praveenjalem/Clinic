package test.xmlrpc;

import java.io.IOException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory;

public class RPCClient {

	public static void main(String[] args) throws IOException, XmlRpcException {
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		config.setServerURL(new URL("http://localhost:8080/xmlrpc"));
		XmlRpcClient client = new XmlRpcClient();
		client.setTransportFactory(new XmlRpcCommonsTransportFactory(client));
		// transport factory determines the way the client communicates with the
		// server
		client.setConfig(config);
		Object[] params = new Object[] { new Integer(33), new Integer(44) };
		Integer result = (Integer) client.execute("Calculator.addIntegers",
				params);
		System.out.println("The result is :: " + result);
	}
}

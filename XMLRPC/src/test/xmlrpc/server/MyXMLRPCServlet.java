package test.xmlrpc.server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfig;
import org.apache.xmlrpc.metadata.XmlRpcSystemImpl;
import org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping.AuthenticationHandler;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcHandlerMapping;
import org.apache.xmlrpc.webserver.XmlRpcServlet;

public class MyXMLRPCServlet extends XmlRpcServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected XmlRpcHandlerMapping newXmlRpcHandlerMapping()
			throws XmlRpcException {
		PropertyHandlerMapping mapping = (PropertyHandlerMapping) super
				.newXmlRpcHandlerMapping();

		AuthenticationHandler handler = new AuthenticationHandler() {
			@Override
			public boolean isAuthorized(XmlRpcRequest request)
					throws XmlRpcException {
				XmlRpcHttpRequestConfig config = (XmlRpcHttpRequestConfig) request
						.getConfig();

				boolean result = false;
				result = "admin".equals(config.getBasicPassword())
						&& "admin".equals(config.getBasicUserName());
				return result;
			}
		};
		
		mapping.setAuthenticationHandler(handler);
		XmlRpcSystemImpl.addSystemHandler(mapping);//for enabling XML-RPC introspection
		return mapping;
	}
}

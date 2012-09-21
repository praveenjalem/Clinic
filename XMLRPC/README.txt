XML-RPC is a Remote Procedure Calling protocol that works on internet (over HTTP).
It is always a POST request with the body containing the XML payload (with XML-RPC spec).
A precursor to SOAP.

Structure of the request XML
	methodCall
		methodName
		params
			param
				value
					i4,string
			param
				value
				
e.g. 
<?xml version="1.0" encoding="UTF-8"?>
<methodCall>
	<methodName>Calculator.addIntegers</methodName>
	<params>
		<param><value><i4>33</i4></value></param>
		<param><value><i4>44</i4></value></param>
	</params>
</methodCall>

Structure of the response XML
	methodResponse
		params
			param
				value
					i4,string
					
e.g.
<?xml version="1.0"?>
<methodResponse>
   <params>
      <param>
         <value><i4>77</i4></value>
         </param>
      </params>
   </methodResponse>
   

Pros:
1. Simple to understand and use.
2. Has a gradual learning curve.
3. Lightweight
Cons:
1. No Unicode support. Only ASCII encoding. But Apache XMLRPC provides support for extensions.
2. Limited data types.
3. Positional parameters
4. No introspection. However there is a non standard introspection spec available.
5. No standard Security support.

Resources:
http://www.xmlrpc.com/
http://xmlrpc-c.sourceforge.net/introspection.html
http://en.wikipedia.org/wiki/XML-RPC

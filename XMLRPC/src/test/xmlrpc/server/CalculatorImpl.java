package test.xmlrpc.server;

public class CalculatorImpl implements Calculator {

	public Integer addIntegers(Integer a, Integer b) {
		return new Integer(a.intValue() + b.intValue());
	}
}

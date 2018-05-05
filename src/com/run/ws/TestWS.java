package com.run.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestWS {
	
	public static void main(String[] args) {
		Function fu;
		try {
			fu = new FunctionServiceLocator().getFunctionPort();
			String str = fu.transWords("I Love Tie Chui Sister !");
			System.out.println(str);
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}

package com.run.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

/**
 * @author user
 * 本例是配合sever端字符拆分来使用的客户端
 *
 */
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

package lw.api.client;

import java.net.URL;

import lw.api.*;

public class Program {

	public static void main(String[] args) {

		try {
			URL endpoint = new URL("https://ws.lemonway.fr/mb/hicham/dev/directkit/service.asmx?wsdl");
			ServiceMb service = new ServiceMb(endpoint);
			ServiceMbSoap soap = service.getServiceMbSoap();

			System.out.println("Call Web Service");
			String resu = soap.getWalletDetails("sc", "", "society", "123456", "fr", "1.0", "1.1.1.0", "ua");

			System.out.println("Return result "+resu);
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
	}
}

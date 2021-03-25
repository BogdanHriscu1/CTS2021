package ro.ase.csie.cts.g1093.dp.singleton.staticversion;

public class RESTBackend {

	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
//	private RESTBackend() {
//		//get the data from config files
//	}
	
	private RESTBackend() {
		
	}
	
	static {
		System.out.println("Is executed when the class is loaded by JVM");
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro";
	}
	
	{
		System.out.println("Is executed before any constructor call");
	}
}

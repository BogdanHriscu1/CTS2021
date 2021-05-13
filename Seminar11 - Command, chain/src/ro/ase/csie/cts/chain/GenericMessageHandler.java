package ro.ase.csie.cts.chain;

public abstract class GenericMessageHandler {

	GenericMessageHandler next = null;
	
	public abstract void processMessage(Message message);

	public void setNext(GenericMessageHandler privateModule) {
		// TODO Auto-generated method stub
		
	}
}

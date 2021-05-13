package ro.ase.csie.cts.chain;

public class FilterModule extends GenericMessageHandler {

	String language;
	String[] dictionary = new String[] {"kill", "hate", "violence"}; //forbidden words
	
	public FilterModule(String language) {
		super();
		this.language = language;
	}

	@Override
	public void processMessage(Message message) {
		boolean isOk = true;
		for(String word : dictionary) {
			if(message.text.toLowerCase().contains(word)) {
				isOk = false;
				break;
			}
		}
		
		if(isOk) {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
	}

	
	
}

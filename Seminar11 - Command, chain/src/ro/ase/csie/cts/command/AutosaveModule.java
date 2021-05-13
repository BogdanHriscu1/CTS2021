package ro.ase.csie.cts.command;

public class AutosaveModule implements GameModuleInterface {

	int frequency;

	public AutosaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}

	@Override
	public void doTheTask(String details) {
		System.out.println("Autosaving for " + details);
		
	}
	
	
}

package ro.ase.csie.cts.command;

public class TestCommand {

	public static void main(String[] args) {
		TaskManager manager = new TaskManager("Background Tasks");

		manager.addAsyncTask(new AsyncTask(new AutosaveModule(5), "Finishing current level", 0));
		manager.addAsyncTask(new AsyncTask(new UpdateModule(), "version 10.5", 0));
		
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
	}

}

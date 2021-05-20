package ro.ase.csie.cts.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ServerConnectionModule connection = new ServerConnectionModule();
		
		ConnectionStatusInterface backup = new BackupModule();
		ConnectionStatusInterface notification = new UserNotificationModule();
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
		
		connection.register(notification);
		connection.register(backup);

		connection.detectConnectionStatusChange(ConnectionStatus.DOWN);
		
		connection.unregister(backup);
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
	}

}

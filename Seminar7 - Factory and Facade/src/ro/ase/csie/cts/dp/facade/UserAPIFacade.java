package ro.ase.csie.cts.dp.facade;

public class UserAPIFacade {
	
	public static String getUserProfile(String user, String pass) {
		//1. Create a game server instance and connect
				GameServer server = new GameServer();
				server.connect();
				
				//2. Create a login
				Login login = new Login("player1", "1234");
				login.login();
				
				//3. Create and get the profile
				UserProfile userProfile = login.getUserProfile();
				String profile = userProfile.getProfile();
				
				//using the facade
				String profile2 = UserAPIFacade.getUserProfile("player2", "1232554");
				
				return profile;
	}
}

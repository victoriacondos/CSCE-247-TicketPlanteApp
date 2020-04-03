
public class LogInCommand implements Command {
	public void execute() {
		Account accountToLogIn = Dialogue.getLogIn();
		Account accountLoggedIn = SystemDatabase.logIn(accountToLogIn);
		if (accountLoggedIn != null) {
			System.out.println("\n----------\n"
					+ "Logging in\n"
					+ "----------\n");
			UserInterface.user = accountLoggedIn;
			UserInterface.setMenu(1);
		} else {
			System.out.println("\tERROR: That account does not exist\n");
		}
	}
}

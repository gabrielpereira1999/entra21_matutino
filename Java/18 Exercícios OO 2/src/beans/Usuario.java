package beans;

public class Usuario {
	
	private String UserName, UserPassword, UserLevel, UserMail, UserCreated;
	private String logado;
	

	public String getLogado() {
		return logado;
	}

	public void setLogado(String logado) {
		this.logado = logado;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getUserLevel() {
		return UserLevel;
	}

	public void setUserLevel(String userLevel) {
		UserLevel = userLevel;
	}

	public String getUserMail() {
		return UserMail;
	}

	public void setUserMail(String userMail) {
		UserMail = userMail;
	}

	public String getUserCreated() {
		return UserCreated;
	}

	public void setUserCreated(String userCreated) {
		UserCreated = userCreated;
	}
	

}

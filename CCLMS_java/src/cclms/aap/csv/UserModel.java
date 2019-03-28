package cclms.aap.csv;

/**
 * @author Santosh Mahto
 *
 */

public class UserModel {
	
	
	    private long id;
	    private String userName;
	    private String password;
	    
	    
		public UserModel(long id, String userName, String password) {
			super();
			this.id = id;
			this.userName = userName;
			this.password = password;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "UserModel [id=" + id + ", userName=" + userName
					+ ", password=" + password + "]";
		}
	    
	    
	    
	    
	    

}

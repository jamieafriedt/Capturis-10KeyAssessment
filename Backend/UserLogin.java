import java.sql.Timestamp;

public class UserLogin {
    
    private int userLoginID;
    private String username;
    private int userID;
    private String password;
    private boolean accountLock;
    private Timestamp lastLoginDate;

    public void setUserLoginID(int userLoginID) {
        this.userLoginID = userLoginID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountLock(boolean accountLock) {
        this.accountLock = accountLock;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public int getUserLoginID() {
        return userLoginID;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public boolean isAccountLock() {
        return accountLock;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }
    
}

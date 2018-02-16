public class PasswordReset {

    private int passwordResetID; 
    private String emailAddress; 
    private int expirationDate; 
    private int token; 

    public void setPasswordResetID(int passwordResetID) {
        this.passwordResetID = passwordResetID;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getPasswordResetID() {
        return passwordResetID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public int getToken() {
        return token;
    }
}

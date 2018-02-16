import java.sql.Timestamp;

public class Assessment {

    private int assessmentID; 
    private int userID; 
    private Timestamp dateTaken; 
    private String timeGiven; 
    private int typeID; 

    public int getAssessmentID() {
        return assessmentID;
    }

    public void setAssessmentID(int assessmentID) {
        this.assessmentID = assessmentID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Timestamp getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Timestamp dateTaken) {
        this.dateTaken = dateTaken;
    }

    public String getTimeGiven() {
        return timeGiven;
    }

    public void setTimeGiven(String timeGiven) {
        this.timeGiven = timeGiven;
    }
    
}

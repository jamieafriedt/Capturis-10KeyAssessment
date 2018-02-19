public class AssessmentType {
    
    private int assessmentTypeID; 
    private int userID; 
    private String description; 

    public int getAssessmentTypeID() {
        return assessmentTypeID;
    }

    public void setAssessmentTypeID(int assessmentTypeID) {
        this.assessmentTypeID = assessmentTypeID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	
}

public class AssessmentResult {
    
    private int assessmentResultID;
    private int userID; 
    private int assessmentID;
    private double resultScore;
    private int perfectCount;
    private int UncorrectedMistakes;
    private int backspacePressCount;
    private int KPH;
    private double accuracy;
    private int linesCompleted;
    private int totalKeyStrokes;

    public int getBackspacePressCount() {
        return backspacePressCount;
    }

    public void setBackspacePressCount(int backspacePressCount) {
        this.backspacePressCount = backspacePressCount;
    }

    public int getKPH() {
        return KPH;
    }

    public void setKPH(int KPH) {
        this.KPH = KPH;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public int getLinesCompleted() {
        return linesCompleted;
    }

    public void setLinesCompleted(int linesCompleted) {
        this.linesCompleted = linesCompleted;
    }

    public int getTotalKeyStrokes() {
        return totalKeyStrokes;
    }

    public void setTotalKeyStrokes(int totalKeyStrokes) {
        this.totalKeyStrokes = totalKeyStrokes;
    }

    public int getAssessmentResultID() {
        return assessmentResultID;
    }

    public void setAssessmentResultID(int assessmentResultID) {
        this.assessmentResultID = assessmentResultID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAssessmentID() {
        return assessmentID;
    }

    public void setAssessmentID(int assessmentID) {
        this.assessmentID = assessmentID;
    }

    public double getResultScore() {
        return resultScore;
    }

    public void setResultScore(double resultScore) {
        this.resultScore = resultScore;
    }

    public int getPerfectCount() {
        return perfectCount;
    }

    public void setPerfectCount(int perfectCount) {
        this.perfectCount = perfectCount;
    }

    public int getUncorrectedMistakes() {
        return UncorrectedMistakes;
    }

    public void setUncorrectedMistakes(int UncorrectedMistakes) {
        this.UncorrectedMistakes = UncorrectedMistakes;
    }
	
}

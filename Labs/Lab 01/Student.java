public class Student{
    private String name;
    private String regNumber;
    private int stage;
    private int credits;

    public Student(String name, String regNumber, int stage, int credits){
        setName(name);
        setRegNumber(regNumber);
        setStage(stage);
        setCredits(credits);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }
    public void setStage(int stage){
        this.stage = stage;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    public String getName(){
        return name;
    }
    public String getRegNumber(){
        return regNumber;
    }
    public int getStage(){
        return stage;
    }
    public int getCredits(){
        return credits;
    }

    public boolean doesStudentPass(){
        return credits == 120;
    }
    
    public void newStage(){
        if(doesStudentPass()){
            stage++;
            credits = 0; 
        } 
    }
    
    public void passModule(int moduleCredits){
        credits += moduleCredits;

        if(credits == 120){
            newStage();
        }
    }
        
}


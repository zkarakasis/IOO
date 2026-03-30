public class Student2b {

    private String name;
    private String registrationNumber; 
    private int yearOfStudies;
    private int credits;

    private static final int MAX_STAGE = 3;
    private static final int MAX_CREDITS = 120;

    public Student2b(String name, String registrationNumber){
        setName(name);
        setRegistrationNumber(registrationNumber);
        this.yearOfStudies = 1;
        this.credits = 0;
    }

   
}

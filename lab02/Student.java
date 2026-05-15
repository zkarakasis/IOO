public class Student {
    
    private String name;
    private String registrationNumber; 
    private int yearOfStudies;
    private int credits;

    //Creating constants. Capitals are used for constants. Final means its a constant. Static means it belongs to the class and not specifically the object(meaning the int isn't generated for every object created)
    private static final int CREDITS_TO_PROGRESS = 120;
    private static final int MAX_STAGE = 3;

    public Student(String name, String registrationNumber)
    {
        setName(name);
        setRegistrationNumber(registrationNumber);
        this.yearOfStudies = 1; // always starts at stage 1
        this.credits = 0; //always starts with 0 credits
    }

    //setters
    public void setName(String name)
    {
        this.name=name;
    }

    public void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber=registrationNumber;
    }

    public void setYearOfStudies(int yearOfStudies)
    {
        this.yearOfStudies=yearOfStudies;
    }

    public void setCredits(int credits)
    {
        this.credits=credits;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public int getYearOfStudies()
    {
        return yearOfStudies;
    }

    public int getCredits()
    {
        return credits;
    }

    private void passToNextYear()
    {
        if (yearOfStudies<MAX_STAGE) {
            yearOfStudies++;
            credits=0;
            System.out.println(name +" has progress to stage " + yearOfStudies);
        } else if (yearOfStudies==MAX_STAGE) {
                System.out.println(name + " is already in the final stage (year 3)");
        }
    }

    public void passModule(int moduleCredits)
    {
        credits = credits + moduleCredits;
        System.out.println( name+" passed a module worth "+ moduleCredits+". Tottal credits: "+credits);
        
        if (credits>=CREDITS_TO_PROGRESS) {
            passToNextYear();
        }
    }
}

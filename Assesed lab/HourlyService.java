//Ex2
public class HourlyService extends Service {
    private int numberOfHours;
    //Constructor
    public HourlyService(double cost, String description, int numberOfHours){
        super(cost, description);
        this.numberOfHours = numberOfHours;
    }
    // default constructor
    public HourlyService(){}

    //Setter
    public void setNumberOfHours(int numberOfHours){
        this.numberOfHours = numberOfHours;
    }
    //Getter
    public int getNumberOfHours(){
        return numberOfHours;
    }
    //override
    @Override
    public String getTotalPaymentAmount(){
        return "The cost of the "+getDescription()+" service is "+(getCost() * numberOfHours)+" euros.";
    }
}

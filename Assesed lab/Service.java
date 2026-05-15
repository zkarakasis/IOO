//Ex1
public class Service {
    private double cost;
    private String description;

    //Constructor
    public Service(double cost, String description){
        this.cost = cost;
        this.description = description;
    }
    // default constructor
    public Service(){}

    //Setters
    public void setCost(double cost){
        this.cost = cost;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //Getters
    public double getCost(){
        return cost;
    } 

    public String getDescription(){
        return description;
    }

    public String getTotalPaymentAmount(){
        return "The cost of the "+description+" service is "+cost+" euros.";
    }
    
}

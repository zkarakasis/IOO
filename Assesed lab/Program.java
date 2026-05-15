//Ex 3
public class Program extends HourlyService{
    
    public static void main (String[]args ){
        //Object creation
        Service service = new Service(40, "Car rental");
        HourlyService hourlyService = new HourlyService(20,"Spanish lessons", 30);
        //Print command
        System.out.println(service.getTotalPaymentAmount());
        System.out.println(hourlyService.getTotalPaymentAmount());
    }
    
    
}



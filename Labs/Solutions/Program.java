public class Program
{
    public static void main(String[] args) {
        //Rectangle object
        Rectangle rect = new Rectangle(10, 10);

        System.out.println("Rectangle height: " + rect.getHeight());
        System.out.println("Rectangle width: " + rect.getWidth());

        rect.setHeight(6.0);
        rect.setWidth(7.0);

        System.out.println("Updated rectangle height: "+ rect.getHeight());
        System.out.println("Updated rectangle width: "+ rect.getWidth());

        System.out.println("Perimeter: "+rect.perimeter());
        System.out.println("Area: "+ rect.area());
        System.out.println("Is a square: "+rect.isSquare());

        Student student1 = new Student("Mpampis Mpampinos", "CSY67069");
        System.out.println("Name: "+ student1.getName());
        System.out.println("Registration number: "+student1.getRegistrationNumber());
        System.out.println("Stage: "+student1.getYearOfStudies());
        System.out.println("Credits: "+ student1.getCredits());

        //pass Module
        System.out.println("Passing modules...");
        student1.passModule(30);
        student1.passModule(60);
        student1.passModule(30);// reaches 120

        //show updated
        System.out.println("Updated Student info");
        System.out.println("Name: "+ student1.getName());
        System.out.println("Registration number: "+student1.getRegistrationNumber());
        System.out.println("Stage: "+student1.getYearOfStudies());
        System.out.println("Credits: "+ student1.getCredits());

    }
}

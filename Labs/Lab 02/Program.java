public class Program {
    public static void main(String[] args) {

        // Create a new Rectangle object
        Rectangle r1 = new Rectangle();

        // Print the initial height and width
        System.out.println("Initial Height: " + r1.getHeight());
        System.out.println("Initial Width: "+ r1.getWidth());

        r1.setHeight(5.0);
        r1.setWidth(8.0);

        System.out.println("New height: "+r1.getHeight());
        System.out.println("New width: "+r1.getWidth());

        System.out.println("New perimeter: "+r1.getPerimeter());
        System.out.println("New area: "+r1.getArea());
        System.out.println("Is the new rectangle a square: "+r1.isSquare());

        Student s1 = new Student("Jim Jimothy", "CSY6967", 2, 0);

        System.out.println("Name: "+s1.getName());
        System.out.println("RegNumber: "+s1.getRegNumber());
        System.out.println("Stage of studies: "+s1.getStage());
        System.out.println("Credits: "+s1.getCredits());

        s1.passModule(70);
        System.out.println("Stage: "+s1.getStage());
        System.out.



    }   
}

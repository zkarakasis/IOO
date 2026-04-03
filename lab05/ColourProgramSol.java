import java.util.List;
import java.util.ArrayList;

public class ColourProgramSol {

	public static void main(String[] args) {
        
		// create an arraylist for Colour objects
        List<Colour> colours = new ArrayList<Colour>();

        // add to the list 5 newly created objects
        Colour red = new Colour("red", 255, 0, 0);
        colours.add(red);
        colours.add(new Colour("blue", 0, 0, 255));
        colours.add(new Colour("green", 0, 255, 0));
        colours.add(new Colour("magenda", 255, 0, 255));
        colours.add(new Colour("orange", 255, 0, 165));

        // print the colour in position 2
        System.out.println(colours.get(2));

        // find and print the colour(s) with the maximum blue value and their position inside the arraylist
        int maxBlue = 0;
        for(Colour c : colours){
            if(c.getBlue() > maxBlue){
                maxBlue = c.getBlue();
            }
        }

        for(Colour c : colours){
            if(c.getBlue() == maxBlue){
                System.out.println(c + " has a max blue value off: "+maxBlue);
                System.out.println("and is loated in position: " + colours.indexOf(c));
            }
        }

        //Create new colour
        Colour violet = new Colour("violet", 127, 0, 255);

        //Add it to the arraylist
        colours.add(1, violet);

        //print the position of the violet object
        System.out.println("Object violet is located in position:" +colours.indexOf(violet));
    }
}
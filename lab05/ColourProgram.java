// 2. In the main method of the ColourProgram class:
// a. Create an arraylist for Colour objects.
// b. Add 5 different colours.
// c. Print the colour in position 2.
// d. Find and print the colour(s) with the maximum blue value. Print also
// their position(s).
// e. Create a new Colour object.
// f. Add it to the arraylist.
// g. Print the position of this last colour using its reference (name).
import java.util.List;
import java.util.ArrayList;

public class ColourProgram {

	public static void main(String[] args) {
        
		// create an arraylist for Colour objects
        ArrayList<String> coloursList = new ArrayList<String>();
		
		// add to the list 5 newly created objects
        Colour black = new Colour("black", 0, 0, 0);
        Colour yellow = new Colour("yellow", 255, 255, 0);
        Colour orange = new Colour("orange", 255, 165, 0);
        Colour purple = new Colour("purple", 128, 0, 128);
        Colour pink = new Colour ("pink", 255, 192, 203 );
        
        coloursList.add("black");
		coloursList.add("yellow");
        coloursList.add("orange");
        coloursList.add("purple");
        coloursList.add("pink");

		// print the colour in position 2
        System.out.println(coloursList.get(2));
        
		// find and print the colour(s) with the maximum blue value and their position inside the arraylist
        System.out.println(coloursList.max());
        
        // System.out.println("The color with the highest blue value is: "+max(black.getBlue(), yellow.getBlue(), orange.getBlue(), purple.getBlue(), pink.blue));
		
		//create a new violet colour
        Colour violet = new Colour("violet", 127, 0, 255);
				
		//Add it to the arraylist
		coloursList.add("violet");

		//print the position of this last colour using its reference (name)
		System.out.println(coloursList());

		
	}
}
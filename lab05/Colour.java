// 1. Create a class Colour storing the name of a color and their RGB code in 3
// different attributes. Implement the standard methods for this class
// (constructor with parameters, getters, setters, toString).

public class Colour {
    
    private String color;
    private int red;
    private int green;
    private int blue;

    public Colour(String color, int red, int green, int blue){
        this.color = color;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setRed(int red){
        if(red >= 0 && red <= 255){
            this.red = red;
        }
    }

    public void setGreen(int green){
        if(green >= 0 && green <= 255){
            this.green = green;
        }
    }
    public void setBlue(int blue){
        if(blue >= 0 && blue <= 255){
            this.blue = blue;
        }
    }

    public String getColor(){
        return color;
    }

    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }
    
    @Override
    public String toString() {
        return "Colour [color=" + color + ", red=" + red + ", green=" + green + ", blue=" + blue + "]";
    }

}

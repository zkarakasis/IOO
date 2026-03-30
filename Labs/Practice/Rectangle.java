public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(double height){
        if(height >= 0.1 && height <= 20.0){
            this.height = height;
        }
    }
    public void setWidth(double width){
        if(width >= 0.1 && width <= 20.0){
            this.width = width;
    }

    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        return 2 * (getHeight() + getWidth());
    }

    public double getArea(){
        return getHeight() * getWidth();
    }

    public boolean isSquare(){
        return getHeight() == getWidth();
    }
}

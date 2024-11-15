abstract class Shape {
    protected String color;
    protected boolean filled;
   
    
    public void setColor (String color){
        this.color = color;
     } 
     
    public void setFilled (boolean filled){
         this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public String toString() {
        return "The shape is color " + color + "and it is " + filled + "The area is " + getArea() + ". The perimeter is " + getPerimeter();
    }
}

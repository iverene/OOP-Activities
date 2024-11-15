class Circle extends Shape {
    private double radius;
    
    
    public Circle () {}
    
    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;

    }


    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    
    public double getArea(){
        return 3.14*(radius*radius);
        
    }
    
    
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    
    @Override
    public String toString(){
        
        return "The shape is color " + color + " and it is " + filled + ". The radius of the circle is " + radius + ". The area is " + getArea() + ". The perimeter is " + getPerimeter();
    }
}

class Rectangle extends Shape {
    protected double length;
    protected double width;
    
    public Rectangle () {}
    
    public Rectangle(double length, double width, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    
    public double getArea(){
        return length * width;
        
    }
    
    
    public double getPerimeter(){
        return (length + width)*2;
        
    }
    
    @Override
    public String toString(){
        return "The shape is color " + color + " and it is " + filled + ". The length of the rectangle is " + length + ". The width of the rectangle is " + width + ". The area is " + getArea() + ". The perimeter is " + getPerimeter();
    }
    }


class Square extends Rectangle {
    private double side;
    
    public Square () {}
    
    public Square(double side, double length, double width, String color, boolean filled) {
        this.side = side;
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    
    
    public double getArea(){
        return side*side;
    }
    
    
    public double getPerimeter(){
        return 4*side;
    }
    
    @Override
    public String toString() {
    return "The shape is color " + color + " and it is " + filled + ". The sides of the square are " + side + ". The length of the square is " + length + ". The width of the square is " + width + ". The area is " + getArea() + ". The perimeter is " + getPerimeter();
    }
}
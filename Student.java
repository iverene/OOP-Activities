class Student extends Person {
    private String program;
    private int year;
    
    public Student (String name, String address, String program, int year) {
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
    }
    
    public void setprogram (String program) {
        this.program = program;
    }
    
    public void setYear (int year) {
        this.year = year;
    }
    
    public String getprogram() {
        return program;
    }
    
    public int getyear() {
        return year;
    }
}

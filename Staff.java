class Staff extends Person {
    private String school;
    private double salary;
    
    public Staff (String name, String address, String school, double salary) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }
    
    public void setschool (String school) {
        this.school = school;
    }
    
    public void setsalary (double salary) {
        this.salary = salary;
    }
    
    public String getschool() {
        return school;
    }
    
    public double getsalary() {
        return salary;
    }
}
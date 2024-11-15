class Person {
    protected String name;
    protected String address;
    
    public void setname (String name) {
        this.name = name;
    }
    
    public void setaddress (String address) {
        this.address = address;
    }
    
    public String getname() {
        return name;
    }
    
    public String getaddress() {
        return address;
    }

    public String toString() {
        return "Hello I am " + name + " and" +" I lived in " + address + ".";
    }
}
class Dog {
    String dogName;
    boolean isMale;
    int numPuppies;
    String puppies[] = {"Chase","Zuma","Rubble"};
    
    
    public void setName(String name) {
        dogName = name;
    }

    public String showName() {
        return "Name of the dog: " + dogName ;
    }

    public String bark() {
        return "Woof! Woof!";
    }
    
    public void setNumberOfPuppies() {
        numPuppies = puppies.length;
    }

    public String showNumberOfPuppies() {
        return "Number of puppies: " + numPuppies;
    }
    
    public String[] showPuppies() {
        return puppies;
    }
}

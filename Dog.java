class Dog {
    String names;
    boolean isMale;
    int numPuppies;
    Dog[] puppies = new Dog[2];
    Dog puppy;
    
    
    public void setName(String name) {
        names = name;
    }

    public String showName() {
        return "Name of the dog: " + names ;
    }

    public String bark() {
        return "Woof! Woof!";
    }
    
    public void setNumberOfPuppies() {
        numPuppies = puppies.length;
    }

    public void setPuppy(Dog puppies) {
        puppy = puppies;
    }

    public String showNumberOfPuppies() {
        return "Number of puppies: " + numPuppies;
    }
    
    public Dog[] showPuppies() {
        return puppies;
    }

    public void setPuppies(Dog puppies[]) {
        puppies=puppies;
    }
}

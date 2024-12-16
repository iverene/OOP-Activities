class Dog {
    String name;
    boolean isMale;
    int numPuppies;
    Dog[] puppies = new Dog[5];


    
    public void setName(String name) {
        this.name = name;
    }

    
    public String showName() {
        return "Name of the dog: " + name;
    }

   
    public String bark() {
        return "Woof! Woof!";
    }

    
    public void setNumberOfPuppies(int numPuppies) {
        this.numPuppies = numPuppies;
        this.puppies = new Dog[numPuppies];
    }

    
    public String showNumberOfPuppies() {
        return "Number of puppies: " + numPuppies;
    }

    
    public void addPuppy(int index, Dog puppy) {
        if (index >= 0 && index < puppies.length) {
            this.puppies[index] = puppy;
        } 
    }

   
    public void showPuppies() {
        System.out.println("Puppies:");
        for (Dog puppy : puppies) {
            if (puppy != null) {
                System.out.println(puppy.name);
            }
        }
    }
}
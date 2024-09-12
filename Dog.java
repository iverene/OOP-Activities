class Dog {
    String name;
    boolean isMale;
    int numPuppies;
    String puppies[] = new String[5];

    

    public String showName() {
        return "Name of the dog: " + name;
    }

    public String bark() {
        return "Woof! Woof!";
    }

    public String numberPuppies() {
        return "Number of puppies: " + puppies[];
    }
}

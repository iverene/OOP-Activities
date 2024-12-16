class Activity {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.setName("Skye");
        dog.setNumberOfPuppies(5);

        
        Dog puppy1 = new Dog();
        puppy1.setName("Chase");
        dog.addPuppy(0, puppy1);

        Dog puppy2 = new Dog();
        puppy2.setName("Zuma");
        dog.addPuppy(1, puppy2);

        Dog puppy3 = new Dog();
        puppy3.setName("Rubble");
        dog.addPuppy(2, puppy3);

        Dog puppy4 = new Dog();
        puppy4.setName("Marshall");
        dog.addPuppy(3, puppy4);

        Dog puppy5 = new Dog();
        puppy5.setName("Everest");
        dog.addPuppy(4, puppy5);

        
        System.out.println(dog.showName());
        System.out.println(dog.bark());
        System.out.println(dog.showNumberOfPuppies());

        
        dog.showPuppies();
    }
}
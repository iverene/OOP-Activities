class Activity {
    public static void main (String args[]) {

       Dog dog = new Dog();
       dog.setName("Skye");
       dog.setNumberOfPuppies();

       Dog puppy1 = new Dog();
       puppy1.names="Chase";
       dog.setPuppy(puppy1);

       Dog puppy2 = new Dog();
       puppy2.names="Zuma";
       dog.setPuppy(puppy2);

       dog.puppies[0] = puppy1;
       dog.puppies[1] = puppy2;

       System.out.println(dog.showName());
       System.out.println(dog.bark());
       System.out.println(dog.showNumberOfPuppies());
       System.out.println("Puppies:");
       //System.out.println(dog.showPuppies().names);
       
       for (int i=0; i < dog.showNumberOfPuppies().length(); i++) {
        System.out.println(dog.showPuppies()[i]);
       }
    }
}
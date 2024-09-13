class Activity {
    public static void main (String args[]) {

       Dog dog = new Dog();
       dog.setName("Skye");
       dog.setNumberOfPuppies(3);

       System.out.println(dog.showName());
       System.out.println(dog.bark());
       System.out.println(dog.showNumberOfPuppies());
       System.out.println("Puppies:");
       
       for (int i=0; i < dog.showPuppies().length; i++) {
       System.out.println(dog.showPuppies()[i]);
    }
    }
}

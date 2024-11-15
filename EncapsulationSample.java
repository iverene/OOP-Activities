public class EncapsulationSample {
    public static void main(String[] args) {

    Student student1 = new Student();
    student1.setId(1234);
    student1.setname("Iverene Grace M. Causapin");

    System.out.println("Student Id: " + student1.getId());
    System.out.println("Student Name: " + student1.getname());


    System.out.println(" \n ");

    Book book1 = new Book ();
    book1.setbook_number(1);
    book1.settitle("He's Into Her");
    book1.setauthor("maxinejiji");
    book1.setprice(2097.00);

    System.out.println("Book Number: " + book1.getbook_number());
    System.out.println("Book Title: " + book1.gettitle());
    System.out.println("Book Author: " + book1.getauthor());
    System.out.println("Book Price: " + book1.getprice() + " php");

    }
}
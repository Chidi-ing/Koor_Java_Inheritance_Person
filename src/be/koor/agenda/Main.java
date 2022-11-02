package be.koor.agenda;

public class Main {
    public static void main(String[] args) {

        Person james = new Person(007,"James", "Bond", "007mi6@gmail.uk");
        System.out.println(james );

        Employee emp = new Employee(006,"jason", "bourne", "jb@cia.com",3500);
        System.out.println(emp);

    }
}
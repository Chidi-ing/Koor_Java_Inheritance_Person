package be.koor.agenda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person james = new Person("James", "Bond", "007mi6@gmail.uk");
        System.out.println(james );

        Employee emp = new Employee("jason", "bourne", "jb@cia.com",3500);
        System.out.println(emp);

        Client whiteHouse = new Client("White", "House","whitehouse@gov.com", 1);
        System.out.println(whiteHouse);

//        Person [] persons = new Person[3];
//        persons[0] = new Person( );
//        persons[1] = new Employee("jason", "bourne", "jb@cia.com", 3500 );
//        persons[2] = new Client("James", "Bond", "007mi6@gmail.uk", 152);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person() );
        persons.add(new Employee("jason", "bourne", "jb@cia.com", 3500 ) );
        persons.add(new Client("James", "Bond", "007mi6@gmail.uk", 152) );

        for (Person person : persons){
            System.out.println( person );
        }

        for (Person person: persons) {
            if (person instanceof Employee) {
                System.out.println( person );
            }
        }


    }
}
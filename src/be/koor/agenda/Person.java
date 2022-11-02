package be.koor.agenda;

import java.util.regex.Pattern;

public class Person {

    // On définie une expression régulière compilé une fois pour toute.
    // Elle est partagée par toutes les instances de Person
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[\\w.-]+@[\\w.-]+[a-z]{2,}$"
    );


    private String firstName;
    private String lastName;
    private String email;


    public Person() {
        this(  "john", "doe", "unknown@anywhere.unk" );
    }

    public Person(  String firstName, String lastName, String email ) {

        this.setFirstName( firstName );
        this.setLastName( lastName );
        this.setEmail( email );
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        if ( firstName == null ) {
            throw new NullPointerException( "firstName cannot be null" );
        }
        firstName = firstName.trim();   // Pour supprimer les blancs inutiles
        if ( firstName.equals( "" ) ) {
            throw new RuntimeException( "firstName cannot be empty" );
        }
        this.firstName = firstName.toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        if ( lastName == null ) {
            throw new NullPointerException( "lastName cannot be null" );
        }
        lastName = lastName.trim();   // Pour supprimer les blancs inutiles
        if ( lastName.equals( "" ) ) {
            throw new RuntimeException( "lastName cannot be empty" );
        }
        this.lastName = lastName.toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        if ( email == null ) {
            throw new NullPointerException( "email cannot be null" );
        }
        if ( ! EMAIL_PATTERN.matcher( email ).matches() ) {
            throw new RuntimeException( "email parameter not match with classical pattern" );
        }
        this.email = email;
    }

    @Override public String toString() {
        return String.format( "%s %s: %s",
                this.firstName,
                this.lastName,
                this.email );
    }

}

package se.lexicon.models;

import se.lexicon.data.AppUserRepository;
import se.lexicon.models.Person;



public class Main {
    public static void main(String[] arg) {

       /* int a = 10;
        int b = 10;
        boolean compareAB = a == b;
        System.out.println(compareAB);// true

        System.out.println("+++++++++++++++++++++++++++++++");
        Person personA = new Person();
        personA.setFirstName("Oskar");
        personA.setLastName("Oskar");

        Person personB = new Person();
        personB.setFirstName("Oskar");
        personB.setLastName("Oskar");

        boolean comparePersons = personA.equals(personB);
        System.out.println(comparePersons);

        */

    }

    // (access modifier) (static or nun static) (return type) (method name) (method params)
    public static int addition(int a,int b){
        return a+b;
    }

    public void showData(String test){
        System.out.println("Test DATA:" + test);
    }

}


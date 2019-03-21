package com.leapley.Week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
Hudson Leapley 3/21/2019
Create a class to store contact information consisting of
a name and email address. Additionally, create a class to
store a collection of contacts that implements the Iterable
interface so that a for-each loop can be used with the the
collection class. Demonstrate this functionality with a
for-each loop in the Main.main() method that displays
contact information.
 */
class Contact { //contact class that contains name and email
    private String name;
    private String email;

    Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + "\nEmail: " + email);
    }
}

class ContactCollection implements Iterable<Contact>{ //collection class that implements iterable interface

    private List<Contact> collection = new ArrayList();

    public ContactCollection(){

    }

    public void add(Contact con){
        collection.add(con);
    }

    @Override
    public Iterator<Contact> iterator() {
        return collection.listIterator();
    }

    @Override
    public void forEach(Consumer<? super Contact> action) {
    }

    @Override
    public Spliterator<Contact> spliterator() {
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
        Contact con1 = new Contact("Hudson","gmail@gmail.com");
        Contact con2 = new Contact("Grubb","yahoo@yahoo.com");
        Contact con3 = new Contact("Kevin","sbc@global.com");
        ContactCollection col = new ContactCollection(); //makes collection class
        col.add(con1);
        col.add(con2);
        col.add(con3);

        for(Contact con: col){ //display all contacts in collection class.
            con.displayInfo();
        }
    }
}
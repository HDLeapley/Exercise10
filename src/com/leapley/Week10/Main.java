package com.leapley.Week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

class Contact {
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

class ContactCollection implements Iterable<Contact>{

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
        ContactCollection col = new ContactCollection();
        col.add(con1);
        col.add(con2);
        col.add(con3);

        for(Contact con: col){
            con.displayInfo();
        }
    }
}

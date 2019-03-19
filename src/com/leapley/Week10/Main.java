package com.leapley.Week10;

import java.util.ArrayList;
import java.util.List;

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

class ContactCollection {
    private List<Contact> collection = new ArrayList();

    ContactCollection(){
    }

    public void add(Contact contact){
        collection.add(contact);
    }
    public void display(){
        for(Contact con: collection){
            con.displayInfo();
        }
    }
}

public class Main {

    public static void main(String[] args) {
	    Contact con1 = new Contact("Hudson","No");
        Contact con2 = new Contact("Grubb","Yes");
        ContactCollection collection = new ContactCollection();
        collection.add(con1);
        collection.add(con2);
        collection.display();
    }
}

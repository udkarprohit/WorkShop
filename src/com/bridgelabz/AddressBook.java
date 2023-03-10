package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    //Creating List of contacts
    private List<Contact> contacts;

    //Allocating to the memory
    public AddressBook() {
        contacts = new ArrayList<>();
    }

    //Creating A method for adding contacts to the list.
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    //getting the contacts
    public List<Contact> getContacts() {
        return contacts;
    }
}

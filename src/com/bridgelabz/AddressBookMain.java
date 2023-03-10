package com.bridgelabz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static void main(String[] args) throws IOException {

        //        Once it is done use stream api to form a city map and state map.
        //Creating objects for AddressBook for adding contacts
        AddressBook addressBookOne = new AddressBook();
        AddressBook addressBookTwo = new AddressBook();

        //Adding contact
        Contact contactOne = new Contact("Udkar", "Prohit", "9182999975", "13-3-652", "HYD", "TEL", "500032");
        Contact contactTwo = new Contact("Kiramkond", "Rohit", "9182999978", "652", "HYD", "TEL", "500032");

        //Adding contacts to the address book objects
        addressBookOne.addContact(contactOne);
        addressBookTwo.addContact(contactTwo);

        //
        System.out.println("Contacts in AddressBook one : ");
        for (Contact contact : addressBookOne.getContacts()) {
            System.out.println(contact.getFirstName() + "\t" + contact.getLastName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getAddress() + "\t" + contact.getCity() + "\t" + contact.getState() + "\t" + contact.getZipCode());
        }

        System.out.println("Contacts in AddressBook two : ");
        for (Contact contact : addressBookTwo.getContacts()) {
            System.out.println(contact.getFirstName() + "\t" + contact.getLastName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getAddress() + "\t" + contact.getCity() + "\t" + contact.getState() + "\t" + contact.getZipCode());
        }
//        List<Contact> contacts = Arrays.asList(new Contact("Udkar", "Prohit", "9182999975", "13-3-652", "HYD", "TEL", "500032"),
//                new Contact("Kiramkond", "Rohit", "9182999978", "652", "HYD", "TEL", "500006"),
//                new Contact("komado", "tangjiro", "9182998978", "plot no 199", "RR", "AP", "500011"));
//
//        Map<String, List<Contact>> cityMap = contacts.stream().collect(Collectors.groupingBy(Contact::getCity));
//        Map<String, List<Contact>> stateMap = contacts.stream().collect(Collectors.groupingBy(Contact::getState));
//
//        //Displaying contacts by city
//        System.out.print("Contacts by City  : ");
//        for (String city : cityMap.keySet()) {
//            System.out.println(city + " -> ");
//            for (Contact contact : cityMap.get(city)) {
//                System.out.println(contact.getFirstName() + "\t" + contact.getLastName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getAddress() + "\t" + contact.getCity() + "\t" + contact.getState() + "\t" + contact.getZipCode());
//            }
//        }
//        //Displaying contacts by state
//        System.out.print("Contacts by State  : ");
//        for (String state : stateMap.keySet()) {
//            System.out.println(state + " -> ");
//            for (Contact contact : stateMap.get(state)) {
//                System.out.println(contact.getFirstName() + "\t" + contact.getLastName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getAddress() + "\t" + contact.getCity() + "\t" + contact.getState() + "\t" + contact.getZipCode());
//            }
//        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt"))) {
            writer.write("Address book 1\n");
            for (Contact contact : addressBookOne.getContacts()) {
                writer.write(contact.getFirstName() + "\t" + contact.getLastName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getAddress() + "\t" + contact.getCity() + "\t" + contact.getState() + "\t" + contact.getZipCode());
            }
            writer.write("\n Address book 2 \n");
            for (Contact contact : addressBookTwo.getContacts()) {
                writer.write(contact.getFirstName() + "\t" + contact.getLastName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getAddress() + "\t" + contact.getCity() + "\t" + contact.getState() + "\t" + contact.getZipCode());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file : " + e.getMessage());
        }
    }
}

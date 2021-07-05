package com.example.messages.Model;

import com.example.messages.Model.Contact;

public class ContactAndSeenTime {
    public Contact contact;
    public String SeenTime;
    public String Status;
    public String imageUrl;


    public ContactAndSeenTime()
    {
        contact=new Contact();
        SeenTime="";
        Status="";
        imageUrl="";

    }
}

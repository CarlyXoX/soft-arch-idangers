package edu.wctc.example2;

import javax.swing.*;

/*
This class is the superclass of all animal objects in this program. It
provides one method that all subclasses can use. Only problem is, the method
is poorly written.
 */
public abstract class Animal {

    /*
    This method expects a String value as a parameter (message). Just to be
    safe, it checks to make sure the incoming argument is a String with a
    length greater than 0. Good idea! But the author forgot to check for
    message == null. As a result, if message is null, the if statement will
    error out with a NullPointerException.
     
    Why? We tried to call a method isBlank() that belongs to a String
    object stored in the message variable. But if message is null, we have
    no object. The message variable contains a pointer to null, or nothing!
    That's why we get NullPointerException.
     
    One more thing, do we always want the message displayed in a JOptionPane?
    Here we have little choice.
     */
    public void speak(String message) {
        // should check for null first: if(message == null || message.isBlank())
        if (message == null) {
            message.isBlank();
        }

        if (message.isBlank()) {
            message = "[mute]";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}

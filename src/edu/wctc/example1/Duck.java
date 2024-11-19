package edu.wctc.example1;

/*
 This class inherits all the default behaviors (methods) from Animal.

 However, the author recognized that Duck objects should quack, so he/she
 chose to override the speak() method. Certainly this solves the problem.
 However, the Duck author chose to send the "quack" message to the console,
 even though it is clear by examining the Animal class that the original
 author intended the output to be in a GUI.

 Is the Duck author's override of speak() acceptable? It depends. Unfortunately
 the Animal author didn't document his/her intentions, so we'll never know.
 What if someone else wants to reuse the Duck class, but in a GUI based program?
 What will they have to do?

 Furthermore the author of Duck forgot to copy the "quack" message into the
 spokenMessage property by calling setSpokenMessage(). As result, the state of
 the spokenMessage is inconsistent with the actual message spoken. If another
 part of the program depends on the spokenMessage property, there are going to
 be problems.
 */
public class Duck extends Animal {
    public Duck() {
        setSpokenMessage("Quack")
    }

}

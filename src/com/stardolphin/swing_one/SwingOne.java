package com.stardolphin.swing_one;

import javax.swing.*;


// decodejava tutorial here:
// https://www.decodejava.com/java-gridlayout.htm


public class SwingOne implements Runnable {

    public static void main(String... ar) {
        SwingUtilities.invokeLater(new SwingOne()); //Creating and calling an Event Dispatching Thread
    }

    //Event Dispatching Thread is running to create GUI of window application
    public void run() {
        new MainFrame();
    }

}

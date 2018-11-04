package com.stardolphin.swing_one;

import javax.swing.*;
import java.awt.*;


// decodejava tutorial here:
// https://www.decodejava.com/java-borderlayout.htm


public class SwingOne implements Runnable {

    public static void main(String... ar) {
        SwingUtilities.invokeLater(new SwingOne()); //Creating and calling an Event Dispatching Thread
    }

    //Event Dispatching Thread is running to create GUI of window application
    public void run() {
        new A();
    }

}


class A {


    A() {
        JFrame jf = new JFrame("BorderLayout Example");
        JPanel jp = new JPanel();

        JButton button1 = new JButton("North");
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("East");
        JButton button4 = new JButton("West");


        JTextArea textArea = new JTextArea(4, 4);


//Setting the positioning of the components in container, JPanel, to BorderLayout
        jp.setLayout(new BorderLayout()); //

        jp.add(button1, BorderLayout.NORTH);    //Adding button1, to the NORTH, top side
        jp.add(button2, BorderLayout.SOUTH);    //Adding button2, to the SOUTH, bottom side
        jp.add(button3, BorderLayout.EAST);    //Adding button3, to the EAST, far right side
        jp.add(button4, BorderLayout.WEST);    //Adding button4, to the North, far left side
        jp.add(textArea, BorderLayout.CENTER);    //Adding textarea, to the CENTER


        jf.add(jp);

        jf.setSize(320, 200);
        jf.setVisible(true);
    }

}
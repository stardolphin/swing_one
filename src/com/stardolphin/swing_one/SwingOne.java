package com.stardolphin.swing_one;

import javax.swing.*;
import java.awt.*;


// decodejava tutorial here:
// https://www.decodejava.com/java-flowlayout.htm


public class SwingOne implements Runnable
{

    public static void main(String...ar)
    {
        SwingUtilities.invokeLater(new SwingOne()); //Creating and calling an Event Dispatching Thread
    }

    //Event Dispatching Thread is running to create GUI of window application
    public void run()
    {
        new A();
    }

}


class A
{

    // JLabel label3;

    A()
    {
        JFrame jf = new JFrame("FlowLayout Example");
        jf.setSize(400,150);

        JLabel label1 = new JLabel("Enter your name");
        JLabel label2 = new JLabel("Enter your city");


        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);

        JButton button1 = new JButton("Clear");
        JButton button2 = new JButton("Submit");
        JButton button3 = new JButton("Exit");

//Setting the positioning of the components in container.
        jf.setLayout(new FlowLayout()); // calling the first constructor of FlowLayout class, which
        // positions each line of components in the center of JFrame

        jf.add(label1);	  		 //Adding the first Jlabel component to JFrame container
        jf.add(field1);	  		 //Adding the first JTextField component to JFrame container
        jf.add(label2);	  		 //Adding the second JLabel component to JFrame container
        jf.add(field2);   		 //Adding the second JTextField component to JFrame container
        jf.add(button1);   		 //Adding the first JButton component to JFrame container
        jf.add(button2);   		 //Adding the second JButton component to JFrame container
        jf.add(button3);   		 //Adding the third JButton component to JFrame container

        jf.setSize(300,200);
        jf.setVisible(true);
    }

}
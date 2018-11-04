package com.stardolphin.swing_one;

import javax.swing.*;
//import java.awt.*;

public class SwingOne implements Runnable
{

    public static void main(String...ar)
    {
        SwingUtilities.invokeLater(new SwingOne()); //Creating and calling an Event Dispatching Thread
    }

    //Event Dispatching Thread is running to create GUI of window application
    public void run()
    {
        new MainFrame();
    }

}


class MainFrame
{

    MainFrame()
    {
        JFrame frame = new JFrame("SwingOne");
        JLabel label = new JLabel("HELLO WORLD");

        frame.add(label);
        frame.setSize(210,250);
        frame.setVisible(true);
    }

}
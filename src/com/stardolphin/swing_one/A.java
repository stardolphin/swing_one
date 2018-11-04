package com.stardolphin.swing_one;

import javax.swing.*;
import java.awt.*;

// https://www.decodejava.com/java-gridbaglayout.htm

class A {

    A() {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        JFrame jf = new JFrame("GridBagLayout Example");


        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");
        JButton button6 = new JButton("Button6");

        //Setting the positioning of the components in JFrame to GridBagLayout
        jf.setLayout(grid);

        //Padding with horizontal space of 100 pixels around the next added components
        constraints.ipadx = 100;

        //Adding the button1 to 0th x-coordinate of 0th column, at WEST
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        grid.setConstraints(button1, constraints);


        //Adding the button2 to 1st x-coordinate of 0th column, at EAST
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(button2, constraints);

        //Padding with vertical space of 50 pixels around the next added buttons
        constraints.ipady = 50;


        //Adding button3 to 0th x-coordinate of 1st column, at CENTER
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        grid.setConstraints(button3, constraints);


        //Adding button5 to 0th x-coordinate of 2nd column, at WEST
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        grid.setConstraints(button4, constraints);


        //Adding button6 to 1st x-coordinate of 2nd column, at CENTER
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        grid.setConstraints(button5, constraints);


        //Adding button7 to 2nd x-coordinate of 2nd column, at EAST
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(button6, constraints);


        jf.add(button1);
        jf.add(button2);
        jf.add(button3);
        jf.add(button4);
        jf.add(button5);
        jf.add(button6);


        jf.setVisible(true);
        jf.setSize(600, 300);
    }
}
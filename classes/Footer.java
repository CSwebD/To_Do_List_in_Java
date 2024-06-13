package classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
    JButton addTask;
    JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    // Constructor
    public Footer(){
        this.setPreferredSize(new Dimension(400,60));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-Serif", Font.PLAIN, 20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear completed Tasks");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
        this.add(clear);
    }

    public JButton getNewTaskButton(){
        return addTask;
    }

    public JButton getClearButton(){
        return clear;
    }
    
}
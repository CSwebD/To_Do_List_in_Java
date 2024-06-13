package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Task extends JPanel{
    
    private JLabel index; // Label to display the task index
    private JTextField taskName; // Text field to enter the task name
    private JButton done; // Button to mark the task as done

    private boolean checked; //Boolean to track if the task is completed

    // Constructor
    public Task(){
        this.setPreferredSize(new Dimension(40,20)); // Set preferred size of the task panel
        this.setBackground(new Color(100, 149, 237)); // Set background color

        this.setLayout(new BorderLayout()); // Set layout to BorderLayout

        checked = false; // Initialize checked to false

        index = new JLabel(""); // Initialize index label
        index.setPreferredSize(new Dimension(20,20)); // Set preferred size for the label
        index.setHorizontalAlignment(JLabel.CENTER); // Center the text in the label
        this.add(index,BorderLayout.WEST); // Add label to the west of the panel

        taskName = new JTextField("Write your task here"); // Initialize task name text field
        taskName.setBorder(new EmptyBorder(5, 10, 5, 10)); // Remove border
        taskName.setBackground(new Color(173, 216, 230)); // Set background color to creamy blue
        this.add(taskName,BorderLayout.CENTER); // Add text field to the center of the panel

        done = new JButton("Done"); // Initialize DONE button
        done.setPreferredSize(new Dimension(40,20)); // Set preferred size for the button
        done.setBorder(BorderFactory.createEmptyBorder()); // Remove border
        done.setFocusPainted(false); // Remove focus painting
        this.add(done,BorderLayout.EAST); // Add button to the east of the panel
    }

    // Method to change the index of the task
    public void changeIndex(int num){
        this.index.setText(num + ""); // Update the label with the new index
        this.revalidate(); // Revalidate the panel to refresh the layout
    }

    // Method to get the DONE button
    public JButton getDoneButton(){
        return done;
    }

    // Method to get the state of the task (completed or not)
    public boolean getState(){
        return checked;
    }

    // Method to change the state of the task to completed
    public void toggleState(){
        if (!checked) {
            this.setBackground(new Color(0, 155, 0)); // Change background to green
            taskName.setBackground(new Color(100, 255, 100)); // Change task name background to light green
            checked = true; // Set checked to true
        } else {
            this.setBackground(Color.lightGray); // Revert background to light gray
            taskName.setBackground(Color.white); // revert task name background to white
            checked = false; // Set checked to false
        }
        revalidate(); // Revalidate the panel to refresh the layout
    }

}
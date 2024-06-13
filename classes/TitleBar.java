package classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{

    // Constructor
    public TitleBar(){
        this.setPreferredSize(new Dimension(400,80)); // Set the preferred size for the title bar

        JLabel titleText = new JLabel("To Do List"); // Create a label for the title text
        titleText.setPreferredSize(new Dimension(200, 80)); // Set preferred zise for the label
        titleText.setFont(new Font("Sans-Serif", Font.BOLD, 20)); // Set font for the label
        titleText.setHorizontalAlignment(JLabel.CENTER); // Center align the text in the label
        this.add(titleText); // Add the label to the panel
    }
}
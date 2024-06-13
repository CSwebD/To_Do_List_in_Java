package classes;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{

    public List(){
        GridLayout layout = new GridLayout(10,1); // 10 rows, 1 column
        layout.setVgap(5); // Vertical gap between components
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400,560)); // Preferred size of the panel
    }
    
    // Method to update the index of each task in the list
    public void updateNumbers(){
        Component[] listItems = this.getComponents(); // Get all components in the panel
        for(int i = 0; i < listItems.length; i++){
            if (listItems[i] instanceof Task){ // Check if the component is a Task
                ((Task)listItems[i]).changeIndex(i+1); // Update the task index (1-based)
            }
        }
    }

    // Method to remove completed tasks from the list
    public void removeCompletedTasks() {
        Component[] listItems = this.getComponents(); // Get all components in the panel
        for (Component c: listItems){
            if (c instanceof Task){ // Check if the component is a Task
                if (((Task)c).getState()){ // Check if the task is completed
                    this.remove(c); // Remove the completed task
                }
            }
        }
        
    this.revalidate(); // revalidate the panel to refresh the layout
    this.repaint(); // Repint the panel to reflect  the changes
    updateNumbers(); // Update the indices of the remaining tasks
    }
}
package classes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// Main class for the application frame, extends JFrame to create a window
public class AppFrame extends JFrame{

    private TitleBar title; // Title bar of the application
    private Footer footer; // Footer section of the application
    private List list; //List to hold tasks

    private JButton newTaskButton; // Button to add a new task
    private JButton clearButton; // Button to clear completed tasks

    // Constructor to initialize the frame
    public AppFrame(){
        setupFrame(); // Set up the frame properties
        initializeComponents(); // Initialize UI components
        addComponents(); // Add components to the frame
        setupEventListeners();
    }

    // Method to set up the frame properties
    private void setupFrame(){
        this.setSize(500,800); // Set the size of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        this.setVisible(true); // Make the frame visible
    }
    
    // Method to initialize UI components
    private void initializeComponents(){
        title = new TitleBar();
        footer = new Footer();
        list = new List();

        // Get buttons from the footer
        newTaskButton = footer.getNewTaskButton();
        clearButton = footer.getClearButton();
    }
    
    // Method to add components to the frame
    private void addComponents(){
        // Add the components to the frame
        this.add(title,BorderLayout.NORTH);
        this.add(footer,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);
    }
    
    // Method to set up event listeners to buttons
    public void setupEventListeners(){

        // Add mouse listener to 'newtask' button
        newTaskButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                createNewTask(); // Call method to create a new task
            }
        });
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                clearCompletedTasks(); // Call method to clear completed tasks
            }
        });
    }
    
    // Method to create a new task and add it to the list
    private void createNewTask(){
        // Create a new task and add it to the list
        Task task = new Task();
        list.add(task);
        list.updateNumbers(); // Update task numbers
        
        // Add mouse listener to 'done'
        task.getDoneButton().addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e){
                task.toggleState(); // Change the state of the task (completed or not)
                list.updateNumbers(); // Update the task numbers
                refreshUI(); // Refresh the frame
            }
        });
    }
    // Method to clear completed tasks from the task list
    private void clearCompletedTasks(){
        list.removeCompletedTasks(); // Remove completed tasks from the list
        refreshUI(); // Refresh the UI
    }
    
    // Method to refresh the UI
    private void refreshUI(){
        this.revalidate(); // Revalidate the frame
        this.repaint(); // Repaint the frame
    }

    // Main method to run the application
    public static void main(String[] args){
        new AppFrame(); // Create and display the application frame
    }
}
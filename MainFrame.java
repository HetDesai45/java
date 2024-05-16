import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class Example extends JFrame { 
    // Declaration of objects of JLabel class. 
    JLabel l1, l2; 
  
    // Constructor of Example class. 
    public Example() 
    { 
        // Creating Object of "FlowLayout" class 
        FlowLayout layout = new FlowLayout(FlowLayout.RIGHT,50,20); 
        this.setLayout(layout); 
  
        l1 = new JLabel("Label 1  "); 

        l2 = new JLabel("Label 2  "); 
  
        this.add(l1); 
        this.add(l2); 
    } 
} 
  
class MainFrame { 
    public static void main(String[] args) 
    { 
        // Creating Object of Example class. 
        Example f = new Example(); 
  
        // Function to set title of JFrame. 
        f.setTitle("Example of FlowLayout"); 
  
        // Function to set Bounds of JFrame. 
        f.setBounds(200, 100, 600, 400); 
  
        // Function to set visible status of JFrame. 
        f.setVisible(true); 
    } 
} 

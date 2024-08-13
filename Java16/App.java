import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame(); 
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.GREEN);

        label.setText("Hello World"); //set hello world text
        label.setHorizontalAlignment(JLabel.CENTER);  //align center 
        label.setVerticalAlignment(JLabel.TOP); //align top
        label.setForeground(Color.BLUE); //SET Text color

        frame.setTitle("Java Application");  //set title

        frame.setSize(620,620); //set size for window
        frame.setVisible(true); //set visibile window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Completely close application

        frame.getContentPane().setBackground(new Color(192, 192, 192)); //set background color

        frame.add(label);
        
       
    }
}
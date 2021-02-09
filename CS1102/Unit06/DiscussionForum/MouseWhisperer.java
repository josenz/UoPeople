import java.awt.event.*; // This is a package
import javax.swing.*; // This is another package

public class MouseWhisperer extends JFrame implements MouseListener { // JFrame is the SuperClass | MouseListener is the interface
    
    MouseWhisperer() {
        super("COME CLOSER"); // Call the JFrame constructor passing a String as its actual parameter.
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this); // event handler
        setVisible(true);
    }


    

    // This is after the main mouse's button is clicked.
    public void mouseClicked(MouseEvent e) { setTitle("OUCH"); }

    // This is when the main mouse's button is kept hold pressed.
    public void mousePressed(MouseEvent e) { setTitle("LET GO"); }

    // This is when the mouse cursor was dragged and released later on.
    public void mouseReleased(MouseEvent e) { setTitle("WHEW"); }

    // This is when the mouse cursor moves from outside to into the application's window.
    public void mouseEntered(MouseEvent e) { setTitle("I SEE YOU"); }

    // This is when the mouse cursor moves out of the application's window.
    public void mouseExited(MouseEvent e) { setTitle("COME CLOSER"); }
    public static void main(String[] args) { new MouseWhisperer(); }
}
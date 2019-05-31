package praktikumGUI;

import java.awt.Color;
import javax.swing.*;

/**
 * 
 * @author Greggy Gianini Firmansyah (1741720088 / TI-2F / 10)
 */

public class SimpelFrame 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        
        frame.setForeground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 50);
        frame.setSize(500, 100);
        frame.setTitle("Frame Koding itu mudah");
    }
}
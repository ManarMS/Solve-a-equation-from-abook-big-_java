import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class SquareComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct a rectangle and draw it
      Rectangle Square1 = new Rectangle(0, 0, 100,100);
       Rectangle Square2 = new Rectangle(40, 40, 20, 20);
        g2.draw(Square1);

      // Move rectangle 15 units to the right and 25 units down
     // Square1.translate(15, 25);

      // Draw moved rectangle
      g2.draw(Square2);
       Rectangle Square3 = Square1.intersection(Square2);
   }
}

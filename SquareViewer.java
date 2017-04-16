import javax.swing.JFrame;

public class SquareViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Two Square");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SquareComponent component = new SquareComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}

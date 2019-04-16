//Shrinath Iyer
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07 
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle a = new PolygonTurtle(100.0, 5);
         a.setColor(Color.BLUE);
         a.setThickness(6);
         a.drawShape();

         PolygonTurtle b = new PolygonTurtle();
         b.drawShape();
         
         PolygonTurtle c = new PolygonTurtle(50, 100, 50, 50, 10);
         c.setColor(Color.CYAN);
         c.drawShape(); 
         
         PolygonTurtle d = new PolygonTurtle(50, 400, 70, 40, 3);
         d.setColor(Color.RED);
         d.drawShape();
         
         PolygonTurtle e = new PolygonTurtle(40, 4);
         e.setColor(Color.ORANGE);
         e.drawShape();
         
         PolygonTurtle f = new PolygonTurtle(75, 8);
         f.setColor(new Color(24,36,92));
         f.drawShape();
         
      }
   }

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SleepyFace extends Applet implements KeyListener {
  int x = 150, y = 150;

  public void init() {
    setBackground(Color.white);
    addKeyListener(this);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(x, y, 100, 100); // face
    g.setColor(Color.blue);
    //g.fillOval(x+20, y+30, 20, 20); // left eye
    // g.fillOval(x+60, y+30, 20, 20); // right eye
    g.setColor(Color.red);
    // g.drawArc(x+20, y+50, 60, 40, 180, 180); // mouth
    g.drawLine(x+15,y+35,x+35,y+35);
    g.drawLine(x+65,y+35,x+85,y+35);
    g.drawLine(x+30,y+80,x+70,y+80);
  }

  // KeyListener methods
  public void keyTyped(KeyEvent e) {}

  public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    switch (keyCode) {
      case KeyEvent.VK_UP:
        y -= 10;
        break;
      case KeyEvent.VK_DOWN:
        y += 10;
        break;
      case KeyEvent.VK_LEFT:
        x -= 10;
        break;
      case KeyEvent.VK_RIGHT:
        x += 10;
        break;
    }
    repaint();
  }

  public void keyReleased(KeyEvent e) {}
}

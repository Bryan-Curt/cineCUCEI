import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
// ww w  .ja v a 2 s.  com
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewClass {

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          Image img = null;
          img = ImageIO
              .read(new URL("http://www.java2s.com/style/download.png"));

          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(new BorderLayout());
          frame.add(new ImagePanel(img));
          frame.pack();
          frame.setVisible(true);
        } catch (Exception exp) {
          exp.printStackTrace();
        }
      }
    });
  }

}

class ImagePanel extends JPanel {

  private static final long serialVersionUID = 1L;

  private Image img;
  private Image scaled;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
  }

  @Override
  public void invalidate() {
    super.invalidate();
    int width = getWidth();
    int height = getHeight();

    if (width > 0 && height > 0) {
      scaled = img.getScaledInstance(getWidth(), getHeight(),
          Image.SCALE_SMOOTH);
    }
  }

  @Override
  public Dimension getPreferredSize() {
    return img == null ? new Dimension(200, 200) : new Dimension(
        img.getWidth(this), img.getHeight(this));
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(scaled, 0, 0, null);
  }
}

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bryancurt
 */
public class PeliculaCatalog extends javax.swing.JPanel implements Runnable{

    public PeliculaCatalog() throws IOException {
        JFrame frame = new JFrame("Peliculas");

        JPanel panel = new JPanel();

        BufferedImage image = ImageIO.read(new File("src/visual/Forest Gump.jpg"));
        BufferedImage image2 = ImageIO.read(new File("src/visual/Milagros inesperados.jpg"));
        BufferedImage image3 = ImageIO.read(new File("src/visual/Coco.jpg"));
        BufferedImage i = resize(image, 300, 200);
        JLabel label = new JLabel(new ImageIcon(i));
        panel.add(label);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //Forest Gump
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(0, 0, i.getWidth(), i.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new reservarBoleto(0).setVisible(true); //lance l'interface de consultation
                        frame.dispose();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        BufferedImage i2 = resize(image2, 300, 200);
        JLabel label2 = new JLabel(new ImageIcon(i2));
        panel.add(label2);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //La ligne verte
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(200, 0, i2.getWidth(), i2.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new reservarBoleto(1).setVisible(true); //lance l'interface de consultation
                        frame.dispose();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        BufferedImage i3 = resize(image3, 300, 200);
        JLabel label3 = new JLabel(new ImageIcon(i3));
        panel.add(label3);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //coco
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(400, 0, i.getWidth(), i.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new reservarBoleto(2).setVisible(true); //lance l'interface de billet
                        frame.dispose();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PeliculaCatalog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the Jpanel to the main window
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    public void mouseClicked(MouseEvent me, JPanel target) {
        Point clicked = me.getPoint();
        Rectangle bounds = new Rectangle(0, 0, target.getWidth(), target.getHeight());
        if (bounds.contains(clicked)) {
            System.out.println("oui");
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

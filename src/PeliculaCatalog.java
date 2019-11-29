
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
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
public class PeliculaCatalog extends javax.swing.JPanel implements Runnable {

    public PeliculaCatalog() throws IOException {
        JFrame frame = new JFrame("Peliculas");
        
        //frame.setSize(1000, 600);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1030, 615));
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 8, dim.height/8);

        BufferedImage image = ImageIO.read(new File("src/visual/Forest Gump.jpg"));
        BufferedImage image2 = ImageIO.read(new File("src/visual/Milagros inesperados.jpg"));
        BufferedImage image3 = ImageIO.read(new File("src/visual/Coco.jpg"));
        BufferedImage image4 = ImageIO.read(new File("src/visual/Kimi no Na wa.jpg"));
        BufferedImage image5 = ImageIO.read(new File("src/visual/Cristiada.jpg"));
        BufferedImage image6 = ImageIO.read(new File("src/visual/Green Book.jpg"));
        BufferedImage image7 = ImageIO.read(new File("src/visual/La lista de Schindler.jpg"));
        BufferedImage image8 = ImageIO.read(new File("src/visual/12 hombres en pugna.jpg"));
        BufferedImage image9 = ImageIO.read(new File("src/visual/El padrino.jpg"));
        BufferedImage image10 = ImageIO.read(new File("src/visual/Bohemian Rhapsody.jpg"));

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
                        new ReservarBoleto(0).setVisible(true); //lance l'interface de consultation
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
                        new ReservarBoleto(1).setVisible(true); //lance l'interface de consultation
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
                Rectangle bounds = new Rectangle(400, 0, i3.getWidth(), i3.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(2).setVisible(true); //lance l'interface de billet
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

        BufferedImage i4 = resize(image4, 300, 200);
        JLabel label4 = new JLabel(new ImageIcon(i4));
        panel.add(label4);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //your name
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(600, 0, i4.getWidth(), i4.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(3).setVisible(true); //lance l'interface de consultation
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

        BufferedImage i5 = resize(image5, 300, 200);
        JLabel label5 = new JLabel(new ImageIcon(i5));
        panel.add(label5);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //Cristeros
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(800, 0, i5.getWidth(), i5.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(4).setVisible(true); //lance l'interface de consultation
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

        BufferedImage i6 = resize(image6, 300, 200);
        JLabel label6 = new JLabel(new ImageIcon(i6));
        panel.add(label6);
        Dimension size6 = label6.getPreferredSize();
        label6.setBounds(300, 300, size6.width, size6.height);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //Green book
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(0, 300, i6.getWidth(), i6.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(5).setVisible(true); //lance l'interface de consultation
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
        
                BufferedImage i7 = resize(image7, 300, 200);
        JLabel label7 = new JLabel(new ImageIcon(i7));
        
        Dimension size7 = label7.getPreferredSize();
        label6.setBounds(300, 300, size7.width, size7.height);
        panel.add(label7);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //La liste de shindler
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(200, 300, i7.getWidth(), i7.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(6).setVisible(true); //lance l'interface de consultation
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
        
                BufferedImage i8 = resize(image8, 300, 200);
        JLabel label8 = new JLabel(new ImageIcon(i8));
        panel.add(label8);
        Dimension size8 = label8.getPreferredSize();
        label8.setBounds(300, 300, size8.width, size8.height);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //12 hommes en colère
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(400, 300, i8.getWidth(), i8.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(7).setVisible(true); //lance l'interface de consultation
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
        
                BufferedImage i9 = resize(image9, 300, 200);
        JLabel label9 = new JLabel(new ImageIcon(i9));
        panel.add(label9);
        Dimension size9 = label9.getPreferredSize();
        label9.setBounds(300, 300, size9.width, size9.height);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //Le parrain
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(600, 300, i9.getWidth(), i9.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(8).setVisible(true); //lance l'interface de consultation
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
        
                BufferedImage i10 = resize(image10, 300, 200);
        JLabel label10 = new JLabel(new ImageIcon(i10));
        panel.add(label10);
        Dimension size10 = label.getPreferredSize();
        label10.setBounds(300, 300, size10.width, size10.height);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { //Bohemian Rapshody
                Point clicked = me.getPoint();
                Rectangle bounds = new Rectangle(800, 300, i10.getWidth(), i10.getHeight());
                if (bounds.contains(clicked)) {
                    try {
                        new ReservarBoleto(9).setVisible(true); //lance l'interface de consultation
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

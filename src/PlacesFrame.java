
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
public class PlacesFrame extends javax.swing.JPanel {

    public static void main(String[] arguments) throws IOException {
        JFrame frame = new JFrame("Peliculas");
        PlacesPanel p = new PlacesPanel(5);
        frame.add(p);
        frame.pack();
        frame.setSize(p.getHeight(),p.getWidth());
        frame.setVisible(true);
    }                
}

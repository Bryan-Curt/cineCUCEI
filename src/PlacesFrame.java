
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
public class PlacesFrame extends JFrame {

    public PlacesFrame(int places) {
        PlacesPanel p = new PlacesPanel(places);
        this.add(p);
        this.pack();
        this.setSize(p.getHeight(), p.getWidth());
        this.setVisible(true);
    }
    
    public void deleteFrame(){
        this.dispose();
    }
}

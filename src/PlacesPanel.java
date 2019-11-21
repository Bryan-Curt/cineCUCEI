
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soul
 */
public class PlacesPanel extends JPanel {
    private static final int ROWS = 5;
    private static final int COLS = 4;
    protected static Place[][] places;
    
    
    public PlacesPanel(){
        final Icon freeSeat = new ImageIcon("case_vide.jpg");
        places = new Place[ROWS][COLS];
        
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                int x = i;
                int y = j;
                places[i][j] = new Place(i,j);
                places[i][j].setIcon(freeSeat);
                places[i][j].addActionListener(event -> onClick(places[x][y]));
                this.add(places[i][j]);
                this.repaint();
            }
        }
        
        this.setVisible(true);
        this.setSize(400,400);
        this.setLayout(new GridLayout(ROWS,COLS));
    }
        private void onClick(Place seat) {
            if(seat.getState() == States.FREE){
                seat.setState(States.TAKEN);
                seat.setEnabled(false);
                seat.setDisabledIcon(new ImageIcon("case_touche.jpg"));
            }
            else{
                //Do nothing
            }
        }
}   


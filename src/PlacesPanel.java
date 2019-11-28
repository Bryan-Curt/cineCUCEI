
import java.awt.GridLayout;
import java.util.ArrayList;
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
    protected ArrayList<String> selectedPlaces = new ArrayList<>();
    protected int count = 0;
    protected String film;
    protected String id;
    protected String horario;
    protected int nbp = 0;
    protected boolean visible = true;

    public PlacesPanel(String film, String id, String horario, int nbPlaces) {
        final Icon freeSeat = new ImageIcon("src/visual/siege_vide.png");
        places = new Place[ROWS][COLS];
        this.film = film;
        this.id = id;
        this.horario = horario;
        nbp = nbPlaces;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                int x = i;
                int y = j;
                places[i][j] = new Place(i, j);
                places[i][j].setIcon(freeSeat);
                places[i][j].addActionListener(event -> onClick(places[x][y]));
                this.add(places[i][j]);
                this.repaint();
            }
        }
        if(visible){
        this.setVisible(true);
        this.setSize(40 * ROWS, 40 * COLS);
        this.setLayout(new GridLayout(ROWS, COLS));
        }
        else{
            this.setVisible(false);
           // Dulceria.setVisible(true);
        }
    }

    private void onClick(Place seat) {
        count++;
        if (seat.getState() == States.FREE) {
            seat.setState(States.TAKEN);
            seat.setEnabled(false);
            seat.setDisabledIcon(new ImageIcon("src/visual/siege_plein.png"));
            selectedPlaces.add(seat.toString());
            if (count == nbp) {
                for (int i = 0; i < ROWS; i++) {
                    for (int j = 0; j < COLS; j++) {
                        if (places[i][j].getState() == States.FREE) {
                            places[i][j].setEnabled(false);
                            visible = false;
                            
                        }
                    }
                }
                new GenererBillet(film,id,horario,selectedPlaces).setVisible(true);
            }
        }

    }
    private ArrayList getPlaces(){
        return selectedPlaces;
    }
}

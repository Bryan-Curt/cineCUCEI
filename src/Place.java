
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soul
 */
public class Place extends JButton {
    protected int X;
    protected int Y;
    protected States e;

    public Place(int x, int y) {
        X = x;
        Y = y;
        e = States.FREE;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void setState(States et) {
        e = et;
    }

    public States getState() {
        return e;
    }

    @Override
    public String toString(){
        String [] alphabet = {"0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        return ""+X+1+ alphabet[Y+1];
    }
}
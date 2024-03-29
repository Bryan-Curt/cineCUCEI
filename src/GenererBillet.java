
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bryancurt
 */
public class GenererBillet extends javax.swing.JFrame {

    /**
     * Creates new form GenererBillet
     */
    protected String film;
    protected String id;
    protected String horario;
    protected ArrayList selectedPlaces;

    public GenererBillet(String film, String id, String horario, ArrayList selectedPlaces) {
        initComponents();
        this.film = film;
        this.id = id;
        this.horario = horario;
        this.selectedPlaces = selectedPlaces;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 5, dim.height / 2 - this.getSize().height / 2);
        jLabel9.setText(String.valueOf(selectedPlaces.size() * 50) + " $");
        jLabel12.setText(String.valueOf(selectedPlaces.size() * 50) + " $");
        
        String membresia = "";
        String nombre = "";
        String apellidos = "";
        String direccion = "";
        String telefono = "";
        String puntos = "";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/cine?user=bryancurt&password=123456");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.cliente WHERE id_client = ?;");
            stmt.setInt(1, parseInt(id));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                membresia = rs.getString("membresia");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                direccion = rs.getString("direccion");
                telefono = rs.getString("telefono");
                puntos = rs.getString("puntos");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        jLabel13.setText(nombre + " " + apellidos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Descargar Boleto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/ezgif.com-resize.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/ezgif.com-resize copie 2.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/ezgif.com-resize copie.png"))); // NOI18N

        jSlider2.setMaximum(20);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jSlider1.setMaximum(20);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider3.setMaximum(20);
        jSlider3.setValue(0);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("0");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("0");

        jLabel3.setText("Precio pelicula:");

        jLabel5.setText("Precio dulceria:");

        jLabel9.setText("jLabel9");

        jLabel10.setText("0 $");

        jLabel11.setText("Precio total:");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(73, 73, 73)
                        .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)))
                                        .addGap(7, 7, 7)))
                                .addGap(70, 70, 70))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ID = "";
        String h = "";
        String membresia = "";
        String nombre = "";
        String apellidos = "";
        String direccion = "";
        String telefono = "";
        String puntos = "";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/cine?user=bryancurt&password=123456");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM public.cliente WHERE id_client = ?;");
            stmt.setInt(1, parseInt(id));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ID = this.id;
                h = this.horario;
                membresia = rs.getString("membresia");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                direccion = rs.getString("direccion");
                telefono = rs.getString("telefono");
                puntos = rs.getString("puntos");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        float percent = (float) 0.0;
        String member = "";
        if (membresia == "F") {
            member = "Fanatico";
            percent = (float) 0.1;
        } else {
            member = "SuperFanatico";
            percent = (float) 0.2;
        }
            float precioTotal = selectedPlaces.size() * 50 + Float.parseFloat(jLabel6.getText()) * 30 + Float.parseFloat(jLabel7.getText()) * 30 + Float.parseFloat(jLabel8.getText()) * 50;
            Float newPuntos = parseFloat(puntos) + precioTotal * percent;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/cine?user=bryancurt&password=123456");
            PreparedStatement stmt = con.prepareStatement("UPDATE public.cliente SET puntos = ? WHERE id_client = ?;");
            
            stmt.setFloat(1, newPuntos);
            stmt.setInt(2, parseInt(id));
            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

        String fileName = "boleto_" + nombre + ".pdf";
        try {
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();
            doc.addPage(page);
            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 32);
            content.moveTextPositionByAmount(200, 750);
            content.drawString("Boleto de cinema");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(25, 660);
            content.drawString("Id: #" + ID);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(25, 630);
            content.drawString("Nombre: " + nombre);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(25, 600);
            content.drawString("Apellidos: " + apellidos);
            content.endText();


            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(25, 570);
            content.drawString("Membresia: " + member + "  | Puntos: " + puntos + "   | + " + precioTotal * percent);
            content.endText();

            PDImageXObject pdImage = PDImageXObject.createFromFile("src/visual/" + film + ".jpg", doc);
            content.drawImage(pdImage, 40, 275, 187, 250);

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(275, 500);
            content.drawString("Pelicula: " + film);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(275, 470);
            content.drawString("Horario: " + horario);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(275, 440);
            content.drawString("Numero de personas: " + selectedPlaces.size());
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(275, 410);
            content.drawString("Sitios numero: ");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 15);
            content.moveTextPositionByAmount(275, 380);
            content.drawString("" + selectedPlaces);
            content.endText();

            float precioCinema = selectedPlaces.size() * 50;
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(275, 350);
            content.drawString("Precio cinema: " + precioCinema + " $");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(275, 320);
            content.drawString("Nuevo puntos: " + newPuntos);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 25);
            content.moveTextPositionByAmount(50, 230);
            content.drawString("Dulceria: ");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(50, 190);
            content.drawString("(30$) Palomitas: " + jLabel6.getText());
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(50, 160);
            content.drawString("(50$) Chocolate: " + jLabel8.getText());
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(50, 130);
            content.drawString("(30$) Refrescos: " + jLabel7.getText());
            content.endText();

            float dulceriaTotal = Float.parseFloat(jLabel6.getText()) * 30 + Float.parseFloat(jLabel7.getText()) * 30 + Float.parseFloat(jLabel8.getText()) * 50;
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 20);
            content.moveTextPositionByAmount(50, 100);
            content.drawString("Precio dulceria: " + dulceriaTotal + " $");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 30);
            content.moveTextPositionByAmount(250, 25);
            content.drawString("Precio total: " + precioTotal + " pesos");
            content.endText();

/////close
            content.close();
            doc.save(fileName);
            doc.close();

            //ticket dulceria
            String fileName2 = "boleto_" + nombre + "_Dulceria.pdf";

            PDDocument doc2 = new PDDocument();
            PDPage page2 = new PDPage();
            doc2.addPage(page2);
            PDPageContentStream content2 = new PDPageContentStream(doc2, page2);

            content2.beginText();
            content2.setFont(PDType1Font.HELVETICA, 32);
            content2.moveTextPositionByAmount(200, 750);
            content2.drawString("Boleto de dulceria");
            content2.endText();

            content2.beginText();
            content2.setFont(PDType1Font.HELVETICA, 25);
            content2.moveTextPositionByAmount(50, 660);
            content2.drawString("Dulceria: ");
            content2.endText();

            content2.beginText();
            content2.setFont(PDType1Font.HELVETICA, 20);
            content2.moveTextPositionByAmount(50, 630);
            content2.drawString("(30$) Palomitas: " + jLabel6.getText());
            content2.endText();

            content2.beginText();
            content2.setFont(PDType1Font.HELVETICA, 20);
            content2.moveTextPositionByAmount(50, 600);
            content2.drawString("(50$) Chocolate: " + jLabel8.getText());
            content2.endText();

            content2.beginText();
            content2.setFont(PDType1Font.HELVETICA, 20);
            content2.moveTextPositionByAmount(50, 570);
            content2.drawString("(30$) Refrescos: " + jLabel7.getText());
            content2.endText();

            content2.beginText();
            content2.setFont(PDType1Font.HELVETICA, 20);
            content2.moveTextPositionByAmount(50, 540);
            content2.drawString("Precio dulceria: " + dulceriaTotal + " $");
            content2.endText();

            PDImageXObject pdImage2 = PDImageXObject.createFromFile("src/visual/ezgif.com-resize.png", doc2);
            content2.drawImage(pdImage2, 25, 275, 200, 200);

            PDImageXObject pdImage3 = PDImageXObject.createFromFile("src/visual/ezgif.com-resize copie.png", doc2);
            content2.drawImage(pdImage3, 250, 275, 150, 250);

            PDImageXObject pdImage4 = PDImageXObject.createFromFile("src/visual/ezgif.com-resize copie 2.png", doc2);
            content2.drawImage(pdImage4, 400, 275, 200, 200);

            content2.close();
            doc2.save(fileName2);
            doc2.close();

            Window[] windows = Window.getWindows();
            for (Window window : windows) {
                window.dispose();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        float tDulces = jSlider1.getValue() * 30 + jSlider2.getValue() * 30 + jSlider3.getValue() * 50;
        jLabel7.setText(String.valueOf(jSlider2.getValue()));
        jLabel10.setText(String.valueOf(tDulces) + " $");
        jLabel9.setText(String.valueOf(selectedPlaces.size() * 50) + " $");
        jLabel12.setText(String.valueOf(tDulces + selectedPlaces.size() * 50) + " $");
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        float tDulces = jSlider1.getValue() * 30 + jSlider2.getValue() * 30 + jSlider3.getValue() * 50;
        jLabel10.setText(String.valueOf(tDulces) + " $");
        jLabel6.setText(String.valueOf(jSlider1.getValue()));
        jLabel9.setText(String.valueOf(selectedPlaces.size() * 50) + " $");
        jLabel12.setText(String.valueOf(tDulces + selectedPlaces.size() * 50) + " $");
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        float tDulces = jSlider1.getValue() * 30 + jSlider2.getValue() * 30 + jSlider3.getValue() * 50;
        jLabel10.setText(String.valueOf(tDulces) + " $");
        jLabel8.setText(String.valueOf(jSlider3.getValue()));
        jLabel9.setText(String.valueOf(selectedPlaces.size() * 50) + " $");
        jLabel12.setText(String.valueOf(tDulces + selectedPlaces.size() * 50) + " $");
    }//GEN-LAST:event_jSlider3StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenererBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenererBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenererBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenererBillet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    public void infoClient() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    // End of variables declaration//GEN-END:variables
}

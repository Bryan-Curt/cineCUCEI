/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Soul
 */
public class TableAffichage extends JFrame {

    public TableAffichage() {
        super();

        setTitle("Datas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/cine?user=bryancurt&password=123456");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.empleado");
            
            insertData(4, 123, 336032320, "Avenida Enrique diaz de leon", 8-18,"m",new Date(05,05,1998),"Louis");

    insertData(6, 113, 336023320, "Avenida chapultepec", 9-19,"f",new Date(05,05,1998),"Paula");

    insertData(7, 167, 124952320, "Avenida de la paz", 7-17,"f",new Date(05,05,1998),"Marie");

    insertData(8, 198, 320252320, "Avenida miguel hidalgo", 6-16,"m",new Date(05,05,1998),"Richard");

    insertData(9, 109, 334124567, "Calle del sombrero", 8-20,"f",new Date(05,05,1998),"Elena");

    insertData(10, 177, 234214567, "Calle de los hermanos", 13-23,"m",new Date(05,05,1998),"Oscar");
            ResultSetMetaData resultMeta = rs.getMetaData();
            setTitle("Datas");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            String[] columnNames = new String[resultMeta.getColumnCount()];
            for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                columnNames[i - 1] = resultMeta.getColumnName(i);
            }

            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] line = new Object[resultMeta.getColumnCount()]; // on créé un tableau pour stocker la ligne courante
                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    line[i - 1] = rs.getObject(i);
                }
                data.add(line); // on ajoute la ligne à la liste
            }
            table = new JTable(data.stream().toArray(Object[][]::new), columnNames); // on convertit la liste en tableau pour appeler le constructeur et créer une seule JTable
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        pack();
    }
    


    public void insertData(int id, int nms, int tel, String dirr, int hor, String sexo, Date fn, String n) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/cine?user=bryancurt&password=123456");
            String query = " INSERT INTO public.empleado (\n"
                    + "	\"idEmpleado\", \"numSeguroSocial\", telefono, direccion, horario, sexo, \"fechaNacimiento\", nombre)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setInt(2, nms);
            preparedStmt.setInt(3, tel);
            preparedStmt.setString(4, dirr);
            preparedStmt.setInt(5, hor);
            preparedStmt.setString(6, sexo);
            preparedStmt.setDate(7, fn);
            preparedStmt.setString(8, n);

            // execute the java penis preparedstatement
            preparedStmt.executeUpdate();

            con.close();
            System.out.println("Data ajouté");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

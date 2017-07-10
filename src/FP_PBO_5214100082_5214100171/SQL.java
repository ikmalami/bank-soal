package FP_PBO_5214100082_5214100171;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class SQL {
        String mydatabase   = "banksoal";
        String username     = "root";
        String password     = "";
        String query        = "SELECT * FROM soalbank";
        String url          = "jdbc:mysql://localhost:3306/"+ mydatabase;
        ResultSet rs;
        SQL() throws SQLException {
            
            java.sql.Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
                    
        }

    public LinkedList<Database> get() throws SQLException {
        LinkedList<Database> hasil = new LinkedList<>();
        while (rs.next()== true) {
                
            String matakuliah   = rs.getString("matakuliah");
            String pokokbahasan = rs.getString("pokokbahasan");
            String soal     = rs.getString("soal");
            String jawabanA = rs.getString("jawabanA");
            String jawabanB = rs.getString("jawabanB");
            String jawabanC = rs.getString("jawabanC");
            String jawabanD = rs.getString("jawabanD");
            String jawabanBenar = rs.getString("jawabanBenar");
            System.out.println ( "Mata Kuliah : " +matakuliah+ "\n"
                                + "Pokok Bahasan : " +pokokbahasan+ "\n"
                                + "Soal : " +soal+ "\n"
                                + "A : " +jawabanA+ "\n"
                                + "B : " +jawabanB+ "\n"
                                + "C : " +jawabanC+ "\n"
                                + "D : " +jawabanD+ "\n"
                                + "Jawaban : " +jawabanBenar+"\n");
            hasil.add(new Database(matakuliah, pokokbahasan, soal, jawabanA, jawabanB, jawabanC, jawabanD ));
        }
        return hasil;
    }
}
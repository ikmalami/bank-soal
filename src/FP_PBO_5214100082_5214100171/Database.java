package FP_PBO_5214100082_5214100171;
import java.io.Serializable;

/**
 *
 * @author user Fandhi Akhmad dan Rheindra Alfarizi
 */
public class Database implements Serializable {
    private String matakuliah, pokokbahasan , soal , jawabanA , jawabanB , jawabanC, jawabanD;
    
    public Database(){
        this (" " , " " ," " , " " , " "  , " " , " ");
    }
    
    public Database(String mk, String pb,String s,String ja,String jb,String jc,String jd){
        setMatakuliah(mk);
        setPokokbahasan(pb);
        setSoal(s);
        setJawabanA(ja);
        setJawabanB(jb);
        setJawabanC(jc);
        setJawabanD(jd);
        
    }

    Database(Object matakuliah, Object pokokbahasan, String soal, String jawabanA, String jawabanB, String jawabanC, String jawabanD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String mk) {
        matakuliah = mk;
    }

    public String getPokokbahasan() {
        return pokokbahasan;
    }

    public void setPokokbahasan(String pb) {
        pokokbahasan = pb;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String s) {
        soal = s;
    }

    public String getJawabanA() {
        return jawabanA;
    }

    public void setJawabanA(String ja) {
        jawabanA = ja;
    }

    public String getJawabanB() {
        return jawabanB;
    }

    public void setJawabanB(String jb) {
        jawabanB = jb;
    }

    public String getJawabanC() {
        return jawabanC;
    }

    public void setJawabanC(String jc) {
        jawabanC = jc;
    }

    public String getJawabanD() {
        return jawabanD;
    }

    public void setJawabanD(String jd) {
        jawabanD = jd;
    } 
}
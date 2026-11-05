package dvocas7.zadatak1;

import java.util.Objects;

public class Student {

    private String ime;

    private String prezime;

    private String brojIndeksa;

    private int ocena;

    public String getIme(){
        return ime;
    }

    public void setIme(String ime){
        if (ime == null || ime.isEmpty())
            System.out.println("GRESKA");
        else
            this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if (prezime == null || prezime.isEmpty())
            System.out.println("GRESKA");
        else
            this.prezime = prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        if (brojIndeksa == null || brojIndeksa.length() != 9 || !brojIndeksa.contains("/"))
            System.out.println("GRESKA");
        else
            this.brojIndeksa = brojIndeksa;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if (ocena < 5 || ocena > 10)
            System.out.println("GRESKA");
        else
            this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa='" + brojIndeksa + '\'' +
                ", ocena=" + ocena +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return Objects.equals(brojIndeksa, student.brojIndeksa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brojIndeksa);
    }
}

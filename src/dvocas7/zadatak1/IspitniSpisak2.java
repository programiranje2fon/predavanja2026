package dvocas7.zadatak1;

public class IspitniSpisak2 {

    private String nazivPredmeta;

    Student[] studenti;
    int brojac = 0;

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        if (nazivPredmeta == null || nazivPredmeta.isEmpty())
            System.out.println("GRESKA");
        else
            this.nazivPredmeta = nazivPredmeta;
    }

    public IspitniSpisak2(String nazivPredmeta, int brojStudenata){
        setNazivPredmeta(nazivPredmeta);

        if (brojStudenata > 0)
            studenti = new Student[brojStudenata];
        else{
            System.out.println("GRESKA");
            studenti = new Student[100];
        }
    }

    public void ispisi(){
        System.out.println("Naziv predmeta: " + nazivPredmeta);

        for (int i = 0; i < brojac; i++)
            System.out.println(studenti[i]);
    }

    public boolean daLiPostoji(Student student){
        for (int i = 0; i < brojac; i++)
            if (studenti[i].equals(student)) return true;

        return false;
    }

    public void unesiStudenta(Student noviStudent){
        if (daLiPostoji(noviStudent)){
            System.out.println("GRESKA: vec postoji");
            return;
        }

        if (brojac < studenti.length){
            studenti[brojac] = noviStudent;
            brojac++;
        }
        else
            System.out.println("GRESKA: niz je pun");
    }

    public double izracunajProsek(){
        double suma = 0;
        int brojPolozili = 0;

        for (int i = 0; i < brojac; i++)
            if (studenti[i].getOcena() > 5){
                suma = suma + studenti[i].getOcena();
                brojPolozili++;
            }

        return  suma / brojPolozili;
    }

    public int pronadjiNajvisuOcenu(){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < brojac; i++)
            if (studenti[i].getOcena() > max)
                max = studenti[i].getOcena();

        return max;
    }

    public double izracunajProlaznost(){
        int brojPolozili = 0;

        for (int i = 0; i < brojac; i++)
            if (studenti[i].getOcena() > 5)
                brojPolozili++;

        return (100.0 * brojPolozili) / brojac;
    }
}

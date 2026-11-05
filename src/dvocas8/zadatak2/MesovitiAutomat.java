package dvocas8.zadatak2;

public class MesovitiAutomat implements AutomatZaCokoladice, AutomatZaKafu {

    private int kolicinaKafe = 100;
    private int brojCokoladica = 35;
    private int kolicinaNovca = 0;

    @Override
    public void napraviKafu(int novac){
        if (novac >= 50 && kolicinaKafe >= 1){
            kolicinaNovca = kolicinaNovca + novac;
            kolicinaKafe--;
            System.out.println("Kafa je napravljena");
        }
        else System.out.println("GRESKA");
    }

    @Override
    public void izbaciCokoladicu(int novac){
        if (novac >= 60 && brojCokoladica >= 1){
            kolicinaNovca = kolicinaNovca + novac;
            brojCokoladica--;
            System.out.println("Cokoladica je izbacena");
        }
        else System.out.println("GRESKA");
    }

}

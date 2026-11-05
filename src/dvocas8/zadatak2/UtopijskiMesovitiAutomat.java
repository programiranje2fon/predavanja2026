package dvocas8.zadatak2;

public class UtopijskiMesovitiAutomat implements AutomatZaCokoladice, AutomatZaKafu{

    @Override
    public void izbaciCokoladicu(int novac) {
        System.out.println("Cokoladica je besplatna i izbacena je");
    }

    @Override
    public void napraviKafu(int novac) {
        System.out.println("Kafa je besplatna i napravljena je");
    }
}

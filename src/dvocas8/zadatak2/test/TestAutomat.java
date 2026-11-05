package dvocas8.zadatak2.test;

import dvocas8.zadatak2.AutomatZaCokoladice;
import dvocas8.zadatak2.AutomatZaKafu;
import dvocas8.zadatak2.MesovitiAutomat;
import dvocas8.zadatak2.UtopijskiMesovitiAutomat;

public class TestAutomat {

    public static void main(String[] args) {
        MesovitiAutomat ma = new MesovitiAutomat();

        ma.napraviKafu(50);
        ma.izbaciCokoladicu(60);

        UtopijskiMesovitiAutomat uma = new UtopijskiMesovitiAutomat();
        uma.izbaciCokoladicu(0);
        uma.napraviKafu(10);

        AutomatZaKafu ak = new MesovitiAutomat();
        ak.napraviKafu(60);
        //ak.izbaciCokoladicu(400);

        MesovitiAutomat ma2 = (MesovitiAutomat) ak;
        ma2.napraviKafu(50);
        ma2.izbaciCokoladicu(45);

        AutomatZaCokoladice ac = new MesovitiAutomat();
        ac.izbaciCokoladicu(70);
        //ac.napraviKafu(60);
    }
}

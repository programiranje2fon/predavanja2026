package dvocas3.zadatak1;

class Ispisivac {

    static final int MIN_OCENA = 1;
    static final int MAX_OCENA = 5;

    static void ispisiOcenu(int ocena){
        /*if (ocena < MIN_OCENA || ocena > MAX_OCENA)
            System.out.println("GRESKA: ocena je van raspona");
        else {
            if (ocena == 1) System.out.println("Nedovoljan");
            else
            if (ocena == 2) System.out.println("Dovoljan");
            else
            if (ocena == 3) System.out.println("Dobar");
            else
            if (ocena == 4) System.out.println("Vrlo dobar");
            else
                System.out.println("Odlican");
        }*/

        switch(ocena){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
            default:
                System.out.println("GRESKA: ocena je van raspona");
        }
    }

    // for while  do-while  for
    static void ispisiZdravo(){
        for (int i=1; i <= 5; i++)
            System.out.println("Zdravo");

        // Alternativno preko while petlje
        /*
        int i=1;
        while (i<=5){
            System.out.println("Zdravo");
            i++;
        }*/
    }

    static void ispisiPoruku(String poruka){
        /*for (int i = 1; i <= 10; i++)
            System.out.println(poruka);*/

        ispisiPoruku(poruka, 10);
    }

    static void ispisiPoruku(String poruka, int brojPuta){
        for (int i = 1; i <= brojPuta; i++)
            System.out.println(poruka);
    }

    static void ispisiBrojeveOd1Do20(){
        System.out.println("START");

        for (int i = 1; i <= 20; i++) {
            if (i == 15) continue;

            System.out.println( i );

            if (i == 18) return;
        }

        System.out.println("STOP");
    }

    static void vremeDupliranja(double novac, double kamata){
        double ciljniIznos = novac * 2;

        while(novac < ciljniIznos){
            novac = novac * (1 + kamata);
            System.out.println(novac);
        }

        //Alternativno preko for petlje
        /*
        for(double ciljniIznos = novac * 2 ; novac < ciljniIznos;System.out.println(novac))
            novac = novac * (1 + kamata);
        */
    }

}

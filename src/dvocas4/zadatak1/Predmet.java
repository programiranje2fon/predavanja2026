package dvocas4.zadatak1;

class Predmet {

    String naziv;

    int[] ocene; // = {5, 7, 8, 10, 10, 8};  //new int[10];

    Predmet(){
        ocene = new int[100];
    }

    Predmet(String naziv){
        this.naziv = naziv;
        ocene = new int[100];
    }

    Predmet(String naziv, int brojStudenata){
        this.naziv = naziv;

        if (brojStudenata > 0)
            ocene = new int[brojStudenata];
        else{
            ocene = new int[100];
            System.out.println("GRESKA");
        }
    }

    //  niz ocene  0   0    0    0    0
    //  indeksi    0   1    2    3    4
    void ispisi(){
        //for (int i = 0; i < ocene.length; i++)
        //  if (ocene[i] != 0)
        //    System.out.println( ocene[i] );

        for (int o : ocene)
            if (o != 0)
                System.out.println( o );
    }

    void unesiOcenu(int novaOcena){
        if (novaOcena < 5 || novaOcena > 10){
            System.out.println("GRESKA");
            return;
        }

        for (int i = 0; i < ocene.length ; i++)
            if (ocene[i] == 0){
                ocene[i] = novaOcena;
                return;
            }

        System.out.println("NEMA MESTA");
    }

    double izracunajProsek(){
        double suma = 0;
        int brojPolagali = 0;

        /*for (int i = 0; i < ocene.length; i++)
            if(ocene[i] != 0){
                suma = suma + ocene[i];
                brojPolagali++;
            }*/

        for (int oc : ocene)
            if (oc != 0){
                suma = suma + oc;
                brojPolagali++;
            }

        return suma / brojPolagali;
    }

    void pronadjiNajvisuOcenu(){
        int max = 0; //Integer.MIN_VALUE;

        /*for (int i = 0; i < ocene.length; i++)
            if (ocene[i] != 0 && ocene[i] > max)
                max = ocene[i];*/

        for( int oc: ocene)
            if (oc != 0 && oc > max)
                max = oc;

        System.out.println(max);
    }

    void izracunajProlaznost(){
        int brojPolagali = 0;
        int brojPolozili = 0;

        /*for (int i = 0; i < ocene.length; i++){
            if( ocene[i] != 0) brojPolagali++;

            if ( ocene[i] > 5) brojPolozili++;
        }*/

        for (int o : ocene){
            if( o != 0) brojPolagali++;

            if ( o > 5) brojPolozili++;
        }

        double procenatProlaznosti = (100.0 * brojPolozili) / brojPolagali;

        System.out.println( procenatProlaznosti );
    }

}

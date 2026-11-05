package dvocas6.zadatak1.student;

import dvocas6.zadatak1.osoba.Osoba;

public class Student extends Osoba {

    private String fakultet;

    private double prosek;

    public String vratiFakultet(){
        return fakultet;
    }

    public double vratiProsek(){
        return prosek;
    }

    public void postaviFakultet(String fakultet){
        if (fakultet == null)
            System.out.println("Fakultet ne sme biti null");
        else
            this.fakultet = fakultet;
    }

    public void postaviProsek(double prosek){
        if (prosek < 6 || prosek > 10)
            System.out.println("Prosek van raspona 6 - 10");
        else this.prosek = prosek;
    }

    /*@Override
    public void ispisi(){
        super.ispisi();
        System.out.print(", Fakultet: " + fakultet + ", Prosek: " + prosek);
    }*/

    public String toString(){
        return super.toString() + ", Fakultet: " + fakultet + ", Prosek: " + prosek;
    }

}


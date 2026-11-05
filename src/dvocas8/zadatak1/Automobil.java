package dvocas8.zadatak1;

public class Automobil extends MotornoVozilo{

    @Override
    public double izracunajRegistraciju() {
        return 6000 + getKubikaza()*8 + getSnaga()*2;
    }
}

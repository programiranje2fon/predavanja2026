package dvocas8.zadatak1;

public class Kamion extends MotornoVozilo{

    @Override
    public double izracunajRegistraciju() {
        return 30000 + getKubikaza() * 10 + getSnaga() * 5;
    }
}

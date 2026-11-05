package dvocas8.zadatak1;

import java.util.Objects;

public abstract class MotornoVozilo {

    private String markaModel;
    private String registarskaOznaka;
    private int kubikaza;
    private int snaga;

    public String getMarkaModel() {
        return markaModel;
    }

    public void setMarkaModel(String markaModel) {
        this.markaModel = markaModel;
    }

    public String getRegistarskaOznaka() {
        return registarskaOznaka;
    }

    public void setRegistarskaOznaka(String registarskaOznaka) {
        this.registarskaOznaka = registarskaOznaka;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public int getSnaga() {
        return snaga;
    }

    public void setSnaga(int snaga) {
        this.snaga = snaga;
    }

    @Override
    public String toString() {
        return "MotornoVozilo{" +
                "markaModel='" + markaModel + '\'' +
                ", registarskaOznaka='" + registarskaOznaka + '\'' +
                ", kubikaza=" + kubikaza +
                ", snaga=" + snaga +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof MotornoVozilo that)) return false;

        return Objects.equals(registarskaOznaka, that.registarskaOznaka);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registarskaOznaka);
    }

    abstract public double izracunajRegistraciju();
}

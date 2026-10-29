package dvocas5.zadatak2;

import java.time.LocalDateTime;

class TestFilmskaPremijera {

    public static void main(String[] args) {
        FilmskaPremijera fp = new FilmskaPremijera();

        fp.postaviNaziv("Addams Familiy 2");

        LocalDateTime amerika = LocalDateTime.of(2026, 11,15, 0, 0);
        LocalDateTime svet = LocalDateTime.of(2026, 11,16, 0, 0);

        fp.postaviDatumePremijera(amerika, svet);

        fp.ispisi();

        fp.pomeriPremijere();

        fp.ispisi();
    }
}

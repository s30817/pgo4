import java.util.ArrayList;

public class Student {
    public String imie;
    public String nazwisko;
    public String indexNumber;
    public String email;
    public String adres;

    public StudentGroup groups;

    public ArrayList<Double>oceny;
    public double calculateAvarage(){
        if (oceny.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma żadnej oceny");
        }
        double avg = 0;
        for (double ocena : oceny) {
            avg += ocena;
        }
        avg /= oceny.size();

        double[] zaokraglonaListaWartosci = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double najblizszaWartosc = zaokraglonaListaWartosci[0];
        for (double value : zaokraglonaListaWartosci) {
            if (Math.abs(avg - value) < Math.abs(avg - najblizszaWartosc)) {
                najblizszaWartosc = value;
            }
        }
        avg = najblizszaWartosc;

        return avg;
    }
}

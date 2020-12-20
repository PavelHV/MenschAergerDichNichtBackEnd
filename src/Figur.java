import java.awt.*;

public class Figur {
    private int nummerSpielerZugehoerigkeit;
    private Color farbe;
    private int aktuelleSpieldFeldNummer;

    public Figur(Color farbe) {
        this.farbe = farbe;
    }

    //Alle Getter Methoden
    public int getNummerSpielerZugehoerigkeit() {
        return nummerSpielerZugehoerigkeit;
    }

    public Color getFarbe() {
        return farbe;
    }

    public int getAktuelleSpieldFeldNummer() {
        return aktuelleSpieldFeldNummer;
    }

    //Alle Setter Methoden

    public void setAktuelleSpieldFeldNummer(int aktuelleSpieldFeldNummer) {
        this.aktuelleSpieldFeldNummer = aktuelleSpieldFeldNummer;
    }

    public void setNummerSpielerZugehoerigkeit(int nummerSpielerZugehoerigkeit) {
        this.nummerSpielerZugehoerigkeit = nummerSpielerZugehoerigkeit;
    }
}

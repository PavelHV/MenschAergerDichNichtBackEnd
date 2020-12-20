import java.awt.*;

public class SpielFeldZiel extends SpielFeld {
    private int nummerSpielerZugehoerigkeit;
    public SpielFeldZiel(int spielFeldNummer, Color farbe) {
        super(spielFeldNummer, farbe);
    }

    public int getNummerSpielerZugehoerigkeit() {
        return nummerSpielerZugehoerigkeit;
    }

    public void setNummerSpielerZugehoerigkeit(int nummerSpielerZugehoerigkeit) {
        this.nummerSpielerZugehoerigkeit = nummerSpielerZugehoerigkeit;
    }
}

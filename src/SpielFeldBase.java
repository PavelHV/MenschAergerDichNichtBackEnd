import java.awt.*;

public class SpielFeldBase extends SpielFeld {
    private int nummerSpielerZugehoerigkeit;
    public SpielFeldBase(int spielFeldNummer, Color farbe) {
        super(spielFeldNummer, farbe);
    }

    public int getNummerSpielerZugehoerigkeit() {
        return nummerSpielerZugehoerigkeit;
    }

    public void setNummerSpielerZugehoerigkeit(int nummerSpielerZugehoerigkeit) {
        this.nummerSpielerZugehoerigkeit = nummerSpielerZugehoerigkeit;
    }
}

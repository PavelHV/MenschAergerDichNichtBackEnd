import java.awt.*;

public class SpielFeld {
    private int spielFeldNummer;
    private Color farbe;
    private boolean isBesetzt;
    private int besetztFigurNummer;

    public SpielFeld(int spielFeldNummer, Color farbe) {
        this.spielFeldNummer = spielFeldNummer;
        this.farbe = farbe;
        this.isBesetzt = false;
    }

    //Alle Getter Methoden
    public int getSpielFeldNummer() {
        return spielFeldNummer;
    }

    public Color getFarbe() {
        return farbe;
    }

    public boolean isBesetzt() {
        return isBesetzt;
    }

    public int getBesetztFigurNummer() {
        return besetztFigurNummer;
    }

    //Alle Setter Methoden
    public void setBesetzt(boolean besetzt) {
        isBesetzt = besetzt;
    }

    public void setBesetztFigurNummer(int besetztFigurNummer) {
        this.besetztFigurNummer = besetztFigurNummer;
    }
}

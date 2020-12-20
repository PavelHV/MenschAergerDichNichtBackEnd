import java.awt.*;

public class Spieler {
    //Kleine Anmerkung:
    //Ich würde eher nur eine Klasse für spieler erstellen, die denn Booleam isComputer enthält, anstatt drei Klassen zu erstellen
    protected String name;
    protected int nummer;
    protected Color farbe;
    protected boolean imSpiel;
    protected int feldNummer;
    protected Figur[] figuren = new Figur[4];

    public Spieler(String name, int nummer, Color farbe, int feldNummer, Figur[] figuren) {
        this.name = name;
        this.nummer = nummer;
        this.farbe = farbe;
        this.imSpiel = false;//wird zum Start immer False sein.
        this.feldNummer = feldNummer;
        this.figuren = figuren;
    }

    //Alle Getter Methoden
    public String getName() {
        return name;
    }

    public int getNummer() {
        return nummer;
    }

    public Color getFarbe() {
        return farbe;
    }

    public boolean isImSpiel() {
        return imSpiel;
    }

    public int getFeldNummer() {
        return feldNummer;
    }

    public Figur[] getFiguren() {
        return figuren;
    }

    //Aller Setter Methoden
    public void setImSpiel(boolean imSpiel) {
        this.imSpiel = imSpiel;
    }
}

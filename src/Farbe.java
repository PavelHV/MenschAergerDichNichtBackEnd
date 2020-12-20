public class Farbe {
    //Würde ich komplett anders machen. Für farben gibt es bereits die Klasse Color, die Sowohl namen als auch HEXcode beeinhaltet.
    //Für jede Farbe eine eigene Klasse zu schreiben, ist extrem schlechter Code und einfach nur unnötig
    private String name;
    private String hexCode;

    public Farbe(String name, String hexCode) {
        this.name = name;
        this.hexCode = hexCode;
    }

    public String getName() {
        return name;
    }

    public String getHexCode() {
        return hexCode;
    }
}

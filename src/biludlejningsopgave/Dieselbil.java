package biludlejningsopgave;

public class Dieselbil extends Bil {

    private boolean harPartikelFilter;
    private double kmPrL;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Mærke: " + this.getMærke() + "\nModel: " + this.getModel()
                + "\nRegistreringsnummer: " + this.getRegNr() + "\nÅrgang: "
                + this.getÅrgang() + "\nAntal døre: " + this.getAntalDøre()
                + "\nKilometer per Liter: " + kmPrL
                + "\nHar / har ikke Partikel Filter: " + harPartikelFilter;
    }

    @Override
    public double beregnGrønEjerafgift() {
        //Jeg har sat det op i en form af en nested if, sådan at den først
        //tjekker om der er partikel filter i bilen og derefter tjekkker hvor
        //meget den kan køre per liter for at finde frem til den endelige pris.
        if (harPartikelFilter == true) {
            if (kmPrL >= 20) {
                return 330 + 130;
            } else if (kmPrL >= 15 && kmPrL < 20) {
                return 1050 + 1390;
            } else if (kmPrL >= 10 && kmPrL < 15) {
                return 2340 + 1850;
            } else if (kmPrL >= 5 && kmPrL < 10) {
                return 5500 + 2770;
            } else if (kmPrL >= 1 && kmPrL < 5) {
                return 10470 + 15260;
            }
        } else {
            if (kmPrL >= 20) {
                return 330 + 130 + 1000;
            } else if (kmPrL >= 15 && kmPrL < 20) {
                return 1050 + 1390 + 1000;
            } else if (kmPrL >= 10 && kmPrL < 15) {
                return 2340 + 1850 + 1000;
            } else if (kmPrL >= 5 && kmPrL < 10) {
                return 5500 + 2770 + 1000;
            } else if (kmPrL >= 1 && kmPrL < 5) {
                return 10470 + 15260 + 1000;
            }
        }
        return -1;
    }

}

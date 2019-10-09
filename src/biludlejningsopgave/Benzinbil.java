package biludlejningsopgave;

public class Benzinbil extends Bil {

    private int oktanTal;
    private double kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktanTal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
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
                + "\nKilometer per Liter: " + kmPrL + "\nOktantal: " + oktanTal;
    }

    @Override
    public double beregnGrønEjerafgift() {
        //Jeg antager at rækkeviden er inklusiv, og oppefra og dermed tager jeg
        // 20 med i den billigeste rækkevidde, og det går derfor nedad herefter.
        if (kmPrL >= 20) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else if (kmPrL >= 1 && kmPrL < 5) {
            return 10470;
        }
        return -1;
    }

}

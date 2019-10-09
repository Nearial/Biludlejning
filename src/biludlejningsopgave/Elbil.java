package biludlejningsopgave;

public class Elbil extends Bil {

    private double batteriKapacitetKWh;
    private double maxKm;
    private double whPrKm;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, double batteriKapacitetKWh, double maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(double batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Mærke: " + this.getMærke() + "\nModel: " + this.getModel()
                + "\nRegistreringsnummer: " + this.getRegNr() + "\nÅrgang: "
                + this.getÅrgang() + "\nAntal døre: " + this.getAntalDøre()
                + "\nBatteri Kapacitet(KW/h)" + batteriKapacitetKWh
                + "\nWatt per Kilometer: " + whPrKm
                + "\nMax KM for fuld Batteri: " + maxKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        //Først omregnes der fra Watt/h per kilometer til liter per kilometer, 
        // dernæst det samme som for benzinbilen.
        double tilKmPr100L = (whPrKm / 91.25);
        double tilKmPrL = (100 / tilKmPr100L);
        if (tilKmPrL >= 20) {
            return 330;
        } else if (tilKmPrL >= 15 && tilKmPrL < 20) {
            return 1050;
        } else if (tilKmPrL >= 10 && tilKmPrL < 15) {
            return 2340;
        } else if (tilKmPrL >= 5 && tilKmPrL < 10) {
            return 5500;
        } else if (tilKmPrL >= 1 && tilKmPrL < 5) {
            return 10470;
        }
        return -1;
    }

}

package biludlejningsopgave;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> Garage = new ArrayList();

    public void add(Bil bil) {
        Garage.add(bil);
    }

    @Override
    public String toString() {
        String result = "";
        for (Bil bil : Garage) {
            result += bil + "\n";
        }
        return result;
    }

    public String beregnGrønAfgiftForBilpark() {
        int afgift = 0;
        for (Bil bil : Garage) {
            afgift += bil.beregnGrønEjerafgift();
        }
        return "Den sammenlagte Grøn Ejerafgift af alle biler i garagen: " + afgift;
    }
}

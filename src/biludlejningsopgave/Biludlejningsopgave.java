package biludlejningsopgave;

public class Biludlejningsopgave {

    public static void main(String[] args) {

        Garage garage = new Garage();
        //følgende er fantasi biler og repræsentere ikke virkelig modeler eller 
        //deres virkelige statistikker. 
        Bil benzinbil = new Benzinbil("AF22454", "Nissan", "Qashqai", 2019, 4, 95, 23);
        Bil dieselbil = new Dieselbil("HG30202", "Toyota", "Aygo", 2008, 4, true, 17);
        Bil elbil = new Elbil("YU57648", "Tesla", "Model S", 2014, 4, 85, 510, 200);
        Bil filterfridieselbil = new Dieselbil("GY13707", "Ford", "Kuga", 2016, 4, false, 13);
        garage.add(benzinbil);
        garage.add(dieselbil);
        garage.add(elbil);
        garage.add(filterfridieselbil);
        System.out.println(garage.toString());
        System.out.println(garage.beregnGrønAfgiftForBilpark());

    }

}

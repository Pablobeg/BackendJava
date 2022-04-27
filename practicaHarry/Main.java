package practicaHarry;

public class Main {
    public static void main(String[] args) {
        Snape snape = new Snape(38, "Slytherin",
                "Masculino", "Snape","Voldermort",
                "Cierva","Mestiza");
        System.out.println(snape.showMessage());

        Draco draco = new Draco(42,"Slytherin",
                "Masculino","Draco","Desconocido",
                "Desconocido","Pura");
        System.out.println(draco.showMessage());

        Ron ron = new Ron(42,"Gryffindor","Ron",
                "Masculino","Acromántula","Jack Rusell",
                "Pura");
        System.out.println(ron.showMessage());

        Dumbledore dumbledore = new Dumbledore(116,"Gryffindor",
                "Masculino", "Dumbledore","Hermana",
                "Fénix","Mestiza");
        System.out.println(dumbledore.showMessage());

        Voldemort voldemort = new Voldemort(71,"Masculino",
                "Tom Ryddle", "Slytherin","su propia muerte",
                "Desconocido","Mestiza");
        System.out.println(voldemort.showMessage());
    }
}

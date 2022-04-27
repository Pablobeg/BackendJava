package practicaMona;

public class Octocats {
    public static void main(String[] args) {

        Dojocat dojo = new Dojocat(66,"Dojocat","Ninja Profesional",
                "Desconocida","Traje ninja negro","Sigilo",
                "Espada","Desconocido");
        System.out.println(dojo.showMessage());

        Boxertocat boxer = new Boxertocat(139,"Boxertocat","Boxeador Profesional",
                "Desconocida","Kit de Boxeo","luchar",
                "Guantes","Cuando toca la campana");
        System.out.println(boxer.showMessage());

        Grinchtocat grinch = new Grinchtocat(109,"Grinchtocat","Bromista",
                "Desconocida","Traje de Santa","Sigilo",
                "Bolsa de hurto","Todas excepto navidad");
        System.out.println(grinch.showMessage());

        Saritocat sarito =new Saritocat(112,"Saritocat","Dios","Hindu",
                "Sari Hindu","Todas","Corona","Todas");

        System.out.println(sarito.showMessage());

        PrivateInvestocat privado = new PrivateInvestocat(119,"Private Investocat","Detective profesional",
                "Desconocida","Detective","Deduccion","Pipa y maletin",
                "Ninguna");
        System.out.println(privado.showMessage());

        SaintNicotocat santa = new SaintNicotocat(130,"Saint Nictocat","Santa",
                "mundial","Santa","Organizado","campana",
                "Navidad");
        System.out.println(santa.showMessage());



    }
}

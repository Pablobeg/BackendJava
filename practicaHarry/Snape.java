package practicaHarry;

public class Snape {
    //caracteristicas
    int edad;
    String casa;
    String genero;
    String nombre;
    String boggart;
    String pattronus;
    String sangre;

    public Snape(int edad, String casa, String genero, String nombre,
                 String boggart, String pattronus, String sangre){
        this.edad = edad;
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.pattronus = pattronus;
        this.sangre = sangre;
    }
    //getters
    public int getEdad(){ return edad; }
    public String getCasa(){ return casa; }
    public String getGenero(){ return genero; }
    public String getNombre(){ return nombre; }
    public String getBoggart(){ return boggart; }
    public String getPattronus(){ return pattronus; }
    public String getSangre(){ return sangre; }

    //setters
    public Boolean setEdad(int edad){
        if (edad > 0){
            this.edad = edad;
            return true;
        }else
            return false;
    }
    public Boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }
    public Boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public Boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public Boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public Boolean setPattronus(String pattronus){
        if (!pattronus.isEmpty()){
            this.pattronus = pattronus;
            return true;
        }else
            return false;
    }
    public Boolean setSangre(String sangre){
        if (!sangre.isEmpty()){
            this.sangre = sangre;
            return true;
        }else
            return false;
    }

    //mensaje con datos
    public String showMessage(){
        String s = "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Casa: " + casa + "\n" +
                "Genero: " + genero + "\n" +
                "Sangre: " + sangre + "\n" +
                "Boggart: " + boggart + "\n" +
                "Pattronus: " + pattronus + "\n";
        return s;
    }

}

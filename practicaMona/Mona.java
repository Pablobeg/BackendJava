package practicaMona;

public class Mona {
     int id;
     String nombre;
     String profesion;
     String nacionalidad;
     String vestimenta;
     String habilidad;
     String accesorios;
     String temporada;

     public Mona(int id, String nombre, String profesion, String nacionalidad, String vestimenta,
                 String habilidad, String accesorios, String temporada) {
          this.id = id;
          this.nombre = nombre;
          this.profesion = profesion;
          this.nacionalidad = nacionalidad;
          this.vestimenta = vestimenta;
          this.habilidad = habilidad;
          this.accesorios = accesorios;
          this.temporada = temporada;
     }

     public int getId() { return id;}

     public String getNombre() { return nombre; }

     public String getProfesion() { return profesion; }

     public String getNacionalidad() { return nacionalidad; }

     public String getVestimenta() { return vestimenta; }

     public String getHabilidad() { return habilidad; }

     public String getAccesorios() { return accesorios; }

     public String getTemporada() { return temporada; }

     public Boolean setId(int id) {
          if(id > 0) {
               this.id = id;
               return true;
          }else
               return false;
     }

     public Boolean setNombre(String nombre) {
          if (!nombre.isEmpty()) {
               this.nombre = nombre;
               return true;
          }else
               return false;
     }

     public Boolean setProfesion(String profesion) {
          if (!profesion.isEmpty()) {
               this.profesion = profesion;
               return true;
          }else
               return false;
     }

     public Boolean setNacionalidad(String nacionalidad) {
          if (!nacionalidad.isEmpty()) {
               this.nacionalidad = nacionalidad;
               return true;
          }else
               return false;
     }

     public Boolean setVestimenta(String vestimenta) {
         if(!vestimenta.isEmpty()) {
              this.vestimenta = vestimenta;
              return true;
         }else
              return false;
     }

     public Boolean setHabilidad(String habilidad) {
          if(!habilidad.isEmpty()) {
               this.habilidad = habilidad;
               return true;
          }else
               return false;
     }

     public Boolean setAccesorios(String accesorios) {
          if(!accesorios.isEmpty()) {
               this.accesorios = accesorios;
               return true;
          }else
               return false;
     }

     public Boolean setTemporada(String temporada) {
          if (!temporada.isEmpty()) {
               this.temporada = temporada;
               return true;
          }else
               return false;
     }
     public String showMessage(){
          return "Hola mi nombre es: "+nombre+"\n"+
                  "Mi id: "+id+"\n"+
                  "Mi nacionalidad es: "+nacionalidad+"\n"+
                  "Estoy vistiendo: "+vestimenta+"\n"+
                  "Mis accesorios son: "+accesorios+"\n"+
                  "Mi habilidad es: "+habilidad+"\n"+
                  "Mi temporada favorita es:"+temporada+"\n"+
                  "Mi nacionalidad es:"+nacionalidad+"\n";
     }
}

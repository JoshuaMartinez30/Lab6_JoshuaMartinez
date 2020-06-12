package lab6_joshuamartinez;
public class SeresVivos {
    private String nombre;
    private int Poder, año;
    private String planeta, raza;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, int Poder, int año, String planeta, String raza) {
        this.nombre = nombre;
        this.Poder = Poder;
        this.año = año;
        this.planeta = planeta;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", Poder=" + Poder + ", a\u00f1o=" + año + ", planeta=" + planeta + ", raza=" + raza + '}';
    }
    
    
}

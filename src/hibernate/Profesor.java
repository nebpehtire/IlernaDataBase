package hibernate;

public class Profesor {

    int id;
    String nombre;
    String sexo;

    public Profesor() {
    }

    /**
     * Constructor pasando parámetros nombre y sexo
     * @param nombre
     * @param sexo
     */
    public Profesor(String nombre, String sexo)
    {
        this.nombre = nombre;
        this.sexo = sexo;
    }


    /**  GETTERS y SETTERS, no importa comentarlos....         */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    /**
     * @return devuelve Profesor{ID=id, nombre=nombre, sexo= sexo"}
     */
    @Override
    public String toString() {
        return "Profesor{" +
                "ID=" + id +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

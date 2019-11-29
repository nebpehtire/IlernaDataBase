package hibernate;

public class Modulo {

    int id;
    String nombre;
    String codigo;

    public Modulo(){}

    /**
     * Constructor pasando nombre y codigo
     * @param nombre
     * @param codigo
     */
    public Modulo(String nombre, String codigo)
    {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    /** GETTER Y SETTER, no hacen falta comentar*/
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    /**
     * @return devuelve Modulo{ID=id, nombre=nombre, codigo= codigo"}
     */
    @Override
    public String toString() {
        return "Modulo{" +
                "ID=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}

package hibernate;

import java.util.List;

public class Alumno {
    int id;
    String nombre;
    String nacionalidad;
    int edad;
    String sexo;
    List<Modulo> modulos;

    public Alumno(){}

    public Alumno(String nombre, String nacionalidad, int edad, String sexo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
    }

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public String modulosToJson(){
        String result = "";
        for (Modulo modulo : modulos)
        {
            result += "\"" + modulo.getCodigo() +"\",";
        }
        return result;

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "ID=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

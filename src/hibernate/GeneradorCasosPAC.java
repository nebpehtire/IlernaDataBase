package hibernate;

import java.lang.reflect.Array;
import java.util.Random;

public class GeneradorCasosPAC {

    private String[] nombres = {"Pepe", "Carlos", "Jesús", "Lola", "Rosa", "Maria"};
    private String[] nacionalidades = {"Español", "Argentino", "Uruguayo", "Apátrida"};
    private String[] sexos = {"Hombre","Mujer","Andrógino", "Pangénero","Sin género"};
    private String[] nombresModulos = {"Ingeniería aerospacial", "Acceso a Datos", "¿Cómo cocinar al horno a un profesor?","Aprende a iniciar un ordenador"};

    public int getAge(){
        return new Random().nextInt(130) + 14;  //un alumno de ilerna mínimo tiene que cumplir 15 años en el año en curso...
    }


    /**
     * @return un nombre de persona aleatorio
     */
    public String getName(){
        int random = new Random().nextInt(nombres.length);
        return nombres[random];
    }

    /**
     * @return una nacionalidad aleatoria
     */
    public String getNation()
    {
        int random = new Random().nextInt(nacionalidades.length);
        return nacionalidades[random];
    }


    /**
     * @return un género aleatorio  (no diferenciaremos por el nombre...)
     */
    public  String getGendre(){
        int random = new Random().nextInt(sexos.length);
        return sexos[random];
    }


    /**
     * @return un nombre de asignatura aleatorio
     */
    public String getModuleName(){
        int random = new Random().nextInt(nombresModulos.length);
        return nombresModulos[random];
    }


    /**
     * @return un código aleatorio entre M01 y M20
     */
    public String getCodigo(){
        String resultado = "M";
        int random = new Random().nextInt(19) + 1;
        if (random < 10)
        {
            resultado += "0" + random;
        } else {
            resultado += random;
        }

        return resultado;

    }


    /**
     * Constructor de la clase necesario para ser utilizada
     */
    public GeneradorCasosPAC(){}

}

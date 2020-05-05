/*
 * Managed Bean para el formulario estudiante.
 */
//declaramos nuestro paquete (donde esta almacenado este archivo Managed Bean)
package beans;

//imports necesarios para que el bean funcione (segundo import es para un alcance tipo request)
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Juan Jose Rangel
 */
@RequestScoped
@Named
public class mbeanEmpleado {

    /**
     * contructor de la clase
     */
    public mbeanEmpleado() {
    }

    //variables privadas donde se almacenan los datos recibidos
    private String nombre;
    private String apellido;
    private String cedula; //proceso especial para la variable sexo
    private String fecha;
    private String idiomas[]; //materias es una matriz tipo string (metodos un poco diferentes)
    private String nivel;
    private String dias;
    private String salario;
    //funciones para accesar a las variables privadas
    //set asigna valor a la variable
    //get nos permite ver el valor de la variable

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}

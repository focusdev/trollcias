/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.objetosNegocio;

/**
 * Clase que permite la crear y editar los atributos
 * de un objeto que representa proveedor.
 * 
 * @author Focus Dev
 */
public class Proveedor {
    private String id_proveedor;
    private String nombreProveedor;
    private String direccionProveedor;
    private String telefonoProveedor;
    private Libro[] titulosDisponibles;

    /**
     * Constructor por defecto de la clase Proveedor.
     */
    public Proveedor() {
    }

    /**
     * Constructor de la clase libro que crea un objeto
     * Proveedor inicializando el valor del atributo id_proveedor
     * al valor de su parametro.
     * @param id_proveedor ID del proveedor
     */
    public Proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    /**
     * Constructor de la clase libro que crea un objeto
     * Proveedor inicializando el valor de sus atributos
     * al valor de su parametro.
     * @param id_proveedor ID del proveedor
     * @param nombreProveedor Nombre del proveedor
     * @param direccionProveedor Direccion del proveedor
     * @param telefonoProveedor Telefono de proveedor
     * @param titulosDisponibles Arreglo de titulos disponibles
     */
    public Proveedor(String id_proveedor, String nombreProveedor, String direccionProveedor, String telefonoProveedor, Libro[] titulosDisponibles) {
        this.id_proveedor = id_proveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.titulosDisponibles = titulosDisponibles;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo direccionProveedor de la clase.
     * @return Direccion del proveedor
     */
    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    /**
     * Metodo que establece el valor del 
     * atributo direccionProveedor al valor de su parametro.
     * @param direccionProveedor Direccion del proveedor a establecer
     */
    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo id_proveedor de la clase.
     * @return ID del proveedor
     */
    public String getId_proveedor() {
        return id_proveedor;
    }

    /**
     * Metodo que establece el valor del 
     * atributo id_proveedor al valor de su parametro.
     * @param id_proveedor ID del proveedor a establecer
     */
    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo nombreProveedor de la clase.
     * @return Nombre del proveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * Metodo que establece el valor del 
     * atributo nombreProveedor al valor de su parametro.
     * @param nombreProveedor Nombre del proveedor a establecer
     */
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * Metodo que regresa el valor del 
     * atributo telefonoProveedor de la clase.
     * @return Telefono del proveedor
     */
    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    /**
     * Metodo que establece el valor del 
     * atributo telefonoProveedor al valor de su parametro.
     * @param telefonoProveedor Telefono del proveedor a establecer
     */
    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    /**
     * Metodo que regresa el valor de los objetos
     * dentro del arreglo titulosDisponibles de la clase.
     * @return Arreglo de titulos disponibles
     */
    public Libro[] getTitulosDisponibles() {
        return titulosDisponibles;
    }

    /**
     * Metodo que establece el valor de los objetos
     * dentro del arreglo titulosDisponibles al valor de su parametro.
     * @param titulosDisponibles Arreglos de titulos a establecer
     */
    public void setTitulosDisponibles(Libro[] titulosDisponibles) {
        this.titulosDisponibles = titulosDisponibles;
    }

    /**
     * Metodo toString que regresa una cadena con los
     * valores de todos los atributos de la clase.
     * @return Cadena con los valores de todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Proveedor{" + "id_proveedor=" + id_proveedor + ", nombreProveedor=" + nombreProveedor + ", direccionProveedor=" + direccionProveedor + ", telefonoProveedor=" + telefonoProveedor + ", titulosDisponibles=" + titulosDisponibles + '}';
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos.persistencia;

import negocios.objetosNegocio.Libro;
import negocios.objetosNegocio.Pedido;
import negocios.objetosNegocio.Proveedor;

/**
 *
 * @author ignacio
 */
public class Persistencia extends FachadaPersistencia{

    public Persistencia() {
    }
    
    @Override
    public Pedido getListaPedido(){
        return null; 
    }
    
    public Libro agregarLibro(Libro libro){
        return null;
    }
    
    public Proveedor agregarProvedor(Proveedor provedor){
        return null; 
    }
    
    public Pedido agregarPedido(Pedido pedido){
        return null; 
    }

}

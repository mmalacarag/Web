package com.ipn.mx.modelo.dto;

import com.ipn.mx.modelo.entidades.MovimientosInventario;
import java.io.Serializable;
import lombok.Data;

@Data
public class MovimientosInventarioDTO implements Serializable{
    private MovimientosInventario entidad;
    
    public MovimientosInventarioDTO(){
        entidad = new MovimientosInventario();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clave: ").append(entidad.getIdMovimientosInventario()).append("\n");
        sb.append("Tipo Movimiento: ").append(entidad.getTipoMovimiento()).append("\n");
        sb.append("Fecha Movimiento: ").append(entidad.getFechaMovimiento()).append("\n");
        sb.append("Cantidad: ").append(entidad.getCantidad()).append("\n");
        sb.append("Producto: ").append(entidad.getIdProducto()).append("\n");
        return sb.toString();
    }   
}

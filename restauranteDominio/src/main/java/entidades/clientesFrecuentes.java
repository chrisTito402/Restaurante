/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author multaslokas33
 */
@Entity
@Table(name = "ClienteFrecuente")
@PrimaryKeyJoinColumn(name = "cliente_id")
public class clientesFrecuentes extends Cliente {

    @Column(name = "cantidad_visitas", nullable = false)
    private int visitas;
    @Column(name = "puntos", nullable = false)
    private int puntos;
    @Column(name = "total_gastado", nullable = false)
    private double totalGastado;

    public clientesFrecuentes() {
    }

    public clientesFrecuentes(int visitas, int puntos, double totalGastado) {
        this.visitas = visitas;
        this.puntos = puntos;
        this.totalGastado = totalGastado;
    }

    public clientesFrecuentes(int visitas, int puntos, double totalGastado, Long id, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String correo, Date fechaRegistro, List<Comanda> comandas) {
        super(id, nombre, apellidoPaterno, apellidoMaterno, telefono, correo, fechaRegistro, comandas);
        this.visitas = visitas;
        this.puntos = puntos;
        this.totalGastado = totalGastado;
    }

    public clientesFrecuentes(int visitas, int puntos, double totalGastado, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String correo, Date fechaRegistro, List<Comanda> comandas) {
        super(nombre, apellidoPaterno, apellidoMaterno, telefono, correo, fechaRegistro, comandas);
        this.visitas = visitas;
        this.puntos = puntos;
        this.totalGastado = totalGastado;
    }
    
    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(double totalGastado) {
        this.totalGastado = totalGastado;
    }

    @Override
    public String toString() {
        return "clientesFrecuentes{" + "visitas=" + visitas + ", puntos=" + puntos + ", totalGastado=" + totalGastado + '}';
    }
  
}

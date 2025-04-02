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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author multaslokas33
 */
@Entity
@Table(name= "Clientes_Frecuentes")
public class clienteFrecuente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false,length = 255)
    private String nombre;
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    @Column(name = "correo",length = 255)
    private String correo;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
    @Column(name = "puntos")
    private int puntos;
    
    @OneToMany(mappedBy = "cliente")
    private List<Comanda> comandas;

    public clienteFrecuente() {
    }

    public clienteFrecuente(Long id, String nombre, String telefono, String correo, Date fechaRegistro, int puntos, List<Comanda> comandas) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
        this.puntos = puntos;
        this.comandas = comandas;
    }

    public clienteFrecuente(String nombre, String telefono, String correo, Date fechaRegistro, int puntos, List<Comanda> comandas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
        this.puntos = puntos;
        this.comandas = comandas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof clienteFrecuente)) {
            return false;
        }
        clienteFrecuente other = (clienteFrecuente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clienteFrecuente{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", fechaRegistro=" + fechaRegistro + ", puntos=" + puntos + ", comandas=" + comandas + '}';
    }
    
}

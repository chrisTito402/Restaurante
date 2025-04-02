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
        return "entidades.clienteFrecuente[ id=" + id + " ]";
    }
    
}

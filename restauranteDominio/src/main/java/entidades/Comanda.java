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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author multaslokas33
 */
@Entity
@Table(name= "Comandas")
public class Comanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "folio", nullable = false, length = 50)
    private String folio;
    @Column(name = "estado", nullable = false, length = 50)
    private String estado;
    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaYHora;
    
    @OneToMany(mappedBy = "comanda")
    private List<ComandaProducto> productos;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteFrecuente cliente;

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;

    public Comanda() {
    }

    public Comanda(Long id, String folio, String estado, LocalDateTime fechaYHora, List<ComandaProducto> productos, ClienteFrecuente cliente, Mesa mesa) {
        this.id = id;
        this.folio = folio;
        this.estado = estado;
        this.fechaYHora = fechaYHora;
        this.productos = productos;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public Comanda(String folio, String estado, LocalDateTime fechaYHora, List<ComandaProducto> productos, ClienteFrecuente cliente, Mesa mesa) {
        this.folio = folio;
        this.estado = estado;
        this.fechaYHora = fechaYHora;
        this.productos = productos;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
    public List<ComandaProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<ComandaProducto> productos) {
        this.productos = productos;
    }

    public ClienteFrecuente getCliente() {
        return cliente;
    }

    public void setCliente(ClienteFrecuente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
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
        if (!(object instanceof Comanda)) {
            return false;
        }
        Comanda other = (Comanda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comanda{" + "id=" + id + ", folio=" + folio + ", estado=" + estado + ", fechaYHora=" + fechaYHora + ", productos=" + productos + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }

}

package modelos;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productooucr")
public class productoOUCR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private LocalDate fechavencimiento;
    private byte estatus;
    private int existencia;


    public productoOUCR() {
    }


    public productoOUCR(int id, String nombre, String descripcion, double precio, LocalDate fechavencimiento,
            byte estatus, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechavencimiento = fechavencimiento;
        this.estatus = estatus;
        this.existencia = existencia;
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


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public LocalDate getFechavencimiento() {
        return fechavencimiento;
    }


    public void setFechavencimiento(LocalDate fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }


    public byte getEstatus() {
        return estatus;
    }


    public void setEstatus(byte estatus) {
        this.estatus = estatus;
    }


    public int getExistencia() {
        return existencia;
    }


    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    
    
}

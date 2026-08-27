package pe.gob.ministeriopublico.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "sede")
public class sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sede")
    private Integer idSede;

    @ManyToOne
    @JoinColumn(name = "id_distrito_fiscal", nullable = false)
    @JsonIgnore
    private distrito_fiscal distritoFiscal;

    @Column(name = "nombre_sede", nullable = false, length = 150)
    private String nombreSede;

    @Column(length = 300)
    private String direccion;

    public sede() {
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public distrito_fiscal getDistritoFiscal() {
        return distritoFiscal;
    }

    public void setDistritoFiscal(distrito_fiscal distritoFiscal) {
        this.distritoFiscal = distritoFiscal;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
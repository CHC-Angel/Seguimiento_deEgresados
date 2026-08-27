package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "distrito_fiscal")
public class distrito_fiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito_fiscal")
    private Integer idDistritoFiscal;

    @Column(name = "nombre_distrito", nullable = false, length = 150)
    private String nombreDistrito;

    public distrito_fiscal() {
    }

    public Integer getIdDistritoFiscal() {
        return idDistritoFiscal;
    }

    public void setIdDistritoFiscal(Integer idDistritoFiscal) {
        this.idDistritoFiscal = idDistritoFiscal;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
}
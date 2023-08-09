package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COTI_TIPOCOMMESSA")
public class CotiTipocommessa implements Serializable {
    private static final long serialVersionUID = -3015005378833064515L;
    @Id
    @Column(name = "COTI_TIPOCOMMESSAID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "COTI_TIPOCOMMESSADESC", nullable = false, length = 100)
    private String cotiTipocommessadesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "COTI_SYSUSER", nullable = false, length = 50)
    private String cotiSysuser;

    @Column(name = "COTI_SYSDATE")
    private LocalDate cotiSysdate;

    @Column(name = "COTI_FLAG_ATTIVA")
    private Integer cotiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCotiTipocommessadesc() {
        return cotiTipocommessadesc;
    }

    public void setCotiTipocommessadesc(String cotiTipocommessadesc) {
        this.cotiTipocommessadesc = cotiTipocommessadesc;
    }

    public String getCotiSysuser() {
        return cotiSysuser;
    }

    public void setCotiSysuser(String cotiSysuser) {
        this.cotiSysuser = cotiSysuser;
    }

    public LocalDate getCotiSysdate() {
        return cotiSysdate;
    }

    public void setCotiSysdate(LocalDate cotiSysdate) {
        this.cotiSysdate = cotiSysdate;
    }

    public Integer getCotiFlagAttiva() {
        return cotiFlagAttiva;
    }

    public void setCotiFlagAttiva(Integer cotiFlagAttiva) {
        this.cotiFlagAttiva = cotiFlagAttiva;
    }
}
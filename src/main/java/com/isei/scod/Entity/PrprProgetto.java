package com.isei.scod.Entity;

import jakarta.persistence.*;
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
@Table(name = "PRPR_PROGETTO")
public class PrprProgetto implements Serializable {
    private static final long serialVersionUID = 5497157821321657270L;
    @Id
    @Column(name = "PRPR_PROGETTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRPR_FK_ORDIORDINEID")
    private OrdiOrdine prprFkOrdiordineid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_TIPOCOMMESSAID")
    private CotiTipocommessa tipoTipocommessaid;

    @Size(max = 255)
    @NotNull
    @Column(name = "PRPR_NOME", nullable = false)
    private String prprNome;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRPR_SYSUSER", nullable = false, length = 50)
    private String prprSysuser;

    @Column(name = "PRPR_SYSDATE")
    private LocalDate prprSysdate;

    @Column(name = "PRPR_FLAG_ATTIVA")
    private Integer prprFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrdiOrdine getPrprFkOrdiordineid() {
        return prprFkOrdiordineid;
    }

    public void setPrprFkOrdiordineid(OrdiOrdine prprFkOrdiordineid) {
        this.prprFkOrdiordineid = prprFkOrdiordineid;
    }

    public CotiTipocommessa getTipoTipocommessaid() {
        return tipoTipocommessaid;
    }

    public void setTipoTipocommessaid(CotiTipocommessa tipoTipocommessaid) {
        this.tipoTipocommessaid = tipoTipocommessaid;
    }

    public String getPrprNome() {
        return prprNome;
    }

    public void setPrprNome(String prprNome) {
        this.prprNome = prprNome;
    }

    public String getPrprSysuser() {
        return prprSysuser;
    }

    public void setPrprSysuser(String prprSysuser) {
        this.prprSysuser = prprSysuser;
    }

    public LocalDate getPrprSysdate() {
        return prprSysdate;
    }

    public void setPrprSysdate(LocalDate prprSysdate) {
        this.prprSysdate = prprSysdate;
    }

    public Integer getPrprFlagAttiva() {
        return prprFlagAttiva;
    }

    public void setPrprFlagAttiva(Integer prprFlagAttiva) {
        this.prprFlagAttiva = prprFlagAttiva;
    }
}
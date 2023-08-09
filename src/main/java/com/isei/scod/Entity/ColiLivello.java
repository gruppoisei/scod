package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COLI_LIVELLO")
public class ColiLivello implements Serializable {
    private static final long serialVersionUID = 4313956977601241016L;
    @Id
    @Column(name = "COLI_LIVELLOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COLI_FK_COCCCCNLID")
    private CoccCcnl coliFkCoccccnlid;

    @Size(max = 50)
    @Column(name = "COLI_LIVELLOCONTRATTO", length = 50)
    private String coliLivellocontratto;

    @Size(max = 50)
    @NotNull
    @Column(name = "COLI_SYSUSER", nullable = false, length = 50)
    private String coliSysuser;

    @Column(name = "COLI_SYSDATE")
    private LocalDate coliSysdate;

    @Column(name = "COLI_FLAG_ATTIVA")
    private Integer coliFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CoccCcnl getColiFkCoccccnlid() {
        return coliFkCoccccnlid;
    }

    public void setColiFkCoccccnlid(CoccCcnl coliFkCoccccnlid) {
        this.coliFkCoccccnlid = coliFkCoccccnlid;
    }

    public String getColiLivellocontratto() {
        return coliLivellocontratto;
    }

    public void setColiLivellocontratto(String coliLivellocontratto) {
        this.coliLivellocontratto = coliLivellocontratto;
    }

    public String getColiSysuser() {
        return coliSysuser;
    }

    public void setColiSysuser(String coliSysuser) {
        this.coliSysuser = coliSysuser;
    }

    public LocalDate getColiSysdate() {
        return coliSysdate;
    }

    public void setColiSysdate(LocalDate coliSysdate) {
        this.coliSysdate = coliSysdate;
    }

    public Integer getColiFlagAttiva() {
        return coliFlagAttiva;
    }

    public void setColiFlagAttiva(Integer coliFlagAttiva) {
        this.coliFlagAttiva = coliFlagAttiva;
    }
}
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
@Table(name = "GEPR_PROVINCIA")
public class GeprProvincia implements Serializable {
    private static final long serialVersionUID = -4267294874641208132L;
    @Id
    @Column(name = "GEPR_PROVINCIAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GEPR_FK_GERE_REGIONEID")
    private GereRegione geprFkGereRegioneid;

    @Size(max = 200)
    @NotNull
    @Column(name = "GEPR_DENO", nullable = false, length = 200)
    private String geprDeno;

    @Size(max = 2)
    @NotNull
    @Column(name = "GEPR_SIGLA", nullable = false, length = 2)
    private String geprSigla;

    @Size(max = 50)
    @NotNull
    @Column(name = "GEPR_SYSUSER", nullable = false, length = 50)
    private String geprSysuser;

    @Column(name = "GEPR_SYSDATE")
    private LocalDate geprSysdate;

    @Column(name = "GEPR_FLAG_ATTIVA")
    private Integer geprFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GereRegione getGeprFkGereRegioneid() {
        return geprFkGereRegioneid;
    }

    public void setGeprFkGereRegioneid(GereRegione geprFkGereRegioneid) {
        this.geprFkGereRegioneid = geprFkGereRegioneid;
    }

    public String getGeprDeno() {
        return geprDeno;
    }

    public void setGeprDeno(String geprDeno) {
        this.geprDeno = geprDeno;
    }

    public String getGeprSigla() {
        return geprSigla;
    }

    public void setGeprSigla(String geprSigla) {
        this.geprSigla = geprSigla;
    }

    public String getGeprSysuser() {
        return geprSysuser;
    }

    public void setGeprSysuser(String geprSysuser) {
        this.geprSysuser = geprSysuser;
    }

    public LocalDate getGeprSysdate() {
        return geprSysdate;
    }

    public void setGeprSysdate(LocalDate geprSysdate) {
        this.geprSysdate = geprSysdate;
    }

    public Integer getGeprFlagAttiva() {
        return geprFlagAttiva;
    }

    public void setGeprFlagAttiva(Integer geprFlagAttiva) {
        this.geprFlagAttiva = geprFlagAttiva;
    }
}
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
@Table(name = "ORSP_TIPOSERVIZIOPRODOTTO")
public class OrspTiposervizioprodotto implements Serializable {
    private static final long serialVersionUID = 1279683733438118121L;
    @Id
    @Column(name = "ORSP_TIPOSERVIZIOPRODOTTOID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "ORSP_PRODSERVNOME")
    private String orspProdservnome;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORSP_SYSUSER", nullable = false, length = 50)
    private String orspSysuser;

    @Column(name = "ORSP_SYSDATE")
    private LocalDate orspSysdate;

    @Column(name = "ORSP_FLAG_ATTIVA")
    private Integer orspFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrspProdservnome() {
        return orspProdservnome;
    }

    public void setOrspProdservnome(String orspProdservnome) {
        this.orspProdservnome = orspProdservnome;
    }

    public String getOrspSysuser() {
        return orspSysuser;
    }

    public void setOrspSysuser(String orspSysuser) {
        this.orspSysuser = orspSysuser;
    }

    public LocalDate getOrspSysdate() {
        return orspSysdate;
    }

    public void setOrspSysdate(LocalDate orspSysdate) {
        this.orspSysdate = orspSysdate;
    }

    public Integer getOrspFlagAttiva() {
        return orspFlagAttiva;
    }

    public void setOrspFlagAttiva(Integer orspFlagAttiva) {
        this.orspFlagAttiva = orspFlagAttiva;
    }
}
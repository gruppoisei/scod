package com.isei.scod.DTO;

import com.isei.scod.Entity.GereRegione;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class ProvinciaDTO {

    private Integer id;

    private RegioneDTO geprFkGereRegioneid;

    @Size(max = 200)
    @NotNull
    private String geprDeno;

    @Size(max = 2)
    @NotNull
    private String geprSigla;

    @Size(max = 50)
    @NotNull
    private String geprSysuser;

    private LocalDate geprSysdate;

    private Integer geprFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RegioneDTO getGeprFkGereRegioneid() {
        return geprFkGereRegioneid;
    }

    public void setGeprFkGereRegioneid(RegioneDTO geprFkGereRegioneid) {
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

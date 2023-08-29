
package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TipocommessaDTO {

    private Integer id;

    @Size(max = 100)
    @NotNull
    private String cotiTipocommessadesc;

    @Size(max = 50)
    @NotNull
    private String cotiSysuser;

    private LocalDate cotiSysdate;

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
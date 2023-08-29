package com.isei.scod.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TitoloStudioDTO {

    private Integer id;

    @Size(max = 255)
    private String anstTitolostudiodesc;

    @Size(max = 50)
    @NotNull
    private String anstSysuser;

    private LocalDate anstSysdate;

    private Integer anstFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnstTitolostudiodesc() {
        return anstTitolostudiodesc;
    }

    public void setAnstTitolostudiodesc(String anstTitolostudiodesc) {
        this.anstTitolostudiodesc = anstTitolostudiodesc;
    }

    public String getAnstSysuser() {
        return anstSysuser;
    }

    public void setAnstSysuser(String anstSysuser) {
        this.anstSysuser = anstSysuser;
    }

    public LocalDate getAnstSysdate() {
        return anstSysdate;
    }

    public void setAnstSysdate(LocalDate anstSysdate) {
        this.anstSysdate = anstSysdate;
    }

    public Integer getAnstFlagAttiva() {
        return anstFlagAttiva;
    }

    public void setAnstFlagAttiva(Integer anstFlagAttiva) {
        this.anstFlagAttiva = anstFlagAttiva;
    }
}
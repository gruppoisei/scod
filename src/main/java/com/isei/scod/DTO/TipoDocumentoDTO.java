package com.isei.scod.DTO;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumentoDTO {

    private Integer id;

    @Size(max = 100)
    private String altaTipodocumentodesc;

    @Size(max = 50)
    @NotNull
    private String altaSysuser;

    private LocalDate altaSysdate;

    private Integer altaFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAltaTipodocumentodesc() {
        return altaTipodocumentodesc;
    }

    public void setAltaTipodocumentodesc(String altaTipodocumentodesc) {
        this.altaTipodocumentodesc = altaTipodocumentodesc;
    }

    public String getAltaSysuser() {
        return altaSysuser;
    }

    public void setAltaSysuser(String altaSysuser) {
        this.altaSysuser = altaSysuser;
    }

    public LocalDate getAltaSysdate() {
        return altaSysdate;
    }

    public void setAltaSysdate(LocalDate altaSysdate) {
        this.altaSysdate = altaSysdate;
    }

    public Integer getAltaFlagAttiva() {
        return altaFlagAttiva;
    }

    public void setAltaFlagAttiva(Integer altaFlagAttiva) {
        this.altaFlagAttiva = altaFlagAttiva;
    }
}

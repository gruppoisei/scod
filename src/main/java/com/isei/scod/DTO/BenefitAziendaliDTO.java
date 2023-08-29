package com.isei.scod.DTO;

import com.isei.scod.Entity.AntbTipobenefitaziendali;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class BenefitAziendaliDTO {

    private Integer id;

    private TipoBenefitAziendaliDTO anbaFkAntbTipobenefitid;

    private PersonaDTO anbaFkAnpePersonaid;

    @Size(max = 50)
    @NotNull
    private String anbaSysuser;

    private LocalDate anbaSysdate;

    private Integer anbaFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoBenefitAziendaliDTO getAnbaFkAntbTipobenefitid() {
        return anbaFkAntbTipobenefitid;
    }

    public void setAnbaFkAntbTipobenefitid(TipoBenefitAziendaliDTO anbaFkAntbTipobenefitid) {
        this.anbaFkAntbTipobenefitid = anbaFkAntbTipobenefitid;
    }

    public PersonaDTO getAnbaFkAnpePersonaid() {
        return anbaFkAnpePersonaid;
    }

    public void setAnbaFkAnpePersonaid(PersonaDTO anbaFkAnpePersonaid) {
        this.anbaFkAnpePersonaid = anbaFkAnpePersonaid;
    }

    public String getAnbaSysuser() {
        return anbaSysuser;
    }

    public void setAnbaSysuser(String anbaSysuser) {
        this.anbaSysuser = anbaSysuser;
    }

    public LocalDate getAnbaSysdate() {
        return anbaSysdate;
    }

    public void setAnbaSysdate(LocalDate anbaSysdate) {
        this.anbaSysdate = anbaSysdate;
    }

    public Integer getAnbaFlagAttiva() {
        return anbaFlagAttiva;
    }

    public void setAnbaFlagAttiva(Integer anbaFlagAttiva) {
        this.anbaFlagAttiva = anbaFlagAttiva;
    }
}

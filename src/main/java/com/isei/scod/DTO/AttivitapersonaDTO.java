package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class AttivitapersonaDTO {

    private Integer id;


    private PersonaDTO prapFkAnpepersonaid;

    private RuoloprogettoDTO prapFkPrrpruoloprogettoid;

    private AttivitaprogettoDTO prapFkPratattivitaprogettoid;

    @Size(max = 50)
    @NotNull
    private String prapSysuser;

    private LocalDate prapSysdate;

    private Integer prapFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaDTO getPrapFkAnpepersonaid() {
        return prapFkAnpepersonaid;
    }

    public void setPrapFkAnpepersonaid(PersonaDTO prapFkAnpepersonaid) {
        this.prapFkAnpepersonaid = prapFkAnpepersonaid;
    }

    public RuoloprogettoDTO getPrapFkPrrpruoloprogettoid() {
        return prapFkPrrpruoloprogettoid;
    }

    public void setPrapFkPrrpruoloprogettoid(RuoloprogettoDTO prapFkPrrpruoloprogettoid) {
        this.prapFkPrrpruoloprogettoid = prapFkPrrpruoloprogettoid;
    }

    public AttivitaprogettoDTO getPrapFkPratattivitaprogettoid() {
        return prapFkPratattivitaprogettoid;
    }

    public void setPrapFkPratattivitaprogettoid(AttivitaprogettoDTO prapFkPratattivitaprogettoid) {
        this.prapFkPratattivitaprogettoid = prapFkPratattivitaprogettoid;
    }

    public String getPrapSysuser() {
        return prapSysuser;
    }

    public void setPrapSysuser(String prapSysuser) {
        this.prapSysuser = prapSysuser;
    }

    public LocalDate getPrapSysdate() {
        return prapSysdate;
    }

    public void setPrapSysdate(LocalDate prapSysdate) {
        this.prapSysdate = prapSysdate;
    }

    public Integer getPrapFlagAttiva() {
        return prapFlagAttiva;
    }

    public void setPrapFlagAttiva(Integer prapFlagAttiva) {
        this.prapFlagAttiva = prapFlagAttiva;
    }
}
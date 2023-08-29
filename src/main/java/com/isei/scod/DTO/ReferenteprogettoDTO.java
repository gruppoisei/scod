package com.isei.scod.DTO;

import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.PrprProgetto;
import com.isei.scod.Entity.PrrpRuoloprogetto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class ReferenteprogettoDTO{

    private Integer id;

    private PersonaDTO prreFkAnpepersonaid;

    private RuoloprogettoDTO prreFkPrrpruoloprogettoid;

    private ProgettoDTO prreFkPrprprogettoid;

    @Size(max = 50)
    @NotNull
    private String prreSysuser;

    private LocalDate prreSysdate;

    private Integer prreFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaDTO getPrreFkAnpepersonaid() {
        return prreFkAnpepersonaid;
    }

    public void setPrreFkAnpepersonaid(PersonaDTO prreFkAnpepersonaid) {
        this.prreFkAnpepersonaid = prreFkAnpepersonaid;
    }

    public RuoloprogettoDTO getPrreFkPrrpruoloprogettoid() {
        return prreFkPrrpruoloprogettoid;
    }

    public void setPrreFkPrrpruoloprogettoid(RuoloprogettoDTO prreFkPrrpruoloprogettoid) {
        this.prreFkPrrpruoloprogettoid = prreFkPrrpruoloprogettoid;
    }

    public ProgettoDTO getPrreFkPrprprogettoid() {
        return prreFkPrprprogettoid;
    }

    public void setPrreFkPrprprogettoid(ProgettoDTO prreFkPrprprogettoid) {
        this.prreFkPrprprogettoid = prreFkPrprprogettoid;
    }

    public String getPrreSysuser() {
        return prreSysuser;
    }

    public void setPrreSysuser(String prreSysuser) {
        this.prreSysuser = prreSysuser;
    }

    public LocalDate getPrreSysdate() {
        return prreSysdate;
    }

    public void setPrreSysdate(LocalDate prreSysdate) {
        this.prreSysdate = prreSysdate;
    }

    public Integer getPrreFlagAttiva() {
        return prreFlagAttiva;
    }

    public void setPrreFlagAttiva(Integer prreFlagAttiva) {
        this.prreFlagAttiva = prreFlagAttiva;
    }
}
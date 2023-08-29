package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class CorsoFormazioneDTO {

    private Integer id;

    @Size(max = 255)
    @NotNull
    private String ancfCorsoformazionedesc;

    @Size(max = 50)
    @NotNull
    private String ancfSysuser;

    private LocalDate ancfSysdate;

    private Integer ancfFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAncfCorsoformazionedesc() {
        return ancfCorsoformazionedesc;
    }

    public void setAncfCorsoformazionedesc(String ancfCorsoformazionedesc) {
        this.ancfCorsoformazionedesc = ancfCorsoformazionedesc;
    }

    public String getAncfSysuser() {
        return ancfSysuser;
    }

    public void setAncfSysuser(String ancfSysuser) {
        this.ancfSysuser = ancfSysuser;
    }

    public LocalDate getAncfSysdate() {
        return ancfSysdate;
    }

    public void setAncfSysdate(LocalDate ancfSysdate) {
        this.ancfSysdate = ancfSysdate;
    }

    public Integer getAncfFlagAttiva() {
        return ancfFlagAttiva;
    }

    public void setAncfFlagAttiva(Integer ancfFlagAttiva) {
        this.ancfFlagAttiva = ancfFlagAttiva;
    }
}

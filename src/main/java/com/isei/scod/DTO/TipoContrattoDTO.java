package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class TipoContrattoDTO {

    private Integer id;

    @Size(max = 100)
    @NotNull
    private String cotcContratto;

    @Size(max = 50)
    @NotNull
    private String cotcSysuser;

    private LocalDate cotcSysdate;

    private Integer cotcFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCotcContratto() {
        return cotcContratto;
    }

    public void setCotcContratto(String cotcContratto) {
        this.cotcContratto = cotcContratto;
    }

    public String getCotcSysuser() {
        return cotcSysuser;
    }

    public void setCotcSysuser(String cotcSysuser) {
        this.cotcSysuser = cotcSysuser;
    }

    public LocalDate getCotcSysdate() {
        return cotcSysdate;
    }

    public void setCotcSysdate(LocalDate cotcSysdate) {
        this.cotcSysdate = cotcSysdate;
    }

    public Integer getCotcFlagAttiva() {
        return cotcFlagAttiva;
    }

    public void setCotcFlagAttiva(Integer cotcFlagAttiva) {
        this.cotcFlagAttiva = cotcFlagAttiva;
    }
}

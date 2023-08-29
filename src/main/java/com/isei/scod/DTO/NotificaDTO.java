package com.isei.scod.DTO;

import com.isei.scod.Entity.NotnTiponotifica;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class NotificaDTO {

    private Integer id;

    private LocalDate notiDatanotifica;

    private LocalDate notiDatainvionotifica;

    private TiponotificaDTO notiFkNotnTiponotificaid;

    @Size(max = 50)
    @NotNull
    private String notiSysuser;

    private LocalDate notiSysdate;

    private Integer notiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getNotiDatanotifica() {
        return notiDatanotifica;
    }

    public void setNotiDatanotifica(LocalDate notiDatanotifica) {
        this.notiDatanotifica = notiDatanotifica;
    }

    public LocalDate getNotiDatainvionotifica() {
        return notiDatainvionotifica;
    }

    public void setNotiDatainvionotifica(LocalDate notiDatainvionotifica) {
        this.notiDatainvionotifica = notiDatainvionotifica;
    }

    public TiponotificaDTO getNotiFkNotnTiponotificaid() {
        return notiFkNotnTiponotificaid;
    }

    public void setNotiFkNotnTiponotificaid(TiponotificaDTO notiFkNotnTiponotificaid) {
        this.notiFkNotnTiponotificaid = notiFkNotnTiponotificaid;
    }

    public String getNotiSysuser() {
        return notiSysuser;
    }

    public void setNotiSysuser(String notiSysuser) {
        this.notiSysuser = notiSysuser;
    }

    public LocalDate getNotiSysdate() {
        return notiSysdate;
    }

    public void setNotiSysdate(LocalDate notiSysdate) {
        this.notiSysdate = notiSysdate;
    }

    public Integer getNotiFlagAttiva() {
        return notiFlagAttiva;
    }

    public void setNotiFlagAttiva(Integer notiFlagAttiva) {
        this.notiFlagAttiva = notiFlagAttiva;
    }
}
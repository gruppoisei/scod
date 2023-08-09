package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NOTI_NOTIFICA")
public class NotiNotifica implements Serializable {
    private static final long serialVersionUID = 3179468632402503315L;
    @Id
    @Column(name = "NOTI_NOTOFICAID", nullable = false)
    private Integer id;

    @Column(name = "NOTI_DATANOTIFICA")
    private LocalDate notiDatanotifica;

    @Column(name = "NOTI_DATAINVIONOTIFICA")
    private LocalDate notiDatainvionotifica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NOTI_FK_NOTN_TIPONOTIFICAID")
    private NotnTiponotifica notiFkNotnTiponotificaid;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOTI_SYSUSER", nullable = false, length = 50)
    private String notiSysuser;

    @Column(name = "NOTI_SYSDATE")
    private LocalDate notiSysdate;

    @Column(name = "NOTI_FLAG_ATTIVA")
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

    public NotnTiponotifica getNotiFkNotnTiponotificaid() {
        return notiFkNotnTiponotificaid;
    }

    public void setNotiFkNotnTiponotificaid(NotnTiponotifica notiFkNotnTiponotificaid) {
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
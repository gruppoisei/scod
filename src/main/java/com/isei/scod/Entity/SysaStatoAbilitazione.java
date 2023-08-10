package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SYSA_STATO_ABILITAZIONE")
public class SysaStatoAbilitazione implements Serializable {
    private static final long serialVersionUID = -2766788486227903967L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SYSA_STATO_ABILITAZIONE_ID", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "SYSA_STATO_ABILITAZIONE_DESC", nullable = false, length = 20)
    private String sysaStatoAbilitazioneDesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "SYSA_SYSUESER", nullable = false, length = 50)
    private String sysaSysueser;

    @Column(name = "SYSA_SYSDATE")
    private LocalDate sysaSysdate;

    @Column(name = "SYSA_FLAG_ATTIVO")
    private Integer sysaFlagAttivo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysaStatoAbilitazioneDesc() {
        return sysaStatoAbilitazioneDesc;
    }

    public void setSysaStatoAbilitazioneDesc(String sysaStatoAbilitazioneDesc) {
        this.sysaStatoAbilitazioneDesc = sysaStatoAbilitazioneDesc;
    }

    public String getSysaSysueser() {
        return sysaSysueser;
    }

    public void setSysaSysueser(String sysaSysueser) {
        this.sysaSysueser = sysaSysueser;
    }

    public LocalDate getSysaSysdate() {
        return sysaSysdate;
    }

    public void setSysaSysdate(LocalDate sysaSysdate) {
        this.sysaSysdate = sysaSysdate;
    }

    public Integer getSysaFlagAttivo() {
        return sysaFlagAttivo;
    }

    public void setSysaFlagAttivo(Integer sysaFlagAttivo) {
        this.sysaFlagAttivo = sysaFlagAttivo;
    }
}
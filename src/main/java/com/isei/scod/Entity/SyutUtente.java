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
@Table(name = "SYUT_UTENTE")
public class SyutUtente implements Serializable {
    private static final long serialVersionUID = 8622724166193418404L;
    @Id
    @Column(name = "SYUT_IDUTENTE", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ANUT_FK_PERS_PERSONAID")
    private Integer anutFkPersPersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANUT_FK_ANSA_STAT_AB_ID")
    private AnsaStatoAbilitazione anutFkAnsaStatAb;

    @Size(max = 100)
    @NotNull
    @Column(name = "ANUT_USER_NAME", nullable = false, length = 100)
    private String anutUserName;

    @Column(name = "ANUT_DATA_ABILITAZIONE")
    private LocalDate anutDataAbilitazione;

    @Column(name = "ANUT_DATA_DISABILITAZIONE")
    private LocalDate anutDataDisabilitazione;

    @Size(max = 256)
    @NotNull
    @Column(name = "ANUT_PASSWORD_HASH", nullable = false, length = 256)
    private String anutPasswordHash;

    @Column(name = "ANUT_FLAG_RESET_PASSWORD")
    private Integer anutFlagResetPassword;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANUT_SYSUSER", nullable = false, length = 50)
    private String anutSysuser;

    @Column(name = "ANUT_SYSDATE")
    private LocalDate anutSysdate;

    @Column(name = "ANUT_FLAG_ATTIVA")
    private Integer anutFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnutFkPersPersonaid() {
        return anutFkPersPersonaid;
    }

    public void setAnutFkPersPersonaid(Integer anutFkPersPersonaid) {
        this.anutFkPersPersonaid = anutFkPersPersonaid;
    }

    public AnsaStatoAbilitazione getAnutFkAnsaStatAb() {
        return anutFkAnsaStatAb;
    }

    public void setAnutFkAnsaStatAb(AnsaStatoAbilitazione anutFkAnsaStatAb) {
        this.anutFkAnsaStatAb = anutFkAnsaStatAb;
    }

    public String getAnutUserName() {
        return anutUserName;
    }

    public void setAnutUserName(String anutUserName) {
        this.anutUserName = anutUserName;
    }

    public LocalDate getAnutDataAbilitazione() {
        return anutDataAbilitazione;
    }

    public void setAnutDataAbilitazione(LocalDate anutDataAbilitazione) {
        this.anutDataAbilitazione = anutDataAbilitazione;
    }

    public LocalDate getAnutDataDisabilitazione() {
        return anutDataDisabilitazione;
    }

    public void setAnutDataDisabilitazione(LocalDate anutDataDisabilitazione) {
        this.anutDataDisabilitazione = anutDataDisabilitazione;
    }

    public String getAnutPasswordHash() {
        return anutPasswordHash;
    }

    public void setAnutPasswordHash(String anutPasswordHash) {
        this.anutPasswordHash = anutPasswordHash;
    }

    public Integer getAnutFlagResetPassword() {
        return anutFlagResetPassword;
    }

    public void setAnutFlagResetPassword(Integer anutFlagResetPassword) {
        this.anutFlagResetPassword = anutFlagResetPassword;
    }

    public String getAnutSysuser() {
        return anutSysuser;
    }

    public void setAnutSysuser(String anutSysuser) {
        this.anutSysuser = anutSysuser;
    }

    public LocalDate getAnutSysdate() {
        return anutSysdate;
    }

    public void setAnutSysdate(LocalDate anutSysdate) {
        this.anutSysdate = anutSysdate;
    }

    public Integer getAnutFlagAttiva() {
        return anutFlagAttiva;
    }

    public void setAnutFlagAttiva(Integer anutFlagAttiva) {
        this.anutFlagAttiva = anutFlagAttiva;
    }
}
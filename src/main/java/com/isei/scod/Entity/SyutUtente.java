package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SYUT_UTENTE")
public class SyutUtente implements Serializable, UserDetails {
    private static final long serialVersionUID = 8622724166193418404L;
    @Id
    @Column(name = "SYUT_IDUTENTE", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "SYUT_FK_PERS_PERSONAID")
    private Integer syutFkPersPersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYUT_FK_ANSA_STAT_AB_ID")
    private SysaStatoAbilitazione syutFkAnsaStatAb;

    @Size(max = 100)
    @NotNull
    @Column(name = "SYUT_USER_NAME", nullable = false, length = 100)
    private String syutUserName;

    @Column(name = "SYUT_DATA_ABILITAZIONE")
    private LocalDate syutDataAbilitazione;

    @Column(name = "SYUT_DATA_DISABILITAZIONE")
    private LocalDate syutDataDisabilitazione;

    @Size(max = 256)
    @NotNull
    @Column(name = "SYUT_PASSWORD_HASH", nullable = false, length = 256)
    private String syutPasswordHash;

    @Column(name = "SYUT_FLAG_RESET_PASSWORD")
    private Integer syutFlagResetPassword;

    @Size(max = 50)
    @NotNull
    @Column(name = "SYUT_SYSUSER", nullable = false, length = 50)
    private String syutSysuser;

    @Column(name = "SYUT_SYSDATE")
    private LocalDate syutSysdate;

    @Column(name = "SYUT_FLAG_ATTIVA")
    private Integer syutFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSyutFkPersPersonaid() {
        return syutFkPersPersonaid;
    }

    public void setSyutFkPersPersonaid(Integer syutFkPersPersonaid) {
        this.syutFkPersPersonaid = syutFkPersPersonaid;
    }

    public SysaStatoAbilitazione getSyutFkAnsaStatAb() {
        return syutFkAnsaStatAb;
    }

    public void setSyutFkAnsaStatAb(SysaStatoAbilitazione syutFkAnsaStatAb) {
        this.syutFkAnsaStatAb = syutFkAnsaStatAb;
    }

    public String getSyutUserName() {
        return syutUserName;
    }

    public void setSyutUserName(String syutUserName) {
        this.syutUserName = syutUserName;
    }

    public LocalDate getSyutDataAbilitazione() {
        return syutDataAbilitazione;
    }

    public void setSyutDataAbilitazione(LocalDate syutDataAbilitazione) {
        this.syutDataAbilitazione = syutDataAbilitazione;
    }

    public LocalDate getSyutDataDisabilitazione() {
        return syutDataDisabilitazione;
    }

    public void setSyutDataDisabilitazione(LocalDate syutDataDisabilitazione) {
        this.syutDataDisabilitazione = syutDataDisabilitazione;
    }

    public String getSyutPasswordHash() {
        return syutPasswordHash;
    }

    public void setSyutPasswordHash(String syutPasswordHash) {
        this.syutPasswordHash = syutPasswordHash;
    }

    public Integer getSyutFlagResetPassword() {
        return syutFlagResetPassword;
    }

    public void setSyutFlagResetPassword(Integer syutFlagResetPassword) {
        this.syutFlagResetPassword = syutFlagResetPassword;
    }

    public String getSyutSysuser() {
        return syutSysuser;
    }

    public void setSyutSysuser(String syutSysuser) {
        this.syutSysuser = syutSysuser;
    }

    public LocalDate getSyutSysdate() {
        return syutSysdate;
    }

    public void setSyutSysdate(LocalDate syutSysdate) {
        this.syutSysdate = syutSysdate;
    }

    public Integer getSyutFlagAttiva() {
        return syutFlagAttiva;
    }

    public void setSyutFlagAttiva(Integer syutFlagAttiva) {
        this.syutFlagAttiva = syutFlagAttiva;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return syutPasswordHash;
    }

    @Override
    public String getUsername() {
        return getSyutUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

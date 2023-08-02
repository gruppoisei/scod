package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SYUT_UTENTE")
public class SyutUtente implements Serializable {
    private static final long serialVersionUID = 8622724166193418404L;
    @Id
    @Column(name = "SYUT_IDUTENTE", nullable = false)
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
    private Instant anutDataAbilitazione;

    @Column(name = "ANUT_DATA_DISABILITAZIONE")
    private Instant anutDataDisabilitazione;

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
    private Instant anutSysdate;

    @Column(name = "ANUT_FLAG_ATTIVA")
    private Integer anutFlagAttiva;

}
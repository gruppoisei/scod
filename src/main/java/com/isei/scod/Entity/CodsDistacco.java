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
@Table(name = "CODS_DISTACCO")
public class CodsDistacco implements Serializable {
    private static final long serialVersionUID = 7857026474452210104L;
    @Id
    @Column(name = "CODS_DISTACCOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODS_FK_ANPEPERSONAID")
    private AnpePersona codsFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODS_SOCIETADISTACCOID")
    private AnsoSocieta codsSocietadistaccoid;

    @Column(name = "CODS_VALOREDISTACCO")
    private Integer codsValoredistacco;

    @Column(name = "CODS_CLIENTEID")
    private Integer codsClienteid;

    @Column(name = "CODS_DATAINIZIODISTACCO")
    private Instant codsDatainiziodistacco;

    @Column(name = "CODS_DATAFINEDISTACCO")
    private Instant codsDatafinedistacco;

    @Size(max = 50)
    @NotNull
    @Column(name = "CODS_SYSUSER", nullable = false, length = 50)
    private String codsSysuser;

    @Column(name = "CODS_SYSDATE")
    private Instant codsSysdate;

    @NotNull
    @Column(name = "CODS_FLAG_ATTIVA", nullable = false)
    private Integer codsFlagAttiva;

}
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
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORDI_ORDINE")
public class OrdiOrdine implements Serializable {
    private static final long serialVersionUID = -6035537729581028586L;
    @Id
    @Column(name = "ORDI_ORDINEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_OFFEOFFERTAID")
    private OffeOfferta ordiFkOffeoffertaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_ANSOCOMMITTENTE")
    private AnsoSocieta ordiFkAnsocommittente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_ANDODOCUMENTOORDINE")
    private AndoDocumento ordiFkAndodocumentoordine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_ANSOSOCIETAGRUPPO")
    private AnsoSocieta ordiFkAnsosocietagruppo;

    @Size(max = 255)
    @Column(name = "ORDI_ORDINEDESC")
    private String ordiOrdinedesc;

    @Column(name = "ORDI_DATAORDINE")
    private LocalDate ordiDataordine;

    @Column(name = "ORDI_DATAEVASIONEORDINE")
    private LocalDate ordiDataevasioneordine;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDI_SYSUSER", nullable = false, length = 50)
    private String ordiSysuser;

    @Column(name = "ORDI_SYSDATE")
    private Instant ordiSysdate;

    @Column(name = "ORDI_FLAG_ATTIVA")
    private Integer ordiFlagAttiva;

}
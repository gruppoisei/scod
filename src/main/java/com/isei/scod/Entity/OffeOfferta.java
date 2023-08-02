package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OFFE_OFFERTA")
public class OffeOfferta implements Serializable {
    private static final long serialVersionUID = 4693919441272858667L;
    @Id
    @Column(name = "OFFE_OFFERTAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANSOCOMMITTENTEID")
    private AnsoSocieta offeFkAnsocommittenteid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANSOSOCIETAGRUPPO")
    private AnsoSocieta offeFkAnsosocietagruppo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_OFTIOFFERTAID")
    private OftiTipoofferta offeFkOftioffertaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANPEREFCOMMERCIALE")
    private AnpePersona offeFkAnperefcommerciale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANPEAPPROVATADA")
    private AnpePersona offeFkAnpeapprovatada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANDODOCUMENTOOFFERTA")
    private AndoDocumento offeFkAndodocumentoofferta;

    @Column(name = "OFFE_IMPORTOOFFERTA", precision = 15, scale = 2)
    private BigDecimal offeImportoofferta;

    @Column(name = "OFFE_OFFERTAAPPROVATA")
    private Boolean offeOffertaapprovata;

    @Column(name = "OFFE_DATAOFFERTA")
    private Instant offeDataofferta;

    @Column(name = "OFFE_DATASCADENZA")
    private Instant offeDatascadenza;

    @Size(max = 50)
    @NotNull
    @Column(name = "OFFE_SYSUSER", nullable = false, length = 50)
    private String offeSysuser;

    @Column(name = "OFFE_SYSDATE")
    private Instant offeSysdate;

    @Column(name = "OFFE_FLAG_ATTIVA")
    private Integer offeFlagAttiva;

}
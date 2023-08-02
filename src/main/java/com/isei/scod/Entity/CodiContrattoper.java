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
@Table(name = "CODI_CONTRATTOPERS")
public class CodiContrattoper implements Serializable {
    private static final long serialVersionUID = -6949973187346397226L;
    @Id
    @Column(name = "CODI_CONTRATTOPERSID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_COTCTIPOCONTRATTOID")
    private CotcTipocontratto codiFkCotctipocontrattoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_ANPEPERSONAID")
    private AnpePersona codiFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_COCCCCNLID")
    private CoccCcnl codiFkCoccccnlid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_COLILIVELLOID")
    private ColiLivello codiFkColilivelloid;

    @Column(name = "CODI_RALCOMPENSO", precision = 15, scale = 2)
    private BigDecimal codiRalcompenso;

    @Column(name = "CODI_MONTEORE")
    private Integer codiMonteore;

    @NotNull
    @Column(name = "CODI_DATAINIZIOCONTRATTO", nullable = false)
    private Instant codiDatainiziocontratto;

    @Column(name = "CODI_DATAFINECONTRATTO")
    private Instant codiDatafinecontratto;

    @Column(name = "CODI_SMARTWORKING")
    private Boolean codiSmartworking;

    @Lob
    @Column(name = "CODI_NOTE")
    private String codiNote;

    @Size(max = 50)
    @NotNull
    @Column(name = "CODI_SYSUSER", nullable = false, length = 50)
    private String codiSysuser;

    @Column(name = "CODI_SYSDATE")
    private Instant codiSysdate;

    @Column(name = "CODI_FLAG_ATTIVA")
    private Integer codiFlagAttiva;

}
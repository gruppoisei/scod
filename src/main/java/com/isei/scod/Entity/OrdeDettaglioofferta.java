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
@Table(name = "ORDE_DETTAGLIOOFFERTA")
public class OrdeDettaglioofferta implements Serializable {

    private static final long serialVersionUID = -5988226330250315845L;
    @Id
    @Column(name = "ORDE_DETTAGLIOOFFERTAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDE_FK_ORSPTIPOPRODSERVID")
    private OrspTiposervizioprodotto ordeFkOrsptipoprodservid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDE_FK_OFFEOFFERTAID")
    private OffeOfferta ordeFkOffeoffertaid;

    @Size(max = 600)
    @Column(name = "ORDE_PRODSERVDESC", length = 600)
    private String ordeProdservdesc;

    @Size(max = 600)
    @Column(name = "ORDE_NOTE", length = 600)
    private String ordeNote;

    @Column(name = "ORDE_COSTO", precision = 15, scale = 2)
    private BigDecimal ordeCosto;

    @Column(name = "ORDE_QUANTITA")
    private Integer ordeQuantita;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDE_SYSUSER", nullable = false, length = 50)
    private String ordeSysuser;

    @Column(name = "ORDE_SYSDATE")
    private Instant ordeSysdate;

    @Column(name = "ORDA_FLAG_ATTIVA")
    private Integer ordaFlagAttiva;

}
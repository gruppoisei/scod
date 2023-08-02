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
@Table(name = "TRRI_RICHIESTA")
public class TrriRichiesta implements Serializable {
    private static final long serialVersionUID = -4636250961171535447L;
    @Id
    @Column(name = "TRRI_RICHIESTAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRRI_FK_ANPEPERSONAID")
    private AnpePersona trriFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRRI_FK_TRTRTIPORICHIESTAID")
    private TrtrTiporichiesta trriFkTrtrtiporichiestaid;

    @Size(max = 255)
    @Column(name = "TRRI_NOTE")
    private String trriNote;

    @Column(name = "TRRI_DATAINIZIO")
    private Instant trriDatainizio;

    @Column(name = "TRRI_DATAFINE")
    private Instant trriDatafine;

    @Size(max = 50)
    @NotNull
    @Column(name = "TRRI_SYSUSER", nullable = false, length = 50)
    private String trriSysuser;

    @Column(name = "TRRI_SYSDATE")
    private Instant trriSysdate;

    @Column(name = "TRRI_FLAG_ATTIVA")
    private Integer trriFlagAttiva;

}
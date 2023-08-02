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
@Table(name = "ORDF_DOCUMENTOFISCALE")
public class OrdfDocumentofiscale implements Serializable {
    private static final long serialVersionUID = 2323305785588598912L;
    @Id
    @Column(name = "ORDF_DOCUMENTOFISCALEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDF_FK_ORTDTIPODOCFISCID")
    private OrtdTipodocumentofiscale ordfFkOrtdtipodocfiscid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDF_FK_ANDODOCUMENTOID")
    private AndoDocumento ordfFkAndodocumentoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDF_FK_ORDIORDINEID")
    private OrdiOrdine ordfFkOrdiordineid;

    @Column(name = "ORDF_DATAINVIODOCFISC")
    private Instant ordfDatainviodocfisc;

    @Column(name = "ORDF_DATAEVASIONEDOCFISC")
    private Instant ordfDataevasionedocfisc;

    @Column(name = "ORDF_FATTURAAPERTA")
    private Boolean ordfFatturaaperta;

    @Column(name = "ORDF_N_BAF")
    private Integer ordfNBaf;

    @Column(name = "ORDF_FRAZIONABILITA")
    private Boolean ordfFrazionabilita;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDF_SYSUSER", nullable = false, length = 50)
    private String ordfSysuser;

    @Column(name = "ORDF_SYSDATE")
    private Instant ordfSysdate;

    @Column(name = "ORDF_FLAG_ATTIVA")
    private Integer ordfFlagAttiva;

}
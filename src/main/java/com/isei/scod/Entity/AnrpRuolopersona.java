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
@Table(name = "ANRP_RUOLOPERSONA")
public class AnrpRuolopersona implements Serializable {
    private static final long serialVersionUID = -8162036409479713360L;
    @Id
    @Column(name = "ANRP_RUOLOPERSONAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANRP_FK_ANPE_PERSONAID")
    private AnpePersona anrpFkAnpePersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANRP_FK_ANRU_RUOLOID")
    private AnruRuolo anrpFkAnruRuoloid;

    @Column(name = "ANRP_DATAINIZIO")
    private Instant anrpDatainizio;

    @Column(name = "ANRP_DATAFINE")
    private Instant anrpDatafine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANRP_FK_ANPE_PERSONATUTORID")
    private AnpePersona anrpFkAnpePersonatutorid;

    @Size(max = 600)
    @Column(name = "ANRP_NOTE", length = 600)
    private String anrpNote;

    @Size(max = 100)
    @Column(name = "ANRP_FORMAZIONETRASVERSALE1ANNO", length = 100)
    private String anrpFormazionetrasversale1anno;

    @Size(max = 100)
    @Column(name = "ANRP_FORMAZIONETRASVERSALE2ANNO", length = 100)
    private String anrpFormazionetrasversale2anno;

    @Size(max = 100)
    @Column(name = "ANRP_FORMAZIONETRASVERSALE3ANNO", length = 100)
    private String anrpFormazionetrasversale3anno;

    @Column(name = "ANRP_DATAINIZIOFORMTECNICA")
    private Instant anrpDatainizioformtecnica;

    @Column(name = "ANRP_DATAFINEFORMTECNICA")
    private Instant anrpDatafineformtecnica;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANRP_SYSUSER", nullable = false, length = 50)
    private String anrpSysuser;

    @Column(name = "ANRP_SYSDATE")
    private Instant anrpSysdate;

    @Column(name = "ANRP_FLAG_ATTIVA")
    private Integer anrpFlagAttiva;

}
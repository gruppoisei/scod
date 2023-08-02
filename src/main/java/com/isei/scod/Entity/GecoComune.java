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
@Table(name = "GECO_COMUNE")
public class GecoComune implements Serializable {
    private static final long serialVersionUID = 2763626485099047327L;
    @Id
    @Column(name = "GECO_COMUNEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GECO_FK_GEPR_PROVINCIAID")
    private GeprProvincia gecoFkGeprProvinciaid;

    @Size(max = 200)
    @Column(name = "GECO_DENO", length = 200)
    private String gecoDeno;

    @Size(max = 20)
    @Column(name = "GECO_CODICEBELFIORE", length = 20)
    private String gecoCodicebelfiore;

    @Size(max = 20)
    @Column(name = "GECO_CODICEISTAT", length = 20)
    private String gecoCodiceistat;

    @Size(max = 200)
    @Column(name = "GECO_ALTRADENO", length = 200)
    private String gecoAltradeno;

    @Size(max = 200)
    @Column(name = "GECO_DENO_TRASLITTERATA", length = 200)
    private String gecoDenoTraslitterata;

    @Lob
    @Column(name = "GECO_DENO_ALTRATRASLITTERATA")
    private String gecoDenoAltratraslitterata;

    @Column(name = "GECO_DATAISTITUZIONE")
    private Instant gecoDataistituzione;

    @Column(name = "GECO_DATACESSAZIONE")
    private Instant gecoDatacessazione;

    @Column(name = "GECO_FLAG_ATTIVA")
    private Integer gecoFlagAttiva;

    @Column(name = "GECO_SYSDATE")
    private Instant gecoSysdate;

    @Size(max = 50)
    @NotNull
    @Column(name = "GECO_SYSUSER", nullable = false, length = 50)
    private String gecoSysuser;

}
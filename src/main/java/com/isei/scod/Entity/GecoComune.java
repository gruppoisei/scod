package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
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
    private LocalDate gecoDataistituzione;

    @Column(name = "GECO_DATACESSAZIONE")
    private LocalDate gecoDatacessazione;

    @Column(name = "GECO_FLAG_ATTIVA")
    private Integer gecoFlagAttiva;

    @Column(name = "GECO_SYSDATE")
    private LocalDate gecoSysdate;

    @Size(max = 50)
    @NotNull
    @Column(name = "GECO_SYSUSER", nullable = false, length = 50)
    private String gecoSysuser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GeprProvincia getGecoFkGeprProvinciaid() {
        return gecoFkGeprProvinciaid;
    }

    public void setGecoFkGeprProvinciaid(GeprProvincia gecoFkGeprProvinciaid) {
        this.gecoFkGeprProvinciaid = gecoFkGeprProvinciaid;
    }

    public String getGecoDeno() {
        return gecoDeno;
    }

    public void setGecoDeno(String gecoDeno) {
        this.gecoDeno = gecoDeno;
    }

    public String getGecoCodicebelfiore() {
        return gecoCodicebelfiore;
    }

    public void setGecoCodicebelfiore(String gecoCodicebelfiore) {
        this.gecoCodicebelfiore = gecoCodicebelfiore;
    }

    public String getGecoCodiceistat() {
        return gecoCodiceistat;
    }

    public void setGecoCodiceistat(String gecoCodiceistat) {
        this.gecoCodiceistat = gecoCodiceistat;
    }

    public String getGecoAltradeno() {
        return gecoAltradeno;
    }

    public void setGecoAltradeno(String gecoAltradeno) {
        this.gecoAltradeno = gecoAltradeno;
    }

    public String getGecoDenoTraslitterata() {
        return gecoDenoTraslitterata;
    }

    public void setGecoDenoTraslitterata(String gecoDenoTraslitterata) {
        this.gecoDenoTraslitterata = gecoDenoTraslitterata;
    }

    public String getGecoDenoAltratraslitterata() {
        return gecoDenoAltratraslitterata;
    }

    public void setGecoDenoAltratraslitterata(String gecoDenoAltratraslitterata) {
        this.gecoDenoAltratraslitterata = gecoDenoAltratraslitterata;
    }

    public LocalDate getGecoDataistituzione() {
        return gecoDataistituzione;
    }

    public void setGecoDataistituzione(LocalDate gecoDataistituzione) {
        this.gecoDataistituzione = gecoDataistituzione;
    }

    public LocalDate getGecoDatacessazione() {
        return gecoDatacessazione;
    }

    public void setGecoDatacessazione(LocalDate gecoDatacessazione) {
        this.gecoDatacessazione = gecoDatacessazione;
    }

    public Integer getGecoFlagAttiva() {
        return gecoFlagAttiva;
    }

    public void setGecoFlagAttiva(Integer gecoFlagAttiva) {
        this.gecoFlagAttiva = gecoFlagAttiva;
    }

    public LocalDate getGecoSysdate() {
        return gecoSysdate;
    }

    public void setGecoSysdate(LocalDate gecoSysdate) {
        this.gecoSysdate = gecoSysdate;
    }

    public String getGecoSysuser() {
        return gecoSysuser;
    }

    public void setGecoSysuser(String gecoSysuser) {
        this.gecoSysuser = gecoSysuser;
    }
}
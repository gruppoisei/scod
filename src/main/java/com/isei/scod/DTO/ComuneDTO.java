package com.isei.scod.DTO;

import com.isei.scod.Entity.GeprProvincia;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class ComuneDTO {

    private Integer id;

    private GeprProvincia gecoFkGeprProvinciaid;

    @Size(max = 200)
    private String gecoDeno;

    @Size(max = 20)
    private String gecoCodicebelfiore;

    @Size(max = 20)
    private String gecoCodiceistat;

    @Size(max = 200)
    private String gecoAltradeno;

    @Size(max = 200)
    private String gecoDenoTraslitterata;

    private String gecoDenoAltratraslitterata;

    private LocalDate gecoDataistituzione;

    private LocalDate gecoDatacessazione;

    private Integer gecoFlagAttiva;

    private LocalDate gecoSysdate;

    @Size(max = 50)
    @NotNull
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

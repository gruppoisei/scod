package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "OFTI_TIPOOFFERTA")
public class OftiTipoofferta implements Serializable {
    private static final long serialVersionUID = -7024514187863831759L;
    @Id
    @Column(name = "OFTI_TIPOOFFERTAID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "OFTI_OFFERTADESC")
    private String oftiOffertadesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "OFTI_SYSUSER", nullable = false, length = 50)
    private String oftiSysuser;

    @Column(name = "OFTI_SYSDATE")
    private LocalDate oftiSysdate;

    @Column(name = "OFTI_FLAG_ATTIVA")
    private Integer oftiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOftiOffertadesc() {
        return oftiOffertadesc;
    }

    public void setOftiOffertadesc(String oftiOffertadesc) {
        this.oftiOffertadesc = oftiOffertadesc;
    }

    public String getOftiSysuser() {
        return oftiSysuser;
    }

    public void setOftiSysuser(String oftiSysuser) {
        this.oftiSysuser = oftiSysuser;
    }

    public LocalDate getOftiSysdate() {
        return oftiSysdate;
    }

    public void setOftiSysdate(LocalDate oftiSysdate) {
        this.oftiSysdate = oftiSysdate;
    }

    public Integer getOftiFlagAttiva() {
        return oftiFlagAttiva;
    }

    public void setOftiFlagAttiva(Integer oftiFlagAttiva) {
        this.oftiFlagAttiva = oftiFlagAttiva;
    }
}
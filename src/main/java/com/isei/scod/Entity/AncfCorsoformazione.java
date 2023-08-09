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
@Table(name = "ANCF_CORSOFORMAZIONE")
public class AncfCorsoformazione implements Serializable {
    private static final long serialVersionUID = -6814258857759163766L;
    @Id
    @Column(name = "ANCF_CORSOFORMAZIONEID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "ANCF_CORSOFORMAZIONEDESC", nullable = false)
    private String ancfCorsoformazionedesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANCF_SYSUSER", nullable = false, length = 50)
    private String ancfSysuser;

    @Column(name = "ANCF_SYSDATE")
    private LocalDate ancfSysdate;

    @Column(name = "ANCF_FLAG_ATTIVA")
    private Integer ancfFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAncfCorsoformazionedesc() {
        return ancfCorsoformazionedesc;
    }

    public void setAncfCorsoformazionedesc(String ancfCorsoformazionedesc) {
        this.ancfCorsoformazionedesc = ancfCorsoformazionedesc;
    }

    public String getAncfSysuser() {
        return ancfSysuser;
    }

    public void setAncfSysuser(String ancfSysuser) {
        this.ancfSysuser = ancfSysuser;
    }

    public LocalDate getAncfSysdate() {
        return ancfSysdate;
    }

    public void setAncfSysdate(LocalDate ancfSysdate) {
        this.ancfSysdate = ancfSysdate;
    }

    public Integer getAncfFlagAttiva() {
        return ancfFlagAttiva;
    }

    public void setAncfFlagAttiva(Integer ancfFlagAttiva) {
        this.ancfFlagAttiva = ancfFlagAttiva;
    }
}
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
@Table(name = "GERE_REGIONE")
public class GereRegione implements Serializable {
    private static final long serialVersionUID = -1441010259728012889L;
    @Id
    @Column(name = "GERE_REGIONEID", nullable = false)
    private Integer id;

    @Size(max = 200)
    @NotNull
    @Column(name = "GERE_DENO", nullable = false, length = 200)
    private String gereDeno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GERE_FK_GEAG_AGEOID")
    private GeagAreaGeografica gereFkGeagAgeoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "GERE_SYSUSER", nullable = false, length = 50)
    private String gereSysuser;

    @Column(name = "GERE_FLAG_ATTIVA")
    private Integer gereFlagAttiva;

    @Column(name = "GERE_SYSDATE")
    private LocalDate gereSysdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGereDeno() {
        return gereDeno;
    }

    public void setGereDeno(String gereDeno) {
        this.gereDeno = gereDeno;
    }

    public GeagAreaGeografica getGereFkGeagAgeoid() {
        return gereFkGeagAgeoid;
    }

    public void setGereFkGeagAgeoid(GeagAreaGeografica gereFkGeagAgeoid) {
        this.gereFkGeagAgeoid = gereFkGeagAgeoid;
    }

    public String getGereSysuser() {
        return gereSysuser;
    }

    public void setGereSysuser(String gereSysuser) {
        this.gereSysuser = gereSysuser;
    }

    public Integer getGereFlagAttiva() {
        return gereFlagAttiva;
    }

    public void setGereFlagAttiva(Integer gereFlagAttiva) {
        this.gereFlagAttiva = gereFlagAttiva;
    }

    public LocalDate getGereSysdate() {
        return gereSysdate;
    }

    public void setGereSysdate(LocalDate gereSysdate) {
        this.gereSysdate = gereSysdate;
    }
}
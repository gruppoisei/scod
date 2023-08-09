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
@Table(name = "GEAG_AREA_GEOGRAFICA")
public class GeagAreaGeografica implements Serializable {
    private static final long serialVersionUID = -6793082804434864594L;
    @Id
    @Column(name = "GEAG_AGEOID", nullable = false)
    private Integer id;

    @Size(max = 200)
    @NotNull
    @Column(name = "GEAG_DENO", nullable = false, length = 200)
    private String geagDeno;

    @Column(name = "GEAG_SYSDATE")
    private LocalDate geagSysdate;

    @Size(max = 50)
    @NotNull
    @Column(name = "GEAG_SYSUSER", nullable = false, length = 50)
    private String geagSysuser;

    @Column(name = "GEAG_FLAG_ATTIVA")
    private Integer geagFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGeagDeno() {
        return geagDeno;
    }

    public void setGeagDeno(String geagDeno) {
        this.geagDeno = geagDeno;
    }

    public LocalDate getGeagSysdate() {
        return geagSysdate;
    }

    public void setGeagSysdate(LocalDate geagSysdate) {
        this.geagSysdate = geagSysdate;
    }

    public String getGeagSysuser() {
        return geagSysuser;
    }

    public void setGeagSysuser(String geagSysuser) {
        this.geagSysuser = geagSysuser;
    }

    public Integer getGeagFlagAttiva() {
        return geagFlagAttiva;
    }

    public void setGeagFlagAttiva(Integer geagFlagAttiva) {
        this.geagFlagAttiva = geagFlagAttiva;
    }
}
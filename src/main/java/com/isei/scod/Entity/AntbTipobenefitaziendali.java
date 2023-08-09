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
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ANTB_TIPOBENEFITAZIENDALI")
public class AntbTipobenefitaziendali implements Serializable {
    private static final long serialVersionUID = 6018191019728198444L;
    @Id
    @Column(name = "ANTB_TIPO_BENEFITAZIENDALIID", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ANTB_BENEFITAZIENDALIDESC", length = 50)
    private String antbBenefitaziendalidesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANTB_SYSUSER", nullable = false, length = 50)
    private String antbSysuser;

    @Column(name = "ANTB_SYSDATE")
    private LocalDate antbSysdate;

    @Column(name = "ANTB_FLAG_ATTIVA")
    private Integer antbFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAntbBenefitaziendalidesc() {
        return antbBenefitaziendalidesc;
    }

    public void setAntbBenefitaziendalidesc(String antbBenefitaziendalidesc) {
        this.antbBenefitaziendalidesc = antbBenefitaziendalidesc;
    }

    public String getAntbSysuser() {
        return antbSysuser;
    }

    public void setAntbSysuser(String antbSysuser) {
        this.antbSysuser = antbSysuser;
    }

    public LocalDate getAntbSysdate() {
        return antbSysdate;
    }

    public void setAntbSysdate(LocalDate antbSysdate) {
        this.antbSysdate = antbSysdate;
    }

    public Integer getAntbFlagAttiva() {
        return antbFlagAttiva;
    }

    public void setAntbFlagAttiva(Integer antbFlagAttiva) {
        this.antbFlagAttiva = antbFlagAttiva;
    }
}
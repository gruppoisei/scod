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
@Table(name = "ANTS_TIPOSOCIETA")
public class AntsTipoSocieta implements Serializable {
    private static final long serialVersionUID = 7584401466293022950L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANTS_TIPOSOCID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "ANTS_TIPOSOCDESC", nullable = false, length = 100)
    private String antsTiposocdesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANTS_SYSUSER", nullable = false, length = 50)
    private String antsSysuser;

    @Column(name = "ANTS_SYSDATE")
    private LocalDate antsSysdate;

    @Column(name = "ANTS_FLAG_ATTIVA")
    private Integer antsFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAntsTiposocdesc() {
        return antsTiposocdesc;
    }

    public void setAntsTiposocdesc(String antsTiposocdesc) {
        this.antsTiposocdesc = antsTiposocdesc;
    }

    public String getAntsSysuser() {
        return antsSysuser;
    }

    public void setAntsSysuser(String antsSysuser) {
        this.antsSysuser = antsSysuser;
    }

    public LocalDate getAntsSysdate() {
        return antsSysdate;
    }

    public void setAntsSysdate(LocalDate antsSysdate) {
        this.antsSysdate = antsSysdate;
    }

    public Integer getAntsFlagAttiva() {
        return antsFlagAttiva;
    }

    public void setAntsFlagAttiva(Integer antsFlagAttiva) {
        this.antsFlagAttiva = antsFlagAttiva;
    }
}
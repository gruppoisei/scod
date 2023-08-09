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
@Table(name = "ANSA_STATO_ABILITAZIONE")
public class AnsaStatoAbilitazione implements Serializable {
    private static final long serialVersionUID = -2766788486227903967L;
    @Id
    @Column(name = "ANSA_STATO_ABILITAZIONE_ID", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "ANSA_STATO_ABILITAZIONE_DESC", nullable = false, length = 20)
    private String ansaStatoAbilitazioneDesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANSA_SYSUESER", nullable = false, length = 50)
    private String ansaSysueser;

    @Column(name = "ANSA_SYSDATE")
    private LocalDate ansaSysdate;

    @Column(name = "ANSA_FLAG_ATTIVO")
    private Integer ansaFlagAttivo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnsaStatoAbilitazioneDesc() {
        return ansaStatoAbilitazioneDesc;
    }

    public void setAnsaStatoAbilitazioneDesc(String ansaStatoAbilitazioneDesc) {
        this.ansaStatoAbilitazioneDesc = ansaStatoAbilitazioneDesc;
    }

    public String getAnsaSysueser() {
        return ansaSysueser;
    }

    public void setAnsaSysueser(String ansaSysueser) {
        this.ansaSysueser = ansaSysueser;
    }

    public LocalDate getAnsaSysdate() {
        return ansaSysdate;
    }

    public void setAnsaSysdate(LocalDate ansaSysdate) {
        this.ansaSysdate = ansaSysdate;
    }

    public Integer getAnsaFlagAttivo() {
        return ansaFlagAttivo;
    }

    public void setAnsaFlagAttivo(Integer ansaFlagAttivo) {
        this.ansaFlagAttivo = ansaFlagAttivo;
    }
}
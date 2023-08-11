package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GETO_TOPONIMO")
public class GetoToponimo implements Serializable {
    private static final long serialVersionUID = -3201705764439528385L;
    @Id
    @Size(max = 20)
    @Column(name = "GETO_TOPONIMOID", nullable = false, length = 20)
    private String getoToponimoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "GETO_SYSUSER", nullable = false, length = 50)
    private String getoSysuser;

    @Column(name = "GETO_SYSDATE")
    private LocalDate getoSysdate;

    @Column(name = "GETO_FLAG_ATTIVA")
    private Integer getoFlagAttiva;

    public String getGetoToponimoid() {
        return getoToponimoid;
    }

    public void setGetoToponimoid(String getoToponimoid) {
        this.getoToponimoid = getoToponimoid;
    }

    public String getGetoSysuser() {
        return getoSysuser;
    }

    public void setGetoSysuser(String getoSysuser) {
        this.getoSysuser = getoSysuser;
    }

    public LocalDate getGetoSysdate() {
        return getoSysdate;
    }

    public void setGetoSysdate(LocalDate getoSysdate) {
        this.getoSysdate = getoSysdate;
    }

    public Integer getGetoFlagAttiva() {
        return getoFlagAttiva;
    }

    public void setGetoFlagAttiva(Integer getoFlagAttiva) {
        this.getoFlagAttiva = getoFlagAttiva;
    }
}
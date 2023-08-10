package com.isei.scod.DTO;



import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
public class AndoDocumentoDTO {

    private TipoDocumentoDTO andoFkAltaTipoallegatoid;

    @Size(max = 255)
    private String andoPathfile;

    @Size(max = 50)
    @NotNull
    private String andoSysuser;


    private LocalDate andoSysdate;


    private Integer andoFlagAttiva;

    public TipoDocumentoDTO getAndoFkAltaTipoallegatoid() {
        return andoFkAltaTipoallegatoid;
    }

    public void setAndoFkAltaTipoallegatoid(TipoDocumentoDTO andoFkAltaTipoallegatoid) {
        this.andoFkAltaTipoallegatoid = andoFkAltaTipoallegatoid;
    }

    public String getAndoPathfile() {
        return andoPathfile;
    }

    public void setAndoPathfile(String andoPathfile) {
        this.andoPathfile = andoPathfile;
    }

    public String getAndoSysuser() {
        return andoSysuser;
    }

    public void setAndoSysuser(String andoSysuser) {
        this.andoSysuser = andoSysuser;
    }

    public LocalDate getAndoSysdate() {
        return andoSysdate;
    }

    public void setAndoSysdate(LocalDate andoSysdate) {
        this.andoSysdate = andoSysdate;
    }

    public Integer getAndoFlagAttiva() {
        return andoFlagAttiva;
    }

    public void setAndoFlagAttiva(Integer andoFlagAttiva) {
        this.andoFlagAttiva = andoFlagAttiva;
    }
}

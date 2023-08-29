package com.isei.scod.DTO;

import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Entity.AnpePersona;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class DocumentipersonaDTO {

    private Integer id;


    private PersonaDTO andpFkAnpePersonaid;

    private DocumentoDTO andpFkAndoDocumentoid;

    @Size(max = 50)
    @NotNull
    private String andpSysuser;

    private LocalDate andpSysdate;

    private Integer andpFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaDTO getAndpFkAnpePersonaid() {
        return andpFkAnpePersonaid;
    }

    public void setAndpFkAnpePersonaid(PersonaDTO andpFkAnpePersonaid) {
        this.andpFkAnpePersonaid = andpFkAnpePersonaid;
    }

    public DocumentoDTO getAndpFkAndoDocumentoid() {
        return andpFkAndoDocumentoid;
    }

    public void setAndpFkAndoDocumentoid(DocumentoDTO andpFkAndoDocumentoid) {
        this.andpFkAndoDocumentoid = andpFkAndoDocumentoid;
    }

    public String getAndpSysuser() {
        return andpSysuser;
    }

    public void setAndpSysuser(String andpSysuser) {
        this.andpSysuser = andpSysuser;
    }

    public LocalDate getAndpSysdate() {
        return andpSysdate;
    }

    public void setAndpSysdate(LocalDate andpSysdate) {
        this.andpSysdate = andpSysdate;
    }

    public Integer getAndpFlagAttiva() {
        return andpFlagAttiva;
    }

    public void setAndpFlagAttiva(Integer andpFlagAttiva) {
        this.andpFlagAttiva = andpFlagAttiva;
    }
}
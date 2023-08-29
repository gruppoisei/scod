package com.isei.scod.DTO;

import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Entity.AnsoSocieta;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class DocumentisocietaDTO {

    private Integer id;

    private SocietaDTO andfFkAnsoSocietaid;

    private DocumentoDTO andfFkAndoDocumentoid;

    @Size(max = 50)
    @NotNull
    private String andfSysuser;

    private LocalDate andfSysdate;

    private Integer andfFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SocietaDTO getAndfFkAnsoSocietaid() {
        return andfFkAnsoSocietaid;
    }

    public void setAndfFkAnsoSocietaid(SocietaDTO andfFkAnsoSocietaid) {
        this.andfFkAnsoSocietaid = andfFkAnsoSocietaid;
    }

    public DocumentoDTO getAndfFkAndoDocumentoid() {
        return andfFkAndoDocumentoid;
    }

    public void setAndfFkAndoDocumentoid(DocumentoDTO andfFkAndoDocumentoid) {
        this.andfFkAndoDocumentoid = andfFkAndoDocumentoid;
    }

    public String getAndfSysuser() {
        return andfSysuser;
    }

    public void setAndfSysuser(String andfSysuser) {
        this.andfSysuser = andfSysuser;
    }

    public LocalDate getAndfSysdate() {
        return andfSysdate;
    }

    public void setAndfSysdate(LocalDate andfSysdate) {
        this.andfSysdate = andfSysdate;
    }

    public Integer getAndfFlagAttiva() {
        return andfFlagAttiva;
    }

    public void setAndfFlagAttiva(Integer andfFlagAttiva) {
        this.andfFlagAttiva = andfFlagAttiva;
    }
}
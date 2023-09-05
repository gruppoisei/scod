package com.isei.scod.Mapper;


import com.isei.scod.DTO.DocumentipersonaDTO;
import com.isei.scod.DTO.DocumentisocietaDTO;
import com.isei.scod.DTO.DocumentoDTO;
import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.AndfDocumentisocieta;
import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Entity.AndpDocumentipersona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentoMapper {

    DocumentoDTO fromAndoDocumentoEntitytoDTO(AndoDocumento entity);

    AndoDocumento fromAndoDocumentoDTOToEntity(DocumentoDTO dto);

    DocumentipersonaDTO fromAndpDocumentipersonaEntitytoDTO(AndpDocumentipersona entity);

    AndpDocumentipersona fromAndpDocumentipersonaDTOToEntity(DocumentipersonaDTO dto);

    DocumentisocietaDTO fromAndfDocumentisocietaEntitytoDTO(AndfDocumentisocieta entity);

    AndfDocumentisocieta fromAndfDocumentisocietaDTOToEntity(DocumentisocietaDTO dto);

    TipoDocumentoDTO fromAltaTipodocumentoEntitytoDTO(AltaTipodocumento entity);

    AltaTipodocumento fromAltaTipodocumentoDTOToEntity(TipoDocumentoDTO dto);

}

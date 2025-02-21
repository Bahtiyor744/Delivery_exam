package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.AttachmentDTO;
import com.example.delivery_exam.entity.Attachment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AttachmentMapper {

    AttachmentMapper INSTANCE = Mappers.getMapper(AttachmentMapper.class);

    AttachmentDTO toAttachmentDTO(Attachment attachment);
    Attachment toAttachment(AttachmentDTO attachmentDTO);
}

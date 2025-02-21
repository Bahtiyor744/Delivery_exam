package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.AttachmentContentDTO;
import com.example.delivery_exam.entity.AttachmentContent;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AttachmentContentMapper {
    AttachmentContentMapper INSTANCE = Mappers.getMapper(AttachmentContentMapper.class);

    AttachmentContentDTO toAttachmentDTO(AttachmentContent attachmentContent);
    AttachmentContent toAttachmentContent(AttachmentContentDTO attachmentDTO);
}

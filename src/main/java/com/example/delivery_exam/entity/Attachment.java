package com.example.delivery_exam.entity;


import com.example.delivery_exam.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attachment extends BaseEntity {
    private String fileName;
    private String contentType;
    private long size;

    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    private AttachmentContent attachmentContent;
}

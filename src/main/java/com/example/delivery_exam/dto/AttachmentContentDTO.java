package com.example.delivery_exam.dto;


import lombok.Value;

@Value
public class AttachmentContentDTO {
    Integer attachmentId;
    byte[] data;
}
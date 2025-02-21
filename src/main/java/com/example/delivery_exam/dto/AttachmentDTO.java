package com.example.delivery_exam.dto;

import lombok.Value;

@Value
public class AttachmentDTO {
    Integer id;
    String fileName;
    String contentType;
    long size;
}
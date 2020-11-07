package com.hcl.hackathon.emobileconnect.util;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class ExceptionResponse {

    private String errorMessage;
    private String errorCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestap;
}

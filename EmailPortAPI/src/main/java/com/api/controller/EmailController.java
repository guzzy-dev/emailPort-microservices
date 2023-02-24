package com.api.controller;

import com.api.service.EmailService;
import com.core.model.dto.EmailIdResponseDTO;
import com.core.model.dto.EmailRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping()
    public EmailIdResponseDTO registerNewEmail(@RequestBody EmailRequestDTO emailRequestDTO){

        Long registeredEmailId = emailService.registerNewEmail(emailRequestDTO);
        return new EmailIdResponseDTO(registeredEmailId);

    }
}

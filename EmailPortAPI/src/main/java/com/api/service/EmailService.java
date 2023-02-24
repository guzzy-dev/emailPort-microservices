package com.api.service;

import com.core.dao.ConfigTemplateRepository;
import com.core.dao.EmailRepository;
import com.core.model.dto.EmailRequestDTO;
import com.core.model.entity.ConfigTemplate;
import com.core.model.entity.email.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class EmailService {



    private final EmailRepository emailRepository;
    private final ConfigTemplateRepository configTemplateRepository;

    @Autowired
    public EmailService(EmailRepository emailRepository, ConfigTemplateRepository configTemplateRepository) {
        this.emailRepository = emailRepository;
        this.configTemplateRepository = configTemplateRepository;
    }

    public Long registerNewEmail(EmailRequestDTO emailRequestDTO) {
        Email email = new Email(emailRequestDTO);
        ConfigTemplate configTemplate = configTemplateRepository.getConfigTemplateByTemplateName(emailRequestDTO.getConfigTemplateName());

        email.setParamsFromConfigTemplate(configTemplate);
        Time now = new Time(System.currentTimeMillis());
        email.setCreatedTime(now);
        email.setUpdatedTime(now);

        return emailRepository.save(email).getId();
    }
}

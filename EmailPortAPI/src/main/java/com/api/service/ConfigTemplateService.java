package com.api.service;

import com.core.dao.ConfigTemplateRepository;
import com.core.model.dto.ConfigTemplateRequestDTO;
import com.core.model.entity.ConfigTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigTemplateService {
    private final ConfigTemplateRepository configTemplateRepository;

    @Autowired
    public ConfigTemplateService(ConfigTemplateRepository configTemplateRepository) {
        this.configTemplateRepository = configTemplateRepository;
    }

    public ConfigTemplate registerNewConfigTemplate(ConfigTemplateRequestDTO configTemplateRequestDTO) {
        return configTemplateRepository.save(new ConfigTemplate(configTemplateRequestDTO));
    }
}

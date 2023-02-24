package com.api.controller;

import com.api.service.ConfigTemplateService;
import com.core.model.dto.ConfigTemplateRequestDTO;
import com.core.model.entity.ConfigTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/templates")
public class ConfigTemplateController {

    private final ConfigTemplateService configTemplateService;

    @Autowired
    public ConfigTemplateController(ConfigTemplateService configTemplateService) {
        this.configTemplateService = configTemplateService;
    }

    @PostMapping()
    public ConfigTemplate registerNewConfigTemplate(@RequestBody ConfigTemplateRequestDTO configTemplateRequestDTO) {
        return configTemplateService.registerNewConfigTemplate(configTemplateRequestDTO);
    }
}

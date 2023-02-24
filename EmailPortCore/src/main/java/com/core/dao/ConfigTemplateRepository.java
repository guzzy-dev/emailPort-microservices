package com.core.dao;


import com.core.model.entity.ConfigTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigTemplateRepository extends JpaRepository<ConfigTemplate, Long> {
    ConfigTemplate getConfigTemplateByTemplateName(String configTemplateName);
}

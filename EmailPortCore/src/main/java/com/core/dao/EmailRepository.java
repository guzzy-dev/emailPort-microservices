package com.core.dao;

import com.core.model.entity.email.Email;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmailRepository extends JpaRepository<Email, Long> {

}

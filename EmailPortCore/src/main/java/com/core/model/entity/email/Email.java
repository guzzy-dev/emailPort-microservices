package com.core.model.entity.email;

import com.core.model.dto.EmailRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Email extends EmailBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Email (EmailRequestDTO emailRequestDTO) {
        this.emailTo = emailRequestDTO.getEmailTo();
        setData(emailRequestDTO.getData());
    }

}

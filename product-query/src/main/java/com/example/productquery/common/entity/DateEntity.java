package com.example.productquery.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class DateEntity {

    @CreatedDate
    @Column(name = "CRTE_DTTM", updatable = false)
    private LocalDateTime createDateTime;

    @LastModifiedDate
    @Column(name = "UPDT_DTTM")
    private LocalDateTime updateDateTime;

}

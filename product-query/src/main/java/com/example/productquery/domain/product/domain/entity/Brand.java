package com.example.productquery.domain.product.domain.entity;

import com.example.productquery.common.entity.DateEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Table(name = "BRAND")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Brand extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRAND_ID")
    private Long id;

    @Column(name = "BRAND_NM")
    private String name;

    @Builder
    public Brand(String name) {
        this.name = name;
    }

}

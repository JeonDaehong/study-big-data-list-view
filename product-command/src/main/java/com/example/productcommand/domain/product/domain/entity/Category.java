package com.example.productcommand.domain.product.domain.entity;

import com.example.productcommand.common.entity.DateEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Table(name = "CATEGORY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long id;

    @Column(name = "CATEGORY_NM")
    private String name;

    @Builder
    public Category(String name) {
        this.name = name;
    }
}

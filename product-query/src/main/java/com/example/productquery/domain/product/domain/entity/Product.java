package com.example.productquery.domain.product.domain.entity;

import com.example.productquery.common.entity.DateEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Table(name = "PRODUCT", indexes = @Index(name = "IDX_PRODUCT_NM", columnList = "name"))
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column(name = "PRODUCT_NM")
    private String name;

    @Column(name = "SCORE")
    private Double score;

    @Column(name = "SALE_STRT_DTTM")
    private LocalDateTime saleStartDateTime;

    @Column(name = "SALE_END_DTTM")
    private LocalDateTime saleEndDateTime;

    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @Column(name = "BRAND_ID")
    private Long brandId;

    @Column(name = "STATUS")
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Getter
    @RequiredArgsConstructor
    public enum Status {
        IN_REVIEW("심사 중"),
        SAVED("임시 저장"),
        APPROVING("승인 대기 중"),
        APPROVED("승인 완료"),
        PARTIAL_APPROVED("부분 승인 완료"),
        DENIED("승인 반려"),
        DELETED("상품 삭제");

        private final String description;
    }

    @Builder
    public Product(String name, Double score, LocalDateTime saleStartDateTime,
                   LocalDateTime saleEndDateTime, Long categoryId, Long brandId, Status status) {
        this.name = name;
        this.score = score;
        this.saleStartDateTime = saleStartDateTime;
        this.saleEndDateTime = saleEndDateTime;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.status = status;
    }

}

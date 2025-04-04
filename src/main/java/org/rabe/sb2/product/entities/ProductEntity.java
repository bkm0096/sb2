package org.rabe.sb2.prduct.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_product")
@EntityListeners(value = AuditingEntityListener.class)
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pno;

    private String pname;

    private int price;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(
            name = "tbl_product_img",
            joinColumns = @JoinColumn(name="product_pno"))
    @Builder.Default
    private List<ProductImage> images = new ArrayList<>();

    public void addImage(String fileName) {
        ProductImage image = new ProductImage();
        image.setImgName(fileName);
        image.setOrd(images.size());
    }

    public void clearImages() {
        images.clear();
    }

}
package org.rabe.sb2.prduct.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@ToString
@Setter
public class ProductImage {

    private String imgName;

    private int ord;
}
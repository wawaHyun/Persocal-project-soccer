
package com.study.api.product;
import java.util.List;

import com.study.api.order.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"productNum"})
@Entity(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id",nullable = false)
    private int productNum;
    private String productName;
    private String company;
    private int productPrice;

    // @OneToMany(mappedBy = "product")
    // private List<Order> orders;

    @Builder(builderClassName = "builer")
    public Product(int productNum, String productName, String company, int productPrice
    // , List<Order> orders
    ) {
        this.productNum = productNum;
        this.productName = productName;
        this.company = company;
        this.productPrice = productPrice;
        // this.orders = orders;
    }
}
package com.study.api.order;

import com.study.api.product.Product;
import com.study.api.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_Date")
    private String orderDate;

    @ManyToOne 
    @JoinColumn(name = "pro_id")
    private Product product;

    // @ManyToOne
    // @JoinColumn(name = "user_id")
    // private User user;

    @Builder(builderClassName = "builder")
    public Order(Long id,String orderDate,Product product
    // ,User user
    ){
        this.id = id;
        this.orderDate = orderDate;
        this.product = product;
        // this.user = user;
    }

}

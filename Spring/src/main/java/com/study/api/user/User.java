package com.study.api.user;

import java.util.*;

import com.study.api.account.Account;
import com.study.api.article.Article;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="users")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String password;
        private String name;
        private String phone;
        private Long address;
        private String job;
        private Double height;
        private Double weight;

        @OneToMany(mappedBy = "accHolder") 
        private List<Account> account;

        @OneToMany(mappedBy = "writer")
        private List<Article> article;

        @Builder(builderClassName = "builder")
        public User(Long id,String username, String password, String name,
                      String phone, Long address, String job, Double height, Double weight
                      // ,List<Account> account
                      // ,List<Article> article
                      ){
            this.id = id;
            this.username = username;
            this.password = password;
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.job = job;
            this.height = height;
            this.weight = weight;
            // this.account = account;
            // this.article = article;
        }
}

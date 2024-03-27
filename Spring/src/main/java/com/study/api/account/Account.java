
package com.study.api.account;
import lombok.*;

import java.time.LocalDate;

import com.study.api.user.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name ="accounts")
public class Account {
    @Id
    @Column(name="acc_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String accountNumber;  //계좌번호
    private String accountHolder; //예금주
    private double balance;  //잔고
    private LocalDate transactionDate; //거래일자
    private int money;

    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id")
    private Member member;

@Builder(builderClassName = "builder")
    public Account(long id, String accountNumber, String accountHolder, 
    double balance, LocalDate transactionDate, int money ){
    this.id = id;
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
    this.transactionDate = transactionDate;
    this.money = money;
}
}
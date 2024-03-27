
package com.study.api.account;

import lombok.RequiredArgsConstructor;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RestController;

import com.study.api.common.UtilService;
import com.study.api.enums.Messenger;

@RestController
@RequiredArgsConstructor
public class AccountController {
    AccountServiceImpl accSer;
    LocalDate nowDate = LocalDate.now(ZoneId.of("Asia/Seoul"));;
    UtilService util;

    public Messenger createAccount(Scanner sc) throws SQLException {
        System.out.println("Start creating your com.turing.api.account.");
        System.out.println("Please enter the com.turing.api.account holder.");
        return accSer.save(Account.builder()
                .accountNumber(util.createRandomAccount())
                .accountHolder(sc.next())
                .balance(0)
                .transactionDate(nowDate)
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("Start deposit.\n" +
                "Please enter your com.turing.api.account & holer & you want deposit.");
        return accSer.deposit(Account.builder()
                .transactionDate(nowDate)
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .money(sc.nextInt())
                .build());
    }

    public String withdraw(Scanner sc) {
        System.out.println("Start withdraw.\n" +
                "Please enter your com.turing.api.account & holer & you want withdraw.");
        return accSer.deposit(Account.builder()
                .transactionDate(nowDate)
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .money(sc.nextInt())
                .build());
    }

    public String getBalance(Scanner sc) {
        System.out.println("Enter the com.turing.api.account whose balance you want to check.");
        return accSer.getBalance(Account.builder()
                .accountNumber(sc.next())
                .transactionDate(nowDate)
                .build());
    }

    public Messenger cancelAccount(Scanner sc) {
        System.out.println("Start deleting your com.turing.api.account.");
        System.out.println("Please enter the Account & holder.");
        return null;
    }

    public String getAccount() {
        return accSer.count();
    }



}
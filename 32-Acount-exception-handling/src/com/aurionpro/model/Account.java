package com.aurionpro.model;

public class Account {

 private int accountnumber;
 private String name;
 private double balance;

 public Account(String name, int accountnumber, double balance) {
  super();
  this.accountnumber = accountnumber;
  this.name = name;
  this.balance = balance;
 }

 public int getAccountnumber() {
  return accountnumber;
 }

 public void setAccountnumber(int accountnumber) {
  this.accountnumber = accountnumber;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance(double balance) {
  this.balance = balance;
 }

 public void deposite(double amount) {
  this.balance += amount;
 }

 public void Withdraw(double amount) {
  int minBalance = 1000;
  if (this.balance - amount < minBalance) {
   throw new InsufficientFundsException(this.balance, amount);
  } else {
   this.balance -= amount;
   
  }

 }

 @Override
 public String toString() {
  return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
 }

}
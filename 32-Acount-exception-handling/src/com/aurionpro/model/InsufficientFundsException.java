package com.aurionpro.model;

public class InsufficientFundsException extends RuntimeException {
 private static final long serialVersionUID = 1L;
 double balance, amount;

 public InsufficientFundsException(double balance, double amount) {
  this.balance = balance;
  this.amount = amount;
 }

 @Override
 public String getMessage() {
  return getClass().getSimpleName() + "\t" + "Balance=" + balance + "\t withdraw Amount=" + amount;
 }

// @Override
// public String toString() {
//  return getClass().getSimpleName() + "\t" + "Balance=" + balance + "\t withdraw Amount=" + amount;
// }

}
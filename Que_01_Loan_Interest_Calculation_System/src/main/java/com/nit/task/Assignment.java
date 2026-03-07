/*Ques 1 — Loan Interest Calculation System

Develop a Spring Core application using Strategy Pattern to calculate loan interest based on loan type.

Requirements

1. Interface
InterestStrategy

Method:

double calculateInterest(double amount);

2. Implement classes

HomeLoanInterest

Interest Rate = 7%

CarLoanInterest

Interest Rate = 9%

3. Service class

LoanService

Inject InterestStrategy

Method:

void processLoan(double amount)

4. Output
Display calculated interest.

Example Output
---------------
Loan Type: Car Loan
Loan Amount: 200000
Interest Amount: 18000*/
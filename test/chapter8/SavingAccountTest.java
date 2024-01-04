package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {
//    SavingAccount saverOne;
//    SavingAccount saverTwo;
//    @BeforeEach
//    public void startBeforeAll(){
//        saverOne = new SavingAccount();
//        saverTwo = new SavingAccount();
//
//    }
    @Test
    public void testThatSavingAccountOfSaverOne(){
        SavingAccount.modifyInterestRate(4);
        SavingAccount saverOne = new SavingAccount();
        saverOne.setSavingsDeposit(2000);
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        saverOne.calculateMonthlyInterest();
        SavingAccount saverTwo = new SavingAccount();
        saverTwo.setSavingsDeposit(3000);
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        saverTwo.calculateMonthlyInterest();
        assertEquals(2081.49,saverOne.getSavingsBalance());
        assertEquals(3122.22,saverTwo.getSavingsBalance());

    }

}
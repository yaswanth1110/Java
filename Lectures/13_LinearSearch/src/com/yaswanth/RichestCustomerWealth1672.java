package com.yaswanth;

public class RichestCustomerWealth1672 {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Initialize to 0 for correct comparison
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];  // Calculate the wealth of the current customer
            }
            if (sum > maxWealth) {  // Update maxWealth if current customer's wealth is greater
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
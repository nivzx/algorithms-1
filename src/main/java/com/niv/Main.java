package com.niv;

import com.niv.module2.DynamicConnectivity;

public class Main {
    public static void main(String[] args) {
        DynamicConnectivity.executeQuickFind();
        System.out.println("=======================");
        DynamicConnectivity.executeQuickUnion();
        System.out.println("=======================");
        DynamicConnectivity.executeWeightedQuickUnion();
    }
}
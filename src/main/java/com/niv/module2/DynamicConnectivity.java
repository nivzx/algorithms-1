package com.niv.module2;

import com.niv.module2.unionfind.QuickFindUF;
import com.niv.module2.unionfind.QuickUnion;
import com.niv.module2.unionfind.WeightedQuickUnion;

public class DynamicConnectivity {
    public static void executeQuickFind() {
        QuickFindUF UF = new QuickFindUF(10);

        UF.union(4,3);
        UF.union(3,8);
        UF.union(6,5);
        UF.union(9,4);
        UF.union(2,1);
        UF.union(5,0);
        UF.union(7,2);
        UF.union(6,1);

        System.out.println("Is 5 and 2 connected: " + UF.connected(5, 2));
        System.out.println("Is 1 and 9 connected: " + UF.connected(1, 9));
        System.out.println("Is 1 and 7 connected: " + UF.connected(1, 7));
        System.out.println("Is 8 and 4 connected: " + UF.connected(8, 4));
        System.out.println("Is 6 and 9 connected: " + UF.connected(6, 9));
    }

    public static void executeQuickUnion() {
        QuickUnion UF = new QuickUnion(10);

        UF.union(4,3);
        UF.union(3,8);
        UF.union(6,5);
        UF.union(9,4);
        UF.union(2,1);
        UF.union(5,0);
        UF.union(7,2);
        UF.union(6,1);
        UF.union(7,3);

        System.out.println("Is 5 and 2 connected: " + UF.connected(5, 2));
        System.out.println("Is 1 and 9 connected: " + UF.connected(1, 9));
        System.out.println("Is 1 and 7 connected: " + UF.connected(1, 7));
        System.out.println("Is 8 and 4 connected: " + UF.connected(8, 4));
        System.out.println("Is 6 and 9 connected: " + UF.connected(6, 9));
    }

    public static void executeWeightedQuickUnion() {
        WeightedQuickUnion UF = new WeightedQuickUnion(10);

        UF.union(4,3);
        UF.union(3,8);
        UF.union(6,5);
        UF.union(9,4);
        UF.union(2,1);
        UF.union(5,0);
        UF.union(7,2);
        UF.union(6,1);
        UF.union(7,3);

        System.out.println("Is 5 and 2 connected: " + UF.connected(5, 2));
        System.out.println("Is 1 and 9 connected: " + UF.connected(1, 9));
        System.out.println("Is 1 and 7 connected: " + UF.connected(1, 7));
        System.out.println("Is 8 and 4 connected: " + UF.connected(8, 4));
        System.out.println("Is 6 and 9 connected: " + UF.connected(6, 9));
    }
}

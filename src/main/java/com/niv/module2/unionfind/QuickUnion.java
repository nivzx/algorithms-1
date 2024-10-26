package com.niv.module2.unionfind;

public class QuickUnion {
    private final int[] idArray;

    public QuickUnion(int N) {
        idArray = new int[N];
        for (int i=0; i<N; i++) {
            idArray[i] = i;
        }
    }

    private int root(int p) {
        while (idArray[p] != p) {
            p = idArray[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        idArray[rootP] = rootQ;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}

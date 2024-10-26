package com.niv.module2.unionfind;

public class WeightedQuickUnionWithPathCompression {
    private final int[] idArray;
    private final int[] sizeArray;

    public WeightedQuickUnionWithPathCompression(int N) {
        idArray = new int[N];
        sizeArray = new int[N];
        for (int i=0; i<N; i++) {
            idArray[i] = i;
            sizeArray[i] = 1;
        }
    }

    private int root(int p) {
        while (idArray[p] != p) {
            idArray[p] = idArray[idArray[p]]; // path compression
            p = idArray[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (sizeArray[rootP] >= sizeArray[rootQ]) {
            idArray[rootQ] = rootP;
            sizeArray[rootP] += sizeArray[rootQ];
        } else {
            idArray[rootP] = rootQ;
            sizeArray[rootP] += sizeArray[rootQ];
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}

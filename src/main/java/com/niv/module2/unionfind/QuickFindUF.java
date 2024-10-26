package com.niv.module2.unionfind;

public class QuickFindUF {
    private final int[] idArray;

    // Constructor
    public QuickFindUF(int N) {
        idArray = new int[N];

        for (int i=0; i<N; i++) {
            idArray[i] = i;
        }
    }

    // Find
    public boolean connected(int p, int q) {
        return idArray[p] == idArray[q];
    }

    // Union
    public void union(int p, int q) {
        int pid = idArray[p];
        int qid = idArray[q];
        for (int i = 0; i< idArray.length;  i++) {
            if (idArray[i]==pid) idArray[i] = qid;
        }
    }
}

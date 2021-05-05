package com.company;

public class Solution {
    private StructureResultat[] result;

    public Solution() {
    }

    public Solution(StructureResultat[] result) {
        this.result = result;
    }

    public StructureResultat[] doSolution() {
        for (int i = 0; i < this.result.length - 1; i++) {
            for (int j = i; j < this.result.length; j++) {
                if (this.result[i].getMyn() > this.result[j].getMyn()) {
                    StructureResultat resTemp = this.result[i];
                    this.result[i] = this.result[j];
                    this.result[j] = resTemp;
                }
            }
        }
        return result;
    }
    //

}

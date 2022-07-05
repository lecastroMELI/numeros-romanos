package com.example.numerosromanos.controllers;

public class NumRomanos {
    private String numRomanos[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public NumRomanos() {

    }

    public NumRomanos(String[] numRomanos) {
        this.numRomanos = numRomanos;
    }

    public String[] getNumRomanos() {
        return numRomanos;
    }

    public void setNumRomanos(String[] numRomanos) {
        this.numRomanos = numRomanos;
    }

    public String retornaNumRomano(int numDecimal) {
        return numRomanos[numDecimal];
    }
}

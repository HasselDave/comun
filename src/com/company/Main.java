package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Cuvintele comune sunt: ");
        String a[] = {"java","test", "university"};
        String b[] = {"mamaaaaaa", "university", "tattttttaaaaa"};
        for (int i = 1; i<a.length; i++) {
            for (int j=1;j<b.length;j++) {
                if(a[i]==b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
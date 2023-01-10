package org.example;

public class Main {
    public static void main(String[] args) {

        // 0) ?????????? ????
        byte varByte = 55;  // ???????? -127 ... 128, default = 0
        short varShort = 32000; //????????  -32,768 ...  32,767 default = 0
        int varInt = 352343254; // ???????? -2^31 ... 2^31-1 default = 0
        long varLong = 4445952343254L;//  ???????? -2^63 ... 2^63-1 default = 0L
        float varFloat = 6.667868f; // -3.4E+38 ... 3.4E+38  default = 0.0f
        double varDouble = 1.9; // -1.7E+308...1.7E+308  default =0.0d
        boolean varBoolean = true; // true or false. default = false;
        char varChar='f'; // 16-????????? ??????? Unicode.

        // ??????? ????????

        System.out.println(varByte + varShort);
        System.out.println(varInt - varLong);
        System.out.println(varByte / varFloat);
        System.out.println(varByte % varShort);

        // 1) ????????????
        System.out.println((byte) (varByte + 5));
        System.out.println((short) (varShort + varLong));

        // 2) ?????????? ? int ? double

        System.out.print( "varInt + varDouble:");
        System.out.print(varInt + varDouble);
        System.out.println("  ");
        System.out.print("varInt - varDouble:");
        System.out.print(varInt - varDouble);


    }


}
package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        //number_Type
        byte b = 127;
        short d = 324;
        int i = 2057345348;
        long l = 8583465834683787774L;

        // 9.76
        float f = 6567998.77778989855578790087687576576798889676458f;
        System.out.println(f);
        //-9.673473477757765
        double dob = -4656849.67347347775776565475475474676476764767647546546546546576767678686667576756757556556565656566565656565656565657757;
        System.out.println(dob);

        char ch = 'a';
        char chi = 'b';
        System.out.println((char)1);
        boolean or = true;
        //AtomicInteger atomicInteger= new AtomicInteger();
        //BigInteger bg = new BigInteger("5496596598654986u5495764567596759597695376357693576983579673598635798673967398679835769359576957635678347564385684356843568345643786438567438");



	// write your code here
        /*int [] num = {3,8,-3,890,34, 4, -456, -34, 0, 767, -4325};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
                if(num[j]> num[j+1]){
                    int t = num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }

        System.out.println(Arrays.toString(num));*/
    }
}

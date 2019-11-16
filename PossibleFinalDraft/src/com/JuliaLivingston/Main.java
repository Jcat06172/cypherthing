package com.JuliaLivingston;
import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

        public static void main(String args[]) throws IOException
        {

                        CaeCipher objcc = new CaeCipher();


            HillCipher objhc = new HillCipher();



                        int choice=0;

                        String transfer;


                        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Menu:\n1: Encryption\n2: Decryption");
                        choice = Integer.parseInt(in.readLine());
                        System.out.println("Enter the line: ");
                        String line = in.readLine();
                        System.out.println("Enter the Hill key: ");
                        String key = in.readLine();
                         System.out.println("Enter the Caesar key");
                        int key2 = Integer.parseInt(in.readLine());
                        double sq = Math.sqrt(key.length());
                        if (sq != (long) sq)
                                System.out.println("Cannot Form a square matrix");
                        else {
                                int size = (int) sq;
                                if (objhc.check(key, size)) {

                                        System.out.println("Result:");
                                        objhc.cofact(objhc.km, size);
                                        transfer=objhc.performDivision2(line, size);




                                }
                        }
                }
        }
}
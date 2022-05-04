package com.Bridgelabz.Day6Assignment2;

public class SquareRootNewtonsMethod {


        public static void main(String[] args) {
            double c = Double.parseDouble(args[0]);

            double epsilon = 1e-15;
            double t = c;


            while (Math.abs(t - c/t) > epsilon*t)
            {
                t = (c/t + t) / 2.0;
            }

            System.out.println(t);
        }

    }


package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        int ans1=p.product(23, 25);
        int ans2=p.product(2, 3, 4);
        double d=p.product(10.0, 20.0);
    }
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
}
package Day6CoreJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateCouponNumber() {
        StringBuilder coupon = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            coupon.append(CHARS.charAt(getRandomIndex(random, CHARS.length())));
        }

        return coupon.toString();
    }

    public static ArrayList<String> generateUniqueCoupons(int numCoupons) {
        ArrayList<String> coupons = new ArrayList<>();
        new Random();

        while (coupons.size() < numCoupons) {
            String coupon = generateCouponNumber();
            if (!coupons.contains(coupon)) {
                coupons.add(coupon);
            }
        }

        return coupons;
    }

    private static int getRandomIndex(Random random, int max) {
        return random.nextInt(max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCoupons = sc.nextInt();
        ArrayList<String> uniqueCoupons = generateUniqueCoupons(numCoupons);

        for (String coupon : uniqueCoupons) {
            System.out.println(coupon);
        }
    }
}
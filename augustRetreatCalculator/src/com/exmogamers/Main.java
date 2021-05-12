package com.exmogamers;

public class Main {

    private static int totalPayed;
    public static double ARPsal = 0;
    public static double moneyLeft = 0;
    public static double sunscreenPack = 0;
    public static int deoderantPack = 0;
    public static double shampoo = 54;
    public static double conditioner = 20;
    public static double lotion = 24.99 + 16; // https://www.amazon.com/Approved%EF%BC%8C2-Bottles-Small-Silicone-Containers-Included/dp/B07ZT6FK52/ref=asc_df_B07ZT6FK52/?tag=hyprod-20&linkCode=df0&hvadid=385344870621&hvpos=&hvnetw=g&hvrand=2906703431679353270&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9029817&hvtargid=pla-915462929997&psc=1&tag=&ref=&adgrpid=87036378148&hvpone=&hvptwo=&hvadid=385344870621&hvpos=&hvnetw=g&hvrand=2906703431679353270&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9029817&hvtargid=pla-915462929997
    // https://smile.amazon.com/dp/B078SFSH3Q/ref=cm_sw_r_oth_api_glt_fabc_GM8GVT94FW8A76SX2DTK
    public static double soap = 12;

    public static void main(String[] args) {
        int people = 30;




        totalPayed = people * 180;


        if(moneyLeft < 0) {
            if (((totalPayed * 0.1) + moneyLeft) > 0) {

                moneyLeft = totalPayed;
                sunscreenPack = (people / 3) * 5.50;

                if(people < 29) deoderantPack = 58;
                else if (people > 28 && people <= 34)deoderantPack = 58 + 18;
                else if (people > 34) deoderantPack = 58 + 36;

                deoderantPack *= 1.07;
                sunscreenPack *= 1.07;
                shampoo *= 1.07;
                conditioner *= 1.07;
                lotion *= 1.07;
                soap *= 1.07;

                moneyLeft -= 2996;
                moneyLeft -= deoderantPack;
                moneyLeft -= sunscreenPack;
                moneyLeft -= shampoo;
                moneyLeft -= conditioner;
                moneyLeft -= lotion;
                moneyLeft -= soap;

                ARPsal = moneyLeft / 3;
                moneyLeft = 0;
            }

        } else {
            ARPsal = totalPayed * 0.1;
            ARPsal /= 3;
        }

        System.out.println("-----People-----: " + people);
        System.out.println("Total Payed: " + totalPayed);
        System.out.println("Deodorant: " + deoderantPack);
        System.out.println("Sunscreen: " + sunscreenPack);
        System.out.println("Shampoo: " + shampoo);
        System.out.println("Conditioner: " + conditioner);
        System.out.println("Lotion: " + lotion);
        System.out.println("Toiletries: " + (lotion + conditioner + shampoo + sunscreenPack + deoderantPack + soap));
        System.out.println("ARP salary: " + ARPsal);
        System.out.println("Wave Runner Money (Fun Money): " + moneyLeft);


    }

}

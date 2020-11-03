package lesson6.bai63;

import java.util.Random;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        /**
         * Nhập vào thông tin các cửa hàng, cũng như thông tin chi tiết các điện thoại có trong cửa hàng đó.
         */
        Store[] stores = new Store[3];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i< stores.length;i++){
            SmartPhone[] smartPhones = new SmartPhone[5];
            for (int j=0;j<smartPhones.length;j++){
                //Lay tu du lieu nguoi dung nhap hoac lay tu de bai
                SmartPhone smartPhone = new SmartPhone("Brand_"+j, random.nextBoolean(), random.nextBoolean(),
                        random.nextBoolean(), "Android",4,"Sky Blue",199,
                        random.nextInt(10));
                smartPhones[j] = smartPhone;//gan bi nguoc
            }
            stores[i] = new Store("Store_"+i,"Street_"+i, random.nextInt(10),smartPhones );
            System.out.println(stores[i].toString());
        }
        StoreManagement storeManagement = new StoreManagement(stores);
        Store bestseller = storeManagement.getBestStore_Seller();
        System.out.println();
        System.out.println("Best Store Seller :"+bestseller.getStoreName());
        System.out.println(bestseller.getStoreName()+" has sold "+bestseller.getTotalSold()+"devices");
        System.out.println("Number of devices has 5G/Bluetooth/Wifi:"+storeManagement.countTypeFunction(StoreManagement.Phone_Type.Full));
    }
}

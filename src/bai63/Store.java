package lesson6.bai63;

import java.util.Arrays;

public class Store {
    private String storeName;
    private String address;
    private int totalSmartphoneInStore;
    private SmartPhone[] smartPhones;


    //tính tổng số lượng điện thoại bán được
    public int getTotalSold(){
        int count =0;
        for (SmartPhone smartPhone :smartPhones){
            count += smartPhone.getTotalSold();
        }
    return  count;
    }
    //tính tổng doanh thu
    public int getRevenue(){
        int totalRevenue=0;
        for (SmartPhone smartPhone: smartPhones){
            totalRevenue += smartPhone.getTotalSold()*smartPhone.getPrice();
        }
        return totalRevenue;
    }

    //Constructor
    public Store(String storeName, String address, int totalSmartphone, SmartPhone[] smartPhones) {
        this.storeName = storeName;
        this.address = address;
        this.totalSmartphoneInStore = totalSmartphone;
        this.smartPhones = smartPhones;
    }

    //getter & setter


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalSmartphoneInStore() {
        return totalSmartphoneInStore;
    }

    public void setTotalSmartphoneInStore(int totalSmartphoneInStore) {
        this.totalSmartphoneInStore = totalSmartphoneInStore;
    }

    public SmartPhone[] getSmartPhones() {
        return smartPhones;
    }

    public void setSmartPhones(SmartPhone[] smartPhones) {
        this.smartPhones = smartPhones;
    }

    /**
     *
     */
    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", totalSmartphoneInStore=" + totalSmartphoneInStore +
                ", smartPhones=" + Arrays.toString(smartPhones) +
                '}';
    }
}

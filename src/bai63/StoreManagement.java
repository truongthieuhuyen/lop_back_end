package lesson6.bai63;

public class StoreManagement {

    private Store[] stores;

    /**
     * tính tổng điện thoại có 5G/Wifi/Bluetooth
     */
    public enum Phone_Type{
        _1of3,
        _2of3,
        Full,
    }
    
    public int countTypeFunction(Phone_Type phone_type){
        int count = 0;
        for (Store store : stores){
            for (SmartPhone smartPhone : store.getSmartPhones()){
                switch (phone_type){
                    case Full:
                        if (smartPhone.isHasWifi() && smartPhone.isHasBluetooth() && smartPhone.isHas5G()){
                            count ++;
                        }break;
                    case _1of3:
                        if (smartPhone.isHas5G() || smartPhone.isHasBluetooth() || smartPhone.isHasWifi()){
                            count ++;
                        }break;
                    case _2of3:
                        if ((smartPhone.isHasWifi() && smartPhone.isHasBluetooth()) ||
                                (smartPhone.isHasWifi() && smartPhone.isHas5G()) ||
                                (smartPhone.isHas5G() && smartPhone.isHasBluetooth())){
                            count ++;
                        }break;
                }
            }
        }return count;
    }

    /**
     * tìm BestStore-Seller
     */
    public Store getBestStore_Seller(){
        Store bestStoreSell =stores[0];
        for (Store store : stores){
            if (bestStoreSell.getRevenue() <= store.getRevenue()){
                bestStoreSell = store;
            }
        }
        return bestStoreSell;
    }

    //constructor
    public StoreManagement( Store[] stores) {
        this.stores = stores;
    }

    //getter & setter

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }
}

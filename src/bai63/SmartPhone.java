package lesson6.bai63;

public class SmartPhone {
    private String brand;
    private boolean has5G;
    private boolean hasWifi;
    private boolean hasBluetooth;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold;

    public long revenue() {
        long revenue = price * totalSold;
        return revenue;
    }

    //in ra hết thông tin
    @Override
    public String toString() {
        return "\n     SmartPhone{" +
                "brand='" + brand + '\'' +
                ", has5G=" + has5G +
                ", hasWifi=" + hasWifi +
                ", hasBluetooth=" + hasBluetooth +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }

    //Constructor
    public SmartPhone(String brand, boolean has5G, boolean hasWifi, boolean hasBluetooth, String os, float memory, String color, long price, int totalSold) {
        this.brand = brand;
        this.has5G = has5G;
        this.hasWifi = hasWifi;
        this.hasBluetooth = hasBluetooth;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
    }
    //getter & setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }
}

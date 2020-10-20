public class Rectangle  {
    //khai báo thuộc tính
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public double getP() {
        return (width+height)*2;
    }
    public double getS(){
        return width*height;
    }
    public void printWidthHeight(){
        System.out.println("width ="+ width);
        System.out.println("height ="+height);
    }
    public boolean checkRectangle(){
        if (width==height){
            return true;
        }else {
            return false;

        }
    }


    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10);
        System.out.println("Dien tich la:" + rectangle.getS());
        System.out.println("Chu vi la:" + rectangle.getP());
        System.out.println("Đây là hình vuông :"+rectangle.checkRectangle());

    }
}

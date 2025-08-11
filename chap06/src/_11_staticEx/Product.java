package _11_staticEx;

public class Product {
    String serial;
    static int cnt = 0;
    String title;
    
    Product() {
        cnt++; 
        this.serial = "더조은" + cnt;
        this.title = "제목없음" + cnt + ".txt";
        
        System.out.println("제목 : " + title);
    }
    Product(String title) {
    	cnt++;
    	this.serial = "더조은" + cnt;
    	this.title = title + ".txt";
    	System.out.println("제목 : " + this.title);
    }

    static int getCount() {
        return cnt;
    }

    void info() {
        System.out.println("제품번호: " + serial);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("java");
        Product p3 = new Product();

        System.out.println("생산된 총 제품의 갯수 : " + Product.getCount());

        Product p4 = new Product();
        Product p5 = new Product();

        System.out.println("생산된 총 제품의 갯수 : " + Product.getCount());
    }
}

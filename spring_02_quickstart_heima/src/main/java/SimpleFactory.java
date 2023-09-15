
/**
 * 简单工厂
 *
 * 优点：由工厂来专门创建类
 * 缺点：麻烦
 */

public class SimpleFactory {

    public static Product createProduct(String type){
        if (type.equals("A")){
            return new ProductA();
        } else {
            return new ProductB();
        }
    }

    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.print();

    }
}

abstract class Product{
    public abstract void print();

}


class ProductA extends Product{


    @Override
    public void print() {
        System.out.println("A");
    }
}

class ProductB extends Product{

    @Override
    public void print() {
        System.out.println("B");
    }
}


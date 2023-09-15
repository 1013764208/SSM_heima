package com.item;


// 抽象工厂
public interface AbstractFactory {
    Phone createPhone(String param);

    Mask createMasK(String parm);
}

// 具体工厂
class SuperFactory implements AbstractFactory {

    @Override
    public Phone createPhone(String param) {
        return new iPhone();
    }

    @Override
    public Mask createMasK(String parm) {
        return new N95();
    }
}

// 产品大类——手机
interface Phone {
}

class iPhone implements Phone {
}

interface Mask {
}

class N95 implements Mask {
}
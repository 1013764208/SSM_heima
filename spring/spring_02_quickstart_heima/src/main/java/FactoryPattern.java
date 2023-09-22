
public class FactoryPattern {

    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Phone phone = huaweiFactory.createPhone();
        phone.print();
    }
}


interface Phone {
    void print();

}

class iPhone implements Phone {

    @Override
    public void print() {

    }
}

class HuaWeiPhone implements Phone {

    @Override
    public void print() {
        System.out.println("遥遥领先");
    }
}


interface Factory {
    Phone createPhone();
}

class IphoneFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new iPhone();
    }
}

class HuaweiFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }
}

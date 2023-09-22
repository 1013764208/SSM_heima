package dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void update() {
        System.out.println("book dao update ...");
    }

    public int select() {
        System.out.println("book dao select ...");
        return 100;
    }
}

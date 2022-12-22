package com.patterns.singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM nhanvien");

        Database bar = Database.getInstance();
        bar.query("SELECT id, ngaysinh FROM nhanvien WHERE id = 5");
    }
}

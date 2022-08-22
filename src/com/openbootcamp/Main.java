package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        Coche fiat = new Coche("Fiat", 2015);
        Coche toyota = new Coche("Toyota", 2020);
        Coche volkswagen = new Coche("Volkswagen", 2022);
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save(fiat);
        cocheCrud.save(toyota);
        cocheCrud.save(volkswagen);
        System.out.println(cocheCrud.findAll());
        cocheCrud.delete(fiat);
        System.out.println(cocheCrud.findAll());
    }
}

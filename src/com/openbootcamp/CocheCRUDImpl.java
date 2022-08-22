package com.openbootcamp;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    List<Coche> lista = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        lista.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return lista;
    }

    @Override
    public void delete(Coche coche) {
        lista.remove(coche);
    }
}

package by.byshnev.services;

import java.util.List;

public interface DAO<T> {

    List<T> getAll();
}

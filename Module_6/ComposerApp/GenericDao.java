/*
    Locascio, D. (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.List;

public interface GenericDao<E, K> {
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
}
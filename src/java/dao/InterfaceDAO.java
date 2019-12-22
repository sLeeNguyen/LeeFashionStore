package dao;

/**
 *
 * @author Lee Nguyen
 */
public interface InterfaceDAO {
    default boolean add(Object obj) {
        return false;
    }
    default boolean update(Object obj) {
        return false;
    }
    default boolean delete(Object obj) {
        return false;
    }
}

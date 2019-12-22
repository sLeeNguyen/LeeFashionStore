package test;

import dao.CategoryDAO;
import dao.ProductDAO;

/**
 *
 * @author Lee Nguyen
 */
public class Test {
    public static void main(String[] args) {
        CategoryDAO cd = new CategoryDAO();
        ProductDAO pd = new ProductDAO();
        System.out.println(pd.getListProductsByCategoryId("cid1").size());
    }
}

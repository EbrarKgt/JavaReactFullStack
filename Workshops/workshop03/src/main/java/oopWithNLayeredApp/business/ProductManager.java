package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger [] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice() < 10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        //ProductDao productDao = new HibernateProductDao(); //interface onu implemente eden sınıfın referansını tutabilir
        productDao.add(product);
        //ProductDao productDao = new JdbcProductDao();
        /*JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product); */

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }

    }
}

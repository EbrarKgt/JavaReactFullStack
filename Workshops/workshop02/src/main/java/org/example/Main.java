package org.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        /*product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "bilmemne.jpg";*/

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");

        /*product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitsInStock = 2;
        product2.imageUrl = "bilmemne2.jpg";*/

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("image3.jpg");

        /*product3.name = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitsInStock = 4;
        product3.imageUrl = "bilmemne3.jpg";*/

        Product [] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        System.out.println("-----------------------");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0574754748");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("ee");
        individualCustomer.setLastName("kk");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("ff");
        corporateCustomer.setPhone("36327723");
        corporateCustomer.setTaxNumber("222");
        corporateCustomer.setCustomerNumber("345");

        Customer [] customers = {individualCustomer, corporateCustomer};
    }
}
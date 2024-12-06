package oopInJava;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Product
{
    private Long productId;
    private String productName;
    private String productManufacturer;
    private Float productPrice;
    private LocalDateTime productManufacturingDate;
    private String productCategory;
    private String productDescription;

    public Product()
    {
        System.out.println("No Argument Constructor Called");
    }

    public Product(Long productId,
                   String productName,
                   String productManufacturer,
                   Float productPrice,
                   LocalDateTime productManufacturingDate,
                   String productCategory,
                   String productDescription
                   )
    {
        this.productId = productId;
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productManufacturingDate = productManufacturingDate;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
    }

    public Long getProductId()
    {
        return  this.productId;
    }

    public void setProductId(Long productId)
    {
        this.productId = productId;
        return;
    }

    public LocalDateTime getProductManufacturingDate()
    {
        return this.productManufacturingDate;
    }

    public void setProductManufacturingDate(LocalDateTime productManufacturingDate)
    {
        this.productManufacturingDate = productManufacturingDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}

public class Example10 {
    public static void main(String[] args)
    {
//        Product amulMilk = new Product();
//        System.out.println(amulMilk.getProductId());
//        System.out.println(amulMilk.getProductName());
//        System.out.println(amulMilk.getProductPrice());
//        System.out.println(amulMilk.getProductCategory());
//        System.out.println(amulMilk.getProductManufacturingDate());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        int hour = dateTime.getHour();
        System.out.println(hour);

        int nano = dateTime.getNano();
        System.out.println(nano);

        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println(dayOfMonth);

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());

        Product appleIphone16 = null;
        appleIphone16 = new Product(
                121212L,
                "Apple Iphone 16 Pro Max",
                "Apple California",
                999.99f,
                LocalDateTime.now(),
                "Electronics And Gadgets",
                "You know What We Build"
                );

        System.out.println(appleIphone16.getProductId());
        System.out.println(appleIphone16.getProductName());
        System.out.println(appleIphone16.getProductPrice());

        appleIphone16.setProductPrice(899.99f);
        System.out.println(appleIphone16.getProductPrice());


    }
}

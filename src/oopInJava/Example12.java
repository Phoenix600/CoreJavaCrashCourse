package oopInJava;

import java.time.LocalDateTime;

class MobilePhone
{
    private Long mobilePhoneId;
    private String brandName;
    private String modelName;
    private Integer ram;
    private Integer rom;
    private Float price;
    private Long batteryCapacity;
    private String processorName;
    private LocalDateTime manufacturingDate;

    public MobilePhone() {
    }

    public MobilePhone(String processorName, Long batteryCapacity, Float price, Integer rom, Integer ram, String modelName, String brandName, Long mobilePhoneId) {
        this.processorName = processorName;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
        this.rom = rom;
        this.ram = ram;
        this.modelName = modelName;
        this.brandName = brandName;
        this.mobilePhoneId = mobilePhoneId;
        this.manufacturingDate = LocalDateTime.now();
    }

    public Long getMobilePhoneId() {
        return mobilePhoneId;
    }

    public void setMobilePhoneId(Long mobilePhoneId) {
        this.mobilePhoneId = mobilePhoneId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Long batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "Mobile Phone Details : " + this.brandName + "..." + this.modelName + "..." + this.ram + "..." + this.rom + "..." + this.price + "..." + this.batteryCapacity + "..." + this.processorName + "..." + this.manufacturingDate;
    }
}


public class Example12 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Snapdragon", 5000L, 12000F, 128, 8, "Pixel 3", "Google", 1L);
        System.out.println(mobilePhone);

        MobilePhone mobilePhone2 = new MobilePhone();
        mobilePhone2.setBrandName("Apple");
        mobilePhone2.setModelName("Iphone 12 Pro Max");
        mobilePhone2.setRam(8);
        mobilePhone2.setRom(128);
        mobilePhone2.setPrice(45000.0f);
        mobilePhone2.setBatteryCapacity(5000L);
        mobilePhone2.setProcessorName("Bionic A 18");
        mobilePhone2.setManufacturingDate(LocalDateTime.now());

        String brandName = mobilePhone.getBrandName();
        System.out.println("Brand Name : " + brandName);

        String modelName = mobilePhone.getModelName();
        System.out.println("Model Name : " + modelName);

        Integer ram = mobilePhone.getRam();
        System.out.println("RAM : " + ram);

        Integer rom = mobilePhone.getRom();
        System.out.println("ROM : " + rom);

        Float price = mobilePhone.getPrice();
        System.out.println("Price : " + price);

        Long batteryCapacity = mobilePhone.getBatteryCapacity();
        System.out.println("Battery Capacity : " + batteryCapacity);

        String processorName = mobilePhone.getProcessorName();
        System.out.println("Processor Name : " + processorName);

        LocalDateTime manufacturingDate = mobilePhone.getManufacturingDate();
        System.out.println("Manufacturing Date : " + manufacturingDate);
    }
}

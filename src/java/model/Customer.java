package model;

/**
 *
 * @author Lee Nguyen
 */
public class Customer {
    private int customerId;
    private String name;
    private String phone;
    private String address;
    private String ccNumber;
    private String cityRegion;

    public Customer(int customerId, String name, String phone, String address, String ccNumber, String cityRegion) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.ccNumber = ccNumber;
        this.cityRegion = cityRegion;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }
    
    
}

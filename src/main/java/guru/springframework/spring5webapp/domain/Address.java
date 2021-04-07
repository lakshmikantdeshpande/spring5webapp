package guru.springframework.spring5webapp.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String addressLine1;
    private String city;
    private String state;
    private Integer zip;

    public Address() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addressLine1, address.addressLine1) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zip, address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, city, state, zip);
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Address(String addressLine1, String city, String state, Integer zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}

package org.example.auxiliary;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address
        implements Comparable<Address>{

    private String country;
    private String address;
    private int zip;

    @Override
    public int compareTo(Address o) {
        if (this.zip > o.zip) {
            return 1;
        } else if (this.zip < o.zip) {
            return -1;
        }
        if (this.country.compareTo(o.country) > 0) {
            return 1;
        } else if (this.country.compareTo(o.country) < 0) {
            return -1;
        }
        return this.address.compareTo(o.address);
    }
}
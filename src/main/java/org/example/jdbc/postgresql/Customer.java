package org.example.jdbc.postgresql;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.jdbc.postgresql.util.DataTransferObject;

@Getter
@Setter
@ToString
public class Customer
        implements DataTransferObject {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}
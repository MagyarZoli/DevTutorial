package org.example.jdbc.postgresql;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.jdbc.postgresql.util.DataTransferObject;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Order
        implements DataTransferObject {

    private long id;
    private String customerFirstName;
    private String customerLastLane;
    private String customerEmail;
    private Date creationDate;
    private BigDecimal totalDue;
    private String status;
    private String salespersonFirstName;
    private String salespersonLastName;
    private String salespersonEmail;
    private List<OrderLine> orderLines;
}
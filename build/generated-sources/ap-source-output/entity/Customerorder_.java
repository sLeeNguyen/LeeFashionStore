package entity;

import entity.Customer;
import entity.Orderedproduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-28T09:20:00")
@StaticMetamodel(Customerorder.class)
public class Customerorder_ { 

    public static volatile SingularAttribute<Customerorder, Integer> amount;
    public static volatile SingularAttribute<Customerorder, Integer> confirmationNumber;
    public static volatile SingularAttribute<Customerorder, String> orderId;
    public static volatile SingularAttribute<Customerorder, Customer> customercustomerid;
    public static volatile SingularAttribute<Customerorder, Orderedproduct> orderedproduct;
    public static volatile SingularAttribute<Customerorder, String> dateCreate;

}
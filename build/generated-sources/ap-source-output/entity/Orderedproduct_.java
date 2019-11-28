package entity;

import entity.Customerorder;
import entity.OrderedproductPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-28T09:20:01")
@StaticMetamodel(Orderedproduct.class)
public class Orderedproduct_ { 

    public static volatile SingularAttribute<Orderedproduct, OrderedproductPK> orderedproductPK;
    public static volatile SingularAttribute<Orderedproduct, Integer> quantity;
    public static volatile CollectionAttribute<Orderedproduct, Customerorder> customerorderCollection;

}
package factoryfastOrders;

import enums.BucketType;
import order.Order;

/**
 * Created by arsen on 21.11.16.
 */
public class OrderFactory {
    public Order getBucket(BucketType bucket){
        Order order = new Order();
        if (bucket == BucketType.BIRTHDAYBUCKET){
            order.addItem(new WeddingBucket());
        }
        else if(bucket == BucketType.FUNERALBUCKET){
            order.addItem(new FuneralBucket());
        }
        else if (bucket == BucketType.WEDDINGBUCKET){
            order.addItem(new WeddingBucket());
        }
        return order;
    }
}

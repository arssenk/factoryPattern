package observer;


import bucket.FlowerBucket;
import item_decorators.BasketDecorator;
import parent.Flower;

/**
 * Created by arsen on 21.11.16.
 */
public interface Observer{
    void update(FlowerBucket bucket);
}

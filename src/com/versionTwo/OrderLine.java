package com.versionTwo;

/*
 * represents an order line which contains the @link Item and the quantity.
 *
 */
public class OrderLine {

    private int quantity;
    private Item item;

    /*
     * @param item Item of the order
     *
     * @param quantity Quantity of the item
     */
    public OrderLine(Item item, int quantity) throws Exception {
        if (item == null) {
            System.err.println("ERROR - Item is NULL");
            throw new Exception("Item is NULL");
        }
        if (quantity < 0) {
            System.err.println("ERROR - quantity is negative");
            throw new Exception("Quantity is negative");
        }
        assert quantity > 0;
        //this keyword was missing
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}

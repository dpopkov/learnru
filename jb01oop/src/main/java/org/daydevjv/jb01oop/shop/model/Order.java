package org.daydevjv.jb01oop.shop.model;

import java.time.LocalDateTime;

public class Order {
    private Seller seller;
    private Customer buyer;
    private LocalDateTime time;
    private OrderDetails details;
    private CashMachine cashMachine;
}

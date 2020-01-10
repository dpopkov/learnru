package org.daydevjv.jb01oop.shop;

import org.daydevjv.jb01oop.shop.client.BaseVisitor;
import org.daydevjv.jb01oop.shop.departments.BaseDepartment;
import org.daydevjv.jb01oop.shop.service.Administrator;

import java.util.List;

public class SalesRoom extends Room {
    private Administrator administrator;
    private List<BaseDepartment> departments;
    private List<BaseVisitor> visitors;
}

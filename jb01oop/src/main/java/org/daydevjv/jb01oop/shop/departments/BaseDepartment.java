package org.daydevjv.jb01oop.shop.departments;

import org.daydevjv.jb01oop.shop.goods.BaseGoods;
import org.daydevjv.jb01oop.shop.service.Consultant;

import java.util.List;

public abstract class BaseDepartment {
    private List<BaseGoods> goods;
    private List<Consultant> consultants;
}

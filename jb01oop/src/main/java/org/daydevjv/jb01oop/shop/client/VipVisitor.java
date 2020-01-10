package org.daydevjv.jb01oop.shop.client;

public class VipVisitor extends BaseVisitor {
    private float discount;

    @Override
    public void buy() {
        if (!checkDiscount()) {
            super.buy();
        } else {
            // use discount
        }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }
}

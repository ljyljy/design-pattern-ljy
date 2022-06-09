package com.ljy.ood.factory.method;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:25
 * Description:
 */
public class DesktopFactory extends ComputerFactory {
    @Override
    public Calcalation create() {
        return new DesktopComputer();
    }
}

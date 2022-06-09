package com.ljy.ood.factory.method;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:28
 * Description:
 */
public class DellFactory extends ComputerFactory {
    @Override
    public Calcalation create() {
        return new DellComputer();
    }
}

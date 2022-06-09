package com.ljy.ood.factory.abstractfactory;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:40
 * Description:
 */
public class Computer {
    public static void main(String[] args) {
        DellComputerFactory factory = new DellComputerFactory();
        factory.makeCpu().makeCpu();
        factory.makeHarddisk().makeHarddisk();
        factory.makeMemory().makeMemory();
    }
}

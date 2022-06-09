package com.ljy.ood.factory.abstractfactory;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:37
 * Description:
 */
public class DellComputerHarddisk implements Harddisk {
    @Override
    public void makeHarddisk() {
        System.out.println("制作戴尔的硬盘");
    }
}

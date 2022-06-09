package com.ljy.ood.factory.abstractfactory;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:38
 * Description:
 */
public class DelllComputerMemory implements Memory {
    @Override
    public void makeMemory() {
        System.out.println("制作dell的内存");
    }
}

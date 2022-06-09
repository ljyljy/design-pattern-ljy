package com.ljy.ood.factory.abstractfactory;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:39
 * Description:
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Cpu makeCpu() {
        return new DellComputerCpu();

    }

    @Override
    public Memory makeMemory() {
        return new DelllComputerMemory();
    }

    @Override
    public Harddisk makeHarddisk() {
        return new DellComputerHarddisk();
    }
}

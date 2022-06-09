package com.ljy.ood.factory.abstractfactory;

public interface ComputerFactory {
    Cpu makeCpu();
    Memory makeMemory();
    Harddisk makeHarddisk();
}

package com.ljy.ood.factory.simple;

import org.apache.commons.lang3.StringUtils;

/**
 * Author:   mkp
 * Date:     2021/1/6 20:16
 * Description:
 */
public class ComputerFactory {

    public Calcalation create(String computerName){
        if(StringUtils.isBlank(computerName)){
            return  null;
        }
        if(computerName.equalsIgnoreCase("DELL")){
            return new DellComputer();
        }else if(computerName.equalsIgnoreCase("XM")){
            return new XmComputer();
        }
        return null;
    }

}

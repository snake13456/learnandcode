package com.weapon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author weapon
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeaponGagewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeaponGagewayApplication.class,args);
        System.out.println("weapon 网关系统启动成功");
    }

}

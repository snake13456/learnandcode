package com.weapon.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author weapon
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeaponWxApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeaponWxApplication.class,args);
        System.out.println("weapon 微信模块启动成功");
    }
}

/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code17;

public class ChainPrint {
    public ChainPrint out(Object obj) {
        System.out.println(obj.toString());
        return this;
    }

    public ChainPrint title(Object obj) {
        return out("\033[1;32m**[ " + obj.toString() + " ]**\u001B[0m");
    }
}

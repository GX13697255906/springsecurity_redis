package com.gx.util;

import java.util.UUID;

public class UtilId {

    /**
     * 获取uuid
     * @return
     */
    public static String UUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-","");
        return uuid;
    }

}

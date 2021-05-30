package com.ssm.yun.server.impl;

import com.ssm.yun.server.ServiceAPI;

public class ServiceAPImpl implements ServiceAPI {
    @Override
    public String getTheMessage() {
        return "我这里是提供方-你调用到了吗(没添加我的依赖坐标)";
    }
}

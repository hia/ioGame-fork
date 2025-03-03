/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2023 double joker （262610965@qq.com） . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iohao.game.bolt.broker.server.processor;

import com.alipay.remoting.AsyncContext;
import com.alipay.remoting.BizContext;
import com.iohao.game.bolt.broker.core.common.AbstractAsyncUserProcessor;
import com.iohao.game.bolt.broker.core.message.BrokerClientItemConnectMessage;
import com.iohao.game.common.kit.log.IoGameLoggerFactory;
import lombok.Setter;
import org.slf4j.Logger;

/**
 * BrokerClientItemConnect 首次连接到游戏网关
 *
 * @author 渔民小镇
 * @date 2022-05-16
 */
@Setter
public class BrokerClientItemConnectMessageBrokerProcessor extends AbstractAsyncUserProcessor<BrokerClientItemConnectMessage> {

    static final Logger log = IoGameLoggerFactory.getLoggerConnection();

    @Override
    public void handleRequest(BizContext bizCtx, AsyncContext asyncCtx, BrokerClientItemConnectMessage request) {
        log.debug("bizCtx.getRemoteAddress() : {}", bizCtx.getRemoteAddress());
    }

    /**
     * 指定感兴趣的请求数据类型，该 UserProcessor 只对感兴趣的请求类型的数据进行处理；
     * 假设 除了需要处理 MyRequest 类型的数据，还要处理 java.lang.String 类型，有两种方式：
     * 1、再提供一个 UserProcessor 实现类，其 interest() 返回 java.lang.String.class.getName()
     * 2、使用 MultiInterestUserProcessor 实现类，可以为一个 UserProcessor 指定 List<String> multiInterest()
     *
     * @return 自定义处理器
     */
    @Override
    public String interest() {
        return BrokerClientItemConnectMessage.class.getName();
    }
}

/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2023 double joker （262610965@qq.com） . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License..
 */
package com.iohao.game.action.skeleton.core.flow;

/**
 * ActionAfter 最后的处理，通常用于将数据发送给请求端
 *
 * @author 渔民小镇
 * @date 2021-12-12
 */
public interface ActionAfter {
    /**
     * 最后执行的方法, 一般将发送到客户端的逻辑存放到这里
     * <pre>
     * netty
     *     channelContext.writeAndFlush(msg);
     * </pre>
     *
     * @param flowContext flow 上下文
     */
    void execute(FlowContext flowContext);
}

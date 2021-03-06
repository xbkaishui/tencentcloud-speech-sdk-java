/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencent.asr.service;

import okhttp3.*;

public class WsClientService {


    public static WebSocket asrWebSocket(String wsUrl,String sign, WebSocketListener listener) {
        Headers headers = new Headers.Builder().add("Authorization", sign)
                .add("Host","asr.cloud.tencent.com").build();
        Request request = new Request.Builder().url(wsUrl).headers(headers).build();
        OkHttpClient client = new OkHttpClient.Builder().build();
        WebSocket webSocket = client.newWebSocket(request, listener);
        return webSocket;
    }
}

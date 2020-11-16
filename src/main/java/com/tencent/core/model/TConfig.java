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
package com.tencent.core.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TConfig {

    /**
     * 用户在腾讯云注册账号 AppId 对应的 SecretId，可以进入 API 密钥管理页面 获取。
     */
    public String secretId;

    /**
     * secretKey
     */
    public String secretKey;

    /**
     * 用户在腾讯云注册账号的 AppId，可以进入 API 密钥管理页面 获取。
     */
    public Long appId;

    /**
     * token
     */
    public String token;
}

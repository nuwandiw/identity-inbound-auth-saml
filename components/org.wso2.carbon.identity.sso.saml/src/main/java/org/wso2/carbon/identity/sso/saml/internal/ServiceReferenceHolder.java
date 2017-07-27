/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.sso.saml.internal;

import org.wso2.carbon.identity.core.KeyProviderService;
import org.wso2.carbon.identity.sso.saml.util.SAMLSSOUtil;

/**
 * Holds OSGi service references for utility classes.
 */
public class ServiceReferenceHolder {
    private static KeyProviderService keyProvider;

    public static KeyProviderService getKeyProvider() {
        return keyProvider;
    }

    public static void setKeyProvider(KeyProviderService keyProvider) {
        ServiceReferenceHolder.keyProvider = keyProvider;
    }
}
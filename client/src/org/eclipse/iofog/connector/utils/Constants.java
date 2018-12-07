/*
 * *******************************************************************************
 *  * Copyright (c) 2018 Edgeworx, Inc.
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Eclipse Public License v. 2.0 which is available at
 *  * http://www.eclipse.org/legal/epl-2.0
 *  *
 *  * SPDX-License-Identifier: EPL-2.0
 *  *******************************************************************************
 *
 */

package org.eclipse.iofog.connector.utils;

/**
 * Created by saeid on 6/27/16.
 */
public class Constants {

    static final String SETTINGS_FILENAME = "/etc/iofog-connector/iofog-connector.conf";
    static final String CERTITICATE_FILENAME = "/etc/iofog-connector/server-cert.pem";
    static final String KEY_FILENAME = "/etc/iofog-connector/server-key.pem";
    static final String LOG_FILENAME = "/var/log/iofog-connector/iofog-connector-client.log";
    static final String VERSION = "1.0.2";
    static final String API_COMMAND_LINE = "/api/v2/commandline";

    public static final int HTTPS_PORT = 443;
    public static final int HTTP_PORT = 8080;

    public static final String HTTP = "http";
    public static final String HTTPS = "https";
}

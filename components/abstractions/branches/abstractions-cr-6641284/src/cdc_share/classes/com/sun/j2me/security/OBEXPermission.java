/*
 * Copyright  1990-2007 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation. 
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt). 
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA 
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions.
 */

package com.sun.j2me.security;

import com.sun.j2me.proxy.security.Permissions;

/**
 * OBEX access permissions.
 */
public class OBEXPermission extends Permission {

    static String STR_OBEX_CLIENT = "javax.microedition.io.Connector.obex.client";
    static String STR_OBEX_SERVER = "javax.microedition.io.Connector.obex.server";
    static String STR_TCP_OBEX_CLIENT = "javax.microedition.io.Connector.obex.client.tcp";
    static String STR_TCP_OBEX_SERVER = "javax.microedition.io.Connector.obex.server.tcp";

    static public OBEXPermission OBEX_CLIENT = new OBEXPermission(
        Permissions.getName(Permissions.OBEX_CLIENT), null);

    static public OBEXPermission OBEX_SERVER = new OBEXPermission(
        Permissions.getName(Permissions.OBEX_SERVER), null);

    static public OBEXPermission TCP_OBEX_CLIENT = new OBEXPermission(
        Permissions.getName(Permissions.TCP_OBEX_CLIENT), null);

    static public OBEXPermission TCP_OBEX_SERVER = new OBEXPermission(
        Permissions.getName(Permissions.TCP_OBEX_SERVER), null);

    public OBEXPermission(String name, String resource) {
        super(name, resource);
    }
}

/*
 *
 *
 * Copyright  1990-2006 Sun Microsystems, Inc. All Rights Reserved.
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
 * PIM access permissions.
 */
public class PIMPermission extends Permission {
    
    static public PIMPermission CONTACT_READ  = new PIMPermission(
        Permissions.getName(Permissions.PIM_CONTACT_READ), null);

    static public PIMPermission CONTACT_WRITE = new PIMPermission(
        Permissions.getName(Permissions.PIM_CONTACT_WRITE), null);

    static public PIMPermission EVENT_READ = new PIMPermission(
        Permissions.getName(Permissions.PIM_EVENT_READ), null);

    static public PIMPermission EVENT_WRITE = new PIMPermission(
        Permissions.getName(Permissions.PIM_EVENT_WRITE), null);

    static public PIMPermission TODO_READ = new PIMPermission(
        Permissions.getName(Permissions.PIM_TODO_READ), null);

    static public PIMPermission TODO_WRITE = new PIMPermission(
        Permissions.getName(Permissions.PIM_TODO_WRITE), null);
    
    public PIMPermission(String name, String resource) {
        super(name, resource);
    }
}
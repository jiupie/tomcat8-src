/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.tomcat.util.descriptor.web;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link ServletDef}
 */
public class TestServletDef {

    @Test(expected = IllegalArgumentException.class)
    public void testSetServletNameNull() {
        new ServletDef().setServletName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetServletNameEmptyString() {
        new ServletDef().setServletName("");
    }

    @Test
    public void testSetServletName() {
        ServletDef servletDef = new ServletDef();
        servletDef.setServletName("test");
        Assert.assertEquals("'test' is expected as servlet name",
            "test", servletDef.getServletName());
    }

}
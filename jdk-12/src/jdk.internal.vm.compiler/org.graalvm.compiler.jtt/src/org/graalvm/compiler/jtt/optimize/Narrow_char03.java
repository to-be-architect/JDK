/*
 * Copyright (c) 2009, 2018, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


package org.graalvm.compiler.jtt.optimize;

import org.junit.Test;

import org.graalvm.compiler.jtt.JTTTest;

/*
 */
public class Narrow_char03 extends JTTTest {

    static char[] val = new char[4];

    public static char test(char b) {
        val[0] = b;
        return val[0];
    }

    @Test
    public void run0() throws Throwable {
        runTest("test", ((char) 0));
    }

    @Test
    public void run1() throws Throwable {
        runTest("test", ((char) 1));
    }

    @Test
    public void run2() throws Throwable {
        runTest("test", ((char) 255));
    }

    @Test
    public void run3() throws Throwable {
        runTest("test", ((char) 65000));
    }

}

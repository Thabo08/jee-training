/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/tutorial-examples/LICENSE.txt
 */
package javaeetutorial.simplegreeting;

import javax.enterprise.context.Dependent;

@Dependent
public class Greeting {
    public String greet(String name) {
        return "Hello, " + name + ".";
    }
}

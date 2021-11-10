package com.jdc.meta;

import java.lang.annotation.*;

@Documented
public @interface Info {
	String owner();
	String group();
}
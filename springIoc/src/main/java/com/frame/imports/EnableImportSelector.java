package com.frame.imports;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Import(MyImportSelector.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableImportSelector {
}

package org.graviton.bazar.api;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@BindingAnnotation
public @interface DatabaseProperties {
}

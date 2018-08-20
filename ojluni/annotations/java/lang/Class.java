/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1994, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package java.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.io.InputStream;
import java.util.HashMap;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Class<T> implements java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.reflect.AnnotatedElement {

Class() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.String toString() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.String toGenericString() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public static java.lang.Class<?> forName(@libcore.util.NonNull java.lang.String className) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public static java.lang.Class<?> forName(@libcore.util.NonNull java.lang.String name, boolean initialize, @libcore.util.Nullable java.lang.ClassLoader loader) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public native T newInstance() throws java.lang.IllegalAccessException, java.lang.InstantiationException;

public boolean isInstance(@libcore.util.Nullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

public boolean isAssignableFrom(@libcore.util.NonNull java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }

public boolean isInterface() { throw new RuntimeException("Stub!"); }

public boolean isArray() { throw new RuntimeException("Stub!"); }

public boolean isPrimitive() { throw new RuntimeException("Stub!"); }

public boolean isAnnotation() { throw new RuntimeException("Stub!"); }

public boolean isSynthetic() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.String getName() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public synchronized java.lang.reflect.TypeVariable<java.lang.Class<T>>[] getTypeParameters() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.Class<? super T> getSuperclass() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.reflect.Type getGenericSuperclass() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.Package getPackage() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.Class<?>[] getInterfaces() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Type[] getGenericInterfaces() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.Class<?> getComponentType() { throw new RuntimeException("Stub!"); }

public int getModifiers() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.Object[] getSigners() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.reflect.Method getEnclosingMethod() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.reflect.Constructor<?> getEnclosingConstructor() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public native java.lang.Class<?> getDeclaringClass();

@libcore.util.Nullable public native java.lang.Class<?> getEnclosingClass();

@libcore.util.NonNull public java.lang.String getSimpleName() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.String getTypeName() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.lang.String getCanonicalName() { throw new RuntimeException("Stub!"); }

public native boolean isAnonymousClass();

public boolean isLocalClass() { throw new RuntimeException("Stub!"); }

public boolean isMemberClass() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.Class<?>[] getClasses() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Field[] getFields() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Method[] getMethods() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Constructor<?>[] getConstructors() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Field getField(@libcore.util.NonNull java.lang.String name) throws java.lang.NoSuchFieldException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Method getMethod(@libcore.util.NonNull java.lang.String name, @libcore.util.NonNull java.lang.Class<?>... parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Constructor<T> getConstructor(@libcore.util.NonNull java.lang.Class<?>... parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public native java.lang.Class<?>[] getDeclaredClasses();

@libcore.util.NonNull public native java.lang.reflect.Field[] getDeclaredFields();

@libcore.util.NonNull public java.lang.reflect.Method[] getDeclaredMethods() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Constructor<?>[] getDeclaredConstructors() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public native java.lang.reflect.Field getDeclaredField(@libcore.util.NonNull java.lang.String name) throws java.lang.NoSuchFieldException;

@libcore.util.NonNull public java.lang.reflect.Method getDeclaredMethod(@libcore.util.NonNull java.lang.String name, @libcore.util.NonNull java.lang.Class<?>... parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.reflect.Constructor<T> getDeclaredConstructor(@libcore.util.NonNull java.lang.Class<?>... parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public java.io.InputStream getResourceAsStream(@libcore.util.NonNull java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.net.URL getResource(@libcore.util.NonNull java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.security.ProtectionDomain getProtectionDomain() { throw new RuntimeException("Stub!"); }

public boolean desiredAssertionStatus() { throw new RuntimeException("Stub!"); }

public boolean isEnum() { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public T[] getEnumConstants() { throw new RuntimeException("Stub!"); }

@libcore.util.Nullable public T cast(@libcore.util.Nullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

public <U> java.lang.Class<? extends U> asSubclass(@libcore.util.NonNull java.lang.Class<U> clazz) { throw new RuntimeException("Stub!"); }

public <A extends java.lang.annotation.Annotation> A getAnnotation(@libcore.util.NonNull java.lang.Class<A> annotationClass) { throw new RuntimeException("Stub!"); }

public boolean isAnnotationPresent(@libcore.util.NonNull java.lang.Class<? extends java.lang.annotation.Annotation> annotationClass) { throw new RuntimeException("Stub!"); }

public <A extends java.lang.annotation.Annotation> A[] getAnnotationsByType(@libcore.util.NonNull java.lang.Class<A> annotationClass) { throw new RuntimeException("Stub!"); }

@libcore.util.NonNull public java.lang.annotation.Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); }

public native <A extends java.lang.annotation.Annotation> A getDeclaredAnnotation(@libcore.util.NonNull java.lang.Class<A> annotationClass);

@libcore.util.NonNull public native java.lang.annotation.Annotation[] getDeclaredAnnotations();
}


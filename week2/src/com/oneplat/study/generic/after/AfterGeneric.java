package com.oneplat.study.generic.after;

import java.io.Serializable;

/**
 * 참고 https://onsil-thegreenhouse.github.io/programming/java/2018/02/17/java_tutorial_1-21/
 * @param <T>
 */
public class AfterGeneric<T> implements Serializable {

    private T object;

    public void setValue(T t) { this.object = t; }

    public T getValue() { return object; }
}

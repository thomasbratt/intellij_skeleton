package com.github.thomasbratt;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

// The purpose of this type is to
public final class Test1 {

    @Test
    public void shouldDoSomethingSpecific() throws Exception {
        final String actual = "a value";
        final String expected = "a value";
        assertThat(actual, is(expected));
    }

}

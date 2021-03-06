package com.spotify.heroic.aggregation.simple;

import org.junit.Test;

import static com.spotify.heroic.test.LombokDataTest.verifyClassBuilder;

public class BelowKTest {
    @Test
    public void lombokDataTest() {
        verifyClassBuilder(BelowK.class)
            .ignoreGetter("of")
            .valueSupplier(new OfSupplier())
            .verify();
    }
}

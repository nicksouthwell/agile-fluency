package com.nick.af.adapter.web;

import com.nick.af.domain.Feature;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FeatureViewTransformationTest {
    @Test
    public void featureShouldBeTransformedToView() {
        Feature feature = new Feature("ABC", "Hello", 42);

        FeatureView view = FeatureView.from(feature);

        assertThat(view)
                .isEqualTo(new FeatureView("ABC", "$42 Feature", "Hello"));
    }
}
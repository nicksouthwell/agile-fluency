package com.nick.af.adapter.web;

import com.nick.af.game.domain.Feature;
import com.nick.af.game.adapter.in.web.FeatureView;
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
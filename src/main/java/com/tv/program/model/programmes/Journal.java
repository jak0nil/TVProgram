package com.tv.program.model.programmes;

import java.util.Collections;

public class Journal extends Emission {
    Journal() {
        super(Collections.emptyList());
    }

    @Override
    String creditsToString() {
        return EMPTY_CREDITS;
    }
}

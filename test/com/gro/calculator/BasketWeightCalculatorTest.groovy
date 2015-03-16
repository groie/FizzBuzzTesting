package com.gro.calculator

import spock.lang.Specification

/**
 * Created by gro on 16/03/15.
 */
class BasketWeightCalculatorTest extends Specification {
    def "adds one item"() {
        given:
        def calculator = new BasketWeightCalculator()

        when: "add one item only"
        calculator.addItem(123)

        then: "expect weight to be 123"
        calculator.getTotalWeight() == 123
    }

    def "add two items"() {
        given:
        def calculator = new BasketWeightCalculator()

        when: "add two items in the basket"
        calculator.addItem(52)
        calculator.addItem(13)

        then: "expect the sum of both items"
        calculator.getTotalWeight() == 65
    }


    def "two calculators order of adding items does not matter"() {
        given:
        def calculator1 = new BasketWeightCalculator()
        def calculator2 = new BasketWeightCalculator()

        when: "add same items but with different order"
        calculator1.addItem(5)
        calculator1.addItem(13)

        calculator2.addItem(13)
        calculator2.addItem(5)

        then: "expect both baskets to weigh the same"
        calculator1.getTotalWeight() == 18
        calculator2.getTotalWeight() == 18
    }

}

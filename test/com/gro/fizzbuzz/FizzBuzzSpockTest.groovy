package com.gro.fizzbuzz

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by gro on 16/03/15.
 */
class FizzBuzzSpockTest extends Specification {


    @Shared FizzBuzz fizzBuzz = new FizzBuzzImpl()

    @Unroll("Fizzify buzzifies #source to #expected")
    def "Fizzify fizzifies correctly"() {
        expect:
        fizzBuzz.fizzify(source) == expected

        where:
        source | expected
        1      | "1"
        2      | "2"
        3      | "Fizz"
        4      | "4"
        5      | "Buzz"
        15     | "FizzBuzz"
    }
}

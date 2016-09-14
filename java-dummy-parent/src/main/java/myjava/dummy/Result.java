package myjava.dummy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

    private final int value;

    @JsonCreator
    public Result(@JsonProperty("value") int _value) {
        this.value = _value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Result result = (Result) o;
        return value == result.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Result{value=" + value + '}';
    }
}

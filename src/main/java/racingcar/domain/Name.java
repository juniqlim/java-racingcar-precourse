package racingcar.domain;

public class Name {
    private final String name;

    private Name(String name) {
        this.name = name;
    }

    public static Name of(String name) {
        if (name.length() > 5) {
            throw new NameLengthException("자동차 이름은 5자 이하여야 합니다.");
        }
        return new Name(name);
    }

    public String value() {
        return name;
    }
}

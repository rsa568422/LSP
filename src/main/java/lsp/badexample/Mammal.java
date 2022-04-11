package lsp.badexample;

import lombok.Getter;

@Getter
public class Mammal {

    private Integer weight;

    private Integer ageInDays;

    public void walk() {
        System.out.println("I am walking");
    }

}

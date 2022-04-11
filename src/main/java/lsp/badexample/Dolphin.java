package lsp.badexample;

public class Dolphin extends Mammal {

    @Override
    public void walk() {
        throw new CanNotWalkException("I am a dolphin, I can not walk!");
    }

}

// Subclasse Cachorro
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}
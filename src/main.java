public class main {
    static void main(String[] args) {

        TanqueAgua tanqueAgua1 = new TanqueAgua(
                100,
                60
        );

        tanqueAgua1.consumir(45);
        tanqueAgua1.consumir(10);
        tanqueAgua1.llenar(70);
        tanqueAgua1.llenar(30);
        tanqueAgua1.llenar(25);
        tanqueAgua1.consumir(90);
        tanqueAgua1.consumir(15);
    }
}

public static void main(String[] args) {
        ParaUporzadkowana<String, Integer> para1 = new ParaUporzadkowana<>("wiek", 25);

        System.out.println("Klucz: " + para1.getKlucz());
        System.out.println("Wartość: " + para1.getWartosc());
}
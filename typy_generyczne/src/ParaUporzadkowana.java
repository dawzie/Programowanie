class ParaUporzadkowana<K, V> {
    private K klucz;
    private V wartosc;

    public ParaUporzadkowana(K klucz, V wartosc) {
        this.klucz = klucz;
        this.wartosc = wartosc;
    }

    public K getKlucz() {
        return klucz;
    }

    public V getWartosc() {
        return wartosc;
    }

}
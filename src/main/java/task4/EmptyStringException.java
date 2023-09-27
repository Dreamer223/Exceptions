package task4;

class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Пустые строки вводить нельзя.");
    }
}

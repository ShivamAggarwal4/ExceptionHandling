class ScoreException extends Exception {
    public String toString() {
        return "This is toString";
    }

    public String getMessage() {
        return "The score must be >= 0 and <= 100!.";
    }
}

class NegativeNumberSquareException extends Exception{
    public String toString(){
        return "This is Negative Number Square Exception";
    }
    public String getMessage(){
        return "This is Negative Number Square Exception";
    }
}
public class Douboolean {
    boolean firstBoolean;
    boolean secondBoolean;
    public Douboolean(boolean bool1, boolean bool2){
        firstBoolean = bool1;
        secondBoolean = bool2;
    }
    public boolean getValue() {
        if (firstBoolean) {
            return firstBoolean;
        } else {
            return secondBoolean;
        }
    }
    public boolean isFirstBoolean() {
        return firstBoolean;
    }

    public void setFirstBoolean(boolean firstBoolean) {
        this.firstBoolean = firstBoolean;
    }

    public boolean isSecondBoolean() {
        return secondBoolean;
    }

    public void setSecondBoolean(boolean secondBoolean) {
        this.secondBoolean = secondBoolean;
    }
}

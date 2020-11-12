import java.nio.charset.StandardCharsets;
import java.util.*;

class AsciiCharSequence implements CharSequence {
    @Override
    public int length() {
        return this.string.length();
    }

    @Override
    public char charAt(int i) {
        return this.string.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {

        return this.string.substring(i, i1);
    }

    @Override
    public String toString(){
        return this.string;
    }

    private String string;

    AsciiCharSequence(byte[] array) {
        this.string = new String(array, StandardCharsets.UTF_8);
    }
}
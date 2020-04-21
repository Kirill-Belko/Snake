import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    byte[] bArr;

    AsciiCharSequence(byte[] arr) {
        this.bArr = arr;
    }

    @Override
    public int length() {
        return bArr.length;
    }

    @Override
    public char charAt(int i) {
        return (char)bArr[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.bArr, i, i1));
    }

    @Override
    public String toString() {
        char[] chArr = new char[this.bArr.length];
        for(int i=0; i<this.bArr.length; i++) {
            chArr[i] = (char)this.bArr[i];
        }

        return String.valueOf(chArr);
    }
}
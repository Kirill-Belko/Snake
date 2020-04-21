import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] res = new int[a1.length + a2.length];
        int i=0, j=0, k=0;
        while(i<a1.length && j < a2.length) {
            if(a1[i] < a2[j]) {
                res[k++] = a1[i++];
            }
            else {
                res[k++] = a2[j++];
            }
        }

        while(i < a1.length) {
            res[k++] = a1[i++];
        }

        while(j < a2.length) {
            res[k++] = a2[j++];
        }

        return res;
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        Reader reader = new InputStreamReader(inputStream, charset);
        char[] chArr = new char[100];
        int len = reader.read(chArr);

        char[] chArr2 = new char[1];
        if(len != -1) {
            chArr2 = new char[len];
            for(int i=0; i < len; i++) {
                chArr2[i] = chArr[i];
            }
        }
        return String.valueOf(chArr2).trim();
    }

    public static void main(String[] args) throws IOException {
       /* Scanner sc = new Scanner(System.in);
        char[] originalAlphabet = sc.nextLine().toCharArray();
        char[] resultAlphabet = sc.nextLine().toCharArray();
        char[] strToEncode = sc.nextLine().toCharArray();
        char[] strToDecode = sc.nextLine().toCharArray();

        for(int i=0; i< strToEncode.length; i++){
            for(int j = 0; j < originalAlphabet.length; j++) {
                if(originalAlphabet[j] == strToEncode[i]) {
                    strToEncode[i] = resultAlphabet[j];
                    break;
                }
            }
        }

        String encodedStr = String.valueOf(strToEncode);

        for(int i=0; i< strToDecode.length; i++){
            for(int j = 0; j < resultAlphabet.length; j++) {
                if(resultAlphabet[j] == strToDecode[i]) {
                    strToDecode[i] = originalAlphabet[j];
                    break;
                }
            }
        }

        String decodedStr = String.valueOf(strToDecode);

        System.out.println(encodedStr);
        System.out.println(decodedStr);*/

//       int[] a1 = new int[]{6};
//       int[] a2 = new int[]{1, 3, 5};
//       int[] a3 = mergeArrays(a1, a2);
//       for(int i=0; i<a3.length; i++)
//           System.out.print(a3[i] + " ");


//        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
//        System.out.println(readAsString(inByte, Charset.forName("UTF-8")));

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println(answer.toString());
    }
}

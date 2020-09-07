package FeasibilityStudy;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileController {
    public static void main(String[] args) {
        String fileName = "testDoc.csv";
        String data = "Hello You! from inside the file.";
        // ファイル入出力処理を呼び出してみる
        boolean result = writeInFile(fileName, data);
        System.out.println("file input result: " + result);
    }

    /**
     * ファイル書き込み処理
     * 文字列を受け取って、指定されたファイルの最後尾に書き込みを行う処理
     */
    public static boolean writeInFile(String fileName, String data) {
        boolean isSucsess = false;
        // ファイル書き込み処理
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(data);
            bw.newLine();
            bw.flush();
            isSucsess = true;
        } catch(Exception e){
            e.printStackTrace();
        }

        return isSucsess;
    }
}
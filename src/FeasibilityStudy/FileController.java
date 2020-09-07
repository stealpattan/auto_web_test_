package FeasibilityStudy;

import java.io.*;

public class FileController {
    public static void main(String[] args) {
        String fileName = "testDoc.csv";
        String data = "Hello You! from inside the file.";
        // ファイル入出力処理を呼び出してみる
        boolean result = writeInFile(fileName, data);
        System.out.println("file input result: " + result);

        // ファイル読み込み処理を呼び出してみる
        readFile(fileName);
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
            // ファイルアクセス終了
            bw.close();
            // 書き込み成功フラグを立てる
            isSucsess = true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return isSucsess;
    }

    /**
     * ファイル読み込み処理をする
     * ファイル名を指定して、全行読み込んでコンソール出力
     * */
    public static void readFile(String fileName){
        // 読み込み処理
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String out;
            while((out = br.readLine()) != null){
                System.out.println(out);
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
package a_IO;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {

        FileOutputStream  fos = null;
        Writer osw = null;
        BufferedWriter bw = null;

        try {
            System.out.println(System.getProperty("file.encoding"));
            fos = new FileOutputStream("g:/chenxuan/test.txt");
            osw = new OutputStreamWriter(fos,"UTF-8");
//            String s = "hello writer,字符输出流";
//            osw.write(s);
            bw = new BufferedWriter(osw);
            bw.write("第一行内容");
            bw.newLine();
            bw.write("第二行内容");
            bw.newLine();
            bw.write("第三行内容");
            bw.flush();

        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                osw.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

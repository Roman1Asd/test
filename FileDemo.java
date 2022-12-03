package a_IO;

import java.io.File;
import java.io.IOException;

public class FileDemo {
//    public void create(File file){
//        if (!file.exists()){
//            try {
//                file.createNewFile();
//                System.out.println("文件已常见");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public void create(File file){
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件已常件");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

//    public void showFileInfo(File file){
//        if (file.exists()){
//            if (file.isFile()){
//                System.out.println("文件名称："+file.getName());
//                System.out.println("文件相对路径："+file.getPath());
//                System.out.println("文件绝对路径："+file.getAbsolutePath());
//                System.out.println("文件大小为"+file.length()+"个字节");
//            }
//        }else {
//            System.out.println("文件不存在！");
//        }
//    }

    public void showFileInfo(File file){
        if (file.exists()){
            if (file.isFile()){
                System.out.println("文件名："+file.getName());
                System.out.println("文件相对路径："+file.getPath());
                System.out.println("文件绝对路径："+file.getAbsolutePath());
                System.out.println("文件大小为"+file.length()+"字节");
            }
        }else {
            System.out.println("文件不存在！");
        }
    }

//    public void delete(File file){
//        if (file.exists()){
//            file.delete();
//            System.out.println("文件已删除");
//        }
//    }

    public void delete(File file){
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除！");
        }
    }


//    public static void main(String[] args) {
//        FileDemo fileDemo = new FileDemo();
//        File file = new File("d/chenxuan/test.txt");
//        File file = new File("g:/chenxuan/test.txt");
//        fileDemo.create(file);
//        fileDemo.showFileInfo(file);
//        fileDemo.delete(file);
//    }

    public static void main(String[] args) {
        FileDemo fileDemo = new FileDemo();
        File file = new File("g:/chenxuan/test.txt");
        fileDemo.create(file);
        fileDemo.showFileInfo(file);
        fileDemo.delete(file);
        System.out.println(file.getName()+"已删除！");

    }
}

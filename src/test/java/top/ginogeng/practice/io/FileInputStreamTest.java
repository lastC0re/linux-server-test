package top.ginogeng.practice.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @ClassName FileInputStreamTest
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/15 0015 16:41
 * @Version V1.0
 **/
public class FileInputStreamTest {

//    public static void main(String[] args) {
//        File file1 = new File("f:/java/test1.txt");
//        File file2 = new File("f:/java/test2.txt");
//        FileInputStream fileInputStream = null;
//        FileOutputStream outputStream = null;
//        try {
//            fileInputStream = new FileInputStream(file1);
//            outputStream = new FileOutputStream(file2);
//            byte[] bytes = new byte[6];
//            int read = fileInputStream.read(bytes);
//            outputStream.write(bytes);
//            System.out.println(read);
//            System.out.println(bytes.length);
//            System.out.println(new String(bytes, 0, read));
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileInputStream != null) {
//                    fileInputStream.close();
//                }
//            } catch(Exception e) {
//                e.printStackTrace();
//            }
//            try {
//                if (outputStream != null) {
//                    outputStream.close();
//                }
//            } catch(Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void main(String[] args) {
        try {
            File file1 = new File("f:/java/test1.txt");
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("f:/java/ziptest.zip"));
            zipOutputStream.putNextEntry(new ZipEntry(file1.getName()));
            FileInputStream fileInputStream = new FileInputStream(file1);
            BufferedInputStream bis = new BufferedInputStream(fileInputStream);
            int len;
            byte[] buf = new byte[1024];
            while ((len = bis.read(buf, 0, 1024)) != -1) {
                zipOutputStream.write(buf, 0, len);
            }
            bis.close();
            fileInputStream.close();
            zipOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

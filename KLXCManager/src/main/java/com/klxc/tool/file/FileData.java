package com.klxc.tool.file;

import com.klxc.tool.sms.SMS;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class FileData {
    private static final boolean isTest = true;
    private static final String path_nw = "F:/images/";
    private static final String path_zs = "D:/Apache/images/";

    private static final String path = isTest ? path_nw : path_zs;
    public static final String image_host = "http://192.168.1.101:89/images/";
    public static final String defUrl = image_host + "default.png";

    public static String getImageName(int userId) {
        return userId + "_" + SMS.getRandom() + ".png";
    }

    public static String getImageUrl(String fileName) {
        return image_host + fileName;
    }

    private static String getImagePath(String fileName) {
        return path + fileName;
    }

    public static void saveImage(String fileName, InputStream input)
            throws IOException {
        BufferedImage bi = ImageIO.read(input);
        String path = getImagePath(fileName);
        File f = new File(path);
        ImageIO.write(bi, "JPG", f);
    }

    // public void write(String fileName, InputStream input) throws IOException {
    //     File file = new File(getImagePath(fileName));
    //     try {
    //         //使用common io的文件写入操作
    //         FileUtilcopyInputStreamToFile(input, file);
    //         //原来自己的文件写入操作
    //         //saveFile(fileInputStream, file);
    //     } catch (IOException ex) {
    //         Logger.getLogger(UploadImageResource.class.getName()).log(Level.SEVERE, null, ex);
    //     }
    // }
}

	

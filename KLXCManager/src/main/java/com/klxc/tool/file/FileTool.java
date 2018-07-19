package com.klxc.tool.file;

import java.io.File;

import com.klxc.common.Const;
import com.klxc.tool.Md5;
import com.klxc.tool.UtilTool;
import org.springframework.web.multipart.MultipartFile;

public class FileTool {

    public static String getFileName(MultipartFile file) {
        if (file == null || file.isEmpty() || file.getSize() <= 0) {
            return "";
        }
        return Const.img_host + md5(file.getOriginalFilename());
    }

    public static boolean filesUpload(MultipartFile[] files) {
        boolean succ = true;
        // 判断file数组不能为空并且长度大于0
        if (files != null && files.length > 0) {
            // 循环获取file数组中得文件
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];

                if (file == null || file.isEmpty() || file.getSize() <= 0) {
                    continue;
                }

                // 保存文件
                saveFile(file);
            }
        }
        return succ;
    }

    public static boolean saveFile(MultipartFile file) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                String path = Const.img_path;
                File f = new File(path);
                if (!f.exists()) {
                    f.mkdirs();
                }
                // 文件保存路径
                String filePath = path + md5(file.getOriginalFilename());
                // 转存文件
                file.transferTo(new File(filePath));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static String md5(String name) {
        if (UtilTool.isNull(name)) {
            return "";
        }
        int index = name.lastIndexOf(".");
        String img = UtilTool.substring(name, index);
        String nameStr = UtilTool.substring(name, 0, index);
        return Md5.encoderMd5(nameStr) + img;
    }
}

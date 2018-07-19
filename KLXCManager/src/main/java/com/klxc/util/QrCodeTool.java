package com.klxc.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.klxc.tool.UtilTool;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class QrCodeTool {

    private static final String path = "D:/Apache/images/";

    public static final String image_host = "http://114.55.54.228:89/images/";

    public static String createQr(String text) {
        if (UtilTool.isNull(text)) {
            return "";
        }
        try {
            File outputFile = new File(getPath(text));
            if (outputFile.exists()) {
                return geUrl(text);
            }

            int width = 300;
            int height = 300;
            String format = "jpg";

            Hashtable hints = new Hashtable();
            // 内容所使用编码
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");

            BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
            MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);

//			writeToFile(outputFile, new File(getLogoPath()), format);
            return geUrl(text);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String geUrl(String fileName) {
        return image_host + fileName + ".jpg";
    }

    private static String getLogoPath() {
        return path + "launch_logo.png";
    }

    private static String getPath(String fileName) {
        return path + fileName + ".jpg";
    }

//	private static BufferedImage encodeImgLogo(File twodimensioncodeImg, File logoImg) {
//		BufferedImage twodimensioncode = null;
//		try {
//			if (!twodimensioncodeImg.isFile() || !logoImg.isFile()) {
//				System.out.println("输入非图片");
//				return null;
//			}
//			// 读取二维码图片
//			twodimensioncode = ImageIO.read(twodimensioncodeImg);
//			// 获取画笔
//			Graphics2D g = twodimensioncode.createGraphics();
//			// 读取logo图片
//			BufferedImage logo = ImageIO.read(logoImg);
//			// 设置二维码大小，太大，会覆盖二维码，此处20%
//			int logoWidth = logo.getWidth(null) > twodimensioncode.getWidth() * 2 / 10
//					? (twodimensioncode.getWidth() * 2 / 10) : logo.getWidth(null);
//			int logoHeight = logo.getHeight(null) > twodimensioncode.getHeight() * 2 / 10
//					? (twodimensioncode.getHeight() * 2 / 10) : logo.getHeight(null);
//			// 设置logo图片放置位置
//			// 中心
//			int x = (twodimensioncode.getWidth() - logoWidth) / 2;
//			int y = (twodimensioncode.getHeight() - logoHeight) / 2;
//			// 右下角，15为调整值
//			// int x = twodimensioncode.getWidth() - logoWidth-15;
//			// int y = twodimensioncode.getHeight() - logoHeight-15;
//			// 开始合并绘制图片
//			g.drawImage(logo, x, y, logoWidth, logoHeight, null);
//			g.drawRoundRect(x, y, logoWidth, logoHeight, 15, 15);
//			// logo边框大小
//			g.setStroke(new BasicStroke(2));
//			// logo边框颜色
//			g.setColor(Color.WHITE);
//			g.drawRect(x, y, logoWidth, logoHeight);
//			g.dispose();
//			logo.flush();
//			twodimensioncode.flush();
//		} catch (Exception e) {
//			System.out.println("二维码绘制logo失败");
//		}
//		return twodimensioncode;
//	}
//
//	public static void writeToFile(File twodimensioncodeImg, File logoImg, String format) {
//		BufferedImage image = encodeImgLogo(twodimensioncodeImg, logoImg);
//		try {
//			ImageIO.write(image, format, twodimensioncodeImg);
//		} catch (IOException e) {
//			System.out.println("二维码写入文件失败" + e.getMessage());
//		}
//	}

}

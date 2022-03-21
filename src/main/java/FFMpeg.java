import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.librealsense.frame;
import org.opencv.ml.SVM;
import sun.net.www.content.image.png;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

public class FFMpeg {
    public static void main(String[] args) {
        try {
            fetchPic(new File("video/test.wmv"), "video/test111.png", null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fetchPic(File originVideo, String targetPath, Integer ignoreFrame, Integer width) throws Exception {
        ignoreFrame = ignoreFrame == null ? 5 : ignoreFrame;
        width = width == null ? 640 : width;
        // 创建帧抓取器并开始抓取
        FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(originVideo);
        frameGrabber.start();
        // 截帧
        int i = 0;
        Frame frame = null;
        // long lengthInTime = frameGrabber.getLengthInTime(); // 获取视频时长, 单位微妙
        while (i < frameGrabber.getLengthInFrames()) {
            frame = frameGrabber.grabFrame();
            char pictType = frame.pictType;
            if ((i > ignoreFrame) && (frame.image != null)) {
                break;
            }
            i++;
        }
        // 创建图片并等比缩放
        String suffix = targetPath.split("/")[targetPath.split("/").length - 1].split("\\.")[1];
        if (suffix == null) {
            suffix = "jpg";
            targetPath = targetPath + ".jpg";
        }
        Java2DFrameConverter converter = new Java2DFrameConverter();
        BufferedImage frameImage = converter.getBufferedImage(frame);
        int height = (int) (((double) width / frameImage.getWidth()) * frameImage.getHeight());
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        image.getGraphics().drawImage(frameImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        try {
            ImageIO.write(image, suffix, new FileOutputStream(targetPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 结束抓取
        frameGrabber.stop();
    }
}


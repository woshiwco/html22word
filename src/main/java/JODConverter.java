import org.jodconverter.core.document.DefaultDocumentFormatRegistry;
import org.jodconverter.core.job.ConversionJobWithOptionalSourceFormatUnspecified;
import org.jodconverter.core.office.OfficeManager;
import org.jodconverter.core.office.OfficeUtils;
import org.jodconverter.local.JodConverter;
import org.jodconverter.local.office.LocalOfficeManager;

import java.io.*;

public class JODConverter {
    public static void main(String[] args) {
        jodConvert();
    }

    public static void jodConvert() {
        File inFile = new File("test/origin/hello.doc");
        File outFile = new File("test/target/hello.docx");
        // 使用默认配置创建OfficeManager管理器，默认端口为2002
        LocalOfficeManager officeManager = LocalOfficeManager.install();
        try  {
            // 启动OfficeManager服务
            officeManager.start();
            // 开始转换，不指定as格式时，自动根据文件后缀名判断
            JodConverter.convert(inFile)
                    .as(DefaultDocumentFormatRegistry.DOC)
                    .to(outFile)
                    .as(DefaultDocumentFormatRegistry.DOCX)
                    .execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭OfficeManager服务
            OfficeUtils.stopQuietly(officeManager);
        }
    }
}

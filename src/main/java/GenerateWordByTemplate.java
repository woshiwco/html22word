import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.Pictures;
import com.deepoove.poi.util.PoitlIOUtils;
import entity.ReportSection;
import fr.opensagres.poi.xwpf.converter.core.BasicURIResolver;
import fr.opensagres.poi.xwpf.converter.core.FileImageExtractor;
import fr.opensagres.poi.xwpf.converter.core.ImageManager;
import fr.opensagres.poi.xwpf.converter.xhtml.IContentHandlerFactory;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLConverter;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.xmlbeans.impl.util.Base64;

import java.io.*;
import java.util.*;

public class GenerateWordByTemplate {
    public static void main1(String[] args) throws IOException {
        /*
        * 根据模板生成word, 并把此原始文档的地址写入数据库
        * */
        XWPFTemplate render = XWPFTemplate.compile("C:\\Users\\10753\\Desktop\\report-template.docx").render(
                new HashMap<String, Object>() {{
                    put("reportTitle", "报告标题");
                    put("section", new ArrayList<ReportSection>() {{
                        add(new ReportSection("1一级标题", "1二级标题", "1内容"));
                        add(new ReportSection("2一级标题","2二级标题", "2内容"));
                        add(new ReportSection("3一级标题", "3二级标题", "3内容"));
                    }});
                }});
        render.writeToFile("C:\\Users\\10753\\Desktop\\export\\" + new Date().getTime() + ".docx"); // 输出文件
        // response.setContentType("application/octet-stream");
        // response.setHeader("Content-disposition","attachment;filename=\""+"out_template.docx"+"\"");
// HttpServletResponse response
//         OutputStream out = response.getOutputStream();
//         BufferedOutputStream bos = new BufferedOutputStream(out);
//         template.write(bos);
//         bos.flush();
//         out.flush();
//         PoitlIOUtils.closeQuietlyMulti(template, bos, out);
    }
    /*
    * 根据word生成html, html发送前端，并保存到数据库
    * */
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\10753\\Desktop\\export\\1625068285060.docx"));//要转化的word
            XWPFDocument document = new XWPFDocument(in);
            OutputStream baos = new ByteArrayOutputStream();
            XHTMLConverter xhtmlConverter = (XHTMLConverter) XHTMLConverter.getInstance();
            XHTMLOptions xhtmlOptions = XHTMLOptions.getDefault();
            xhtmlOptions.setExtractor(new FileImageExtractor(new File("E:\\Develop\\IntelliJ IDEA-workspace\\html22word\\src\\main\\webapp\\reportImg")));
            xhtmlOptions.URIResolver(new BasicURIResolver("reportImg"));
            xhtmlConverter.convert(document, baos, xhtmlOptions);
            String content = baos.toString();//转化好的html代码
            baos.close();
            System.out.println("content = " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

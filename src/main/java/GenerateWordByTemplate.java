
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.DocxRenderData;
import entity.ReportSection;
import fr.opensagres.poi.xwpf.converter.core.BasicURIResolver;
import fr.opensagres.poi.xwpf.converter.core.FileImageExtractor;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLConverter;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLOptions;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;
import java.util.*;

public class GenerateWordByTemplate {
    public static void main(String[] args) throws IOException {
        /*
        * 根据模板生成word, 并把此原始文档的地址写入数据库
        * */
        // XWPFTemplate render = XWPFTemplate.compile("C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\report-template.docx").render(
        // XWPFTemplate render = XWPFTemplate.compile("D:\\test\\report-template.docx").render(
        //         new HashMap<String, Object>() {{
        //             put("reportTitle", "报告标题");
        //             put("section", new DocxRenderData(new File("D:\\test\\content-template.docx"), new ArrayList<ReportSection>() {{
        //                     add(new ReportSection("firstTitle", "1二级标题", "1内容"));
        //                     add(new ReportSection("2一级标题","2二级标题", "2内容"));
        //                     add(new ReportSection("3一级标题", "3二级标题", "3内容"));
        //                 }}));
        //         }});

        XWPFTemplate render = XWPFTemplate.compile("D:\\test\\report-template.docx").render(
                new HashMap<String, Object>() {
                    {
                        put("reportTitle", "报告标题");
                        put("section", new DocxRenderData(new File("D:\\test\\content-template.docx"), new ArrayList<HashMap<String, Object>>(){
                            {
                                add(new HashMap<String, Object>() {{
                                    put("firstTitle", "一级标题");
                                    put("section2", new DocxRenderData(new File("D:\\test\\content2-template.docx"), new ArrayList<HashMap<String, Object>>(){
                                        {
                                            add(new HashMap() {{
                                                put("secondTitle", "er级标题");
                                                put("content", "内容");
                                            }});
                                            add(new HashMap() {{
                                                put("secondTitle", "二级标题");
                                                put("content", "内容");
                                            }});

                                        }}));
                                }});
                                add(new HashMap<String, Object>() {{
                                    put("firstTitle", "一级标题");
                                    put("section2", new DocxRenderData(new File("D:\\test\\content2-template.docx"), new ArrayList<HashMap<String, Object>>(){
                                        {
                                            add(new HashMap() {{
                                                put("secondTitle", "er级标题");
                                                put("content", "内容");
                                            }});
                                            add(new HashMap() {{
                                                put("secondTitle", "二级标题");
                                                put("content", "内容");
                                            }});

                                        }}));
                                }});

                            }}));
                    }
                });
        render.writeToFile("C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\static\\generateWord\\" + new Date().getTime() + ".docx"); // 输出文件




        // render.writeToFile("C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\static\\generateWord\\" + new Date().getTime() + ".docx"); // 输出文件
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
    public static void main1(String[] args) {
        String head = "\"<meta charset=UTF-8\"/>";
        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\static\\1625108861955.docx"));//要转化的word
            XWPFDocument document = new XWPFDocument(in);
            OutputStream baos = new ByteArrayOutputStream();
            XHTMLConverter xhtmlConverter = (XHTMLConverter) XHTMLConverter.getInstance();
            XHTMLOptions xhtmlOptions = XHTMLOptions.getDefault();
            xhtmlOptions.setExtractor(new FileImageExtractor(new File("C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\static\\generateHtml\\")));
            xhtmlOptions.URIResolver(new BasicURIResolver("C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\static\\generateHtml"));
            xhtmlConverter.convert(document, baos, xhtmlOptions);
            String content = baos.toString();//转化好的html代码
            StringBuilder stringBuilder = new StringBuilder(content);
            stringBuilder.insert(12, "<meta charset=\"UTF-8\"/>");
            baos.close();
            System.out.println("content = " + stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    * html转word
    * */

    public static void main2(String[] args) throws FileNotFoundException {
            //创建 POIFSFileSystem 对象
            POIFSFileSystem poifs = new POIFSFileSystem();
            //获取DirectoryEntry
            DirectoryEntry directory = poifs.getRoot();
            //创建输出流
            OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\htmlword\\html_to_word.doc");
            try {
                //创建文档,1.格式,2.HTML文件输入流
                String content = "content = <html><head><meta charset=\"UTF-8\"/><style>p{margin-top:0pt;margin-bottom:1pt;}p.a{text-align:justified;}p.X1{margin-top:17.0pt;margin-bottom:16.5pt;}span.X1{font-size:22.0pt;font-weight:bold;}span.X11{font-size:22.0pt;font-weight:bold;}p.a3{text-indent:21.0pt;}p.a4{text-align:center;}span.a4{font-size:9.0pt;}span.X10{font-size:9.0pt;}p.a5{text-align:left;}span.a5{font-size:9.0pt;}span.X12{font-size:9.0pt;}span.X13{font-size:22.0pt;font-weight:bold;}span.a6{font-size:9.0pt;}span.a7{font-size:9.0pt;}span.X14{font-size:22.0pt;font-weight:bold;}span.a8{font-size:9.0pt;}span.a9{font-size:9.0pt;}span.X15{font-size:22.0pt;font-weight:bold;}span.aa{font-size:9.0pt;}span.ab{font-size:9.0pt;}</style></head><body><div style=\"width:595.3pt;margin-bottom:72.0pt;margin-top:72.0pt;margin-left:90.0pt;margin-right:90.0pt;\"><p class=\"a X1\" style=\"text-align:center;white-space:pre-wrap;\"><span class=\"a X1\">报告标题</span></p><p class=\"a a3\"><span class=\"a a3\">1、 </span><span class=\"a a3\" style=\"font-family:'宋体';font-size:16.0pt;font-weight:bold;white-space:pre-wrap;\">1一级标题</span></p><p class=\"a a3\"><span class=\"a a3\">1. </span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">1</span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">二</span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">级标题</span></p><p style=\"margin-left:39.0pt;white-space:pre-wrap;\"><span style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">1内容</span></p><p class=\"a a3\"><span class=\"a a3\">1、 </span><span class=\"a a3\" style=\"font-family:'宋体';font-size:16.0pt;font-weight:bold;white-space:pre-wrap;\">2一级标题</span></p><p class=\"a a3\"><span class=\"a a3\">1. </span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">2</span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">二</span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">级标题</span></p><p style=\"margin-left:39.0pt;white-space:pre-wrap;\"><span style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">2内容</span></p><p style=\"margin-left:39.0pt;white-space:pre-wrap;\"><br/></p><p style=\"margin-left:39.0pt;white-space:pre-wrap;\"><img src=\"C:\\Users\\Administrator\\Desktop\\html22word\\html22word\\src\\main\\resources\\static\\generateHtml/word/media/image1.jpeg\" style=\"width:415.3pt;height:276.75pt;\"/></p><p class=\"a a3\"><span class=\"a a3\">1、 </span><span class=\"a a3\" style=\"font-family:'宋体';font-size:16.0pt;font-weight:bold;white-space:pre-wrap;\">3一级标题</span></p><p class=\"a a3\"><span class=\"a a3\">1. </span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">3</span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">二</span><span class=\"a a3\" style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">级标题</span></p><p style=\"margin-left:39.0pt;white-space:pre-wrap;\"><span style=\"font-family:'FangSong';font-size:14.0pt;white-space:pre-wrap;\">3内容</span></p></div></body></html>\n";
                byte b[] = content.getBytes("UTF-8");
                ByteArrayInputStream bais = new ByteArrayInputStream(b);
                directory.createDocument("WordDocument", bais);
                //写入
                poifs.writeFilesystem(out);
                //释放资源
                out.close();
                System.out.println("success");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}

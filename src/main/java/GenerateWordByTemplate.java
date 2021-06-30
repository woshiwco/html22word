import com.deepoove.poi.XWPFTemplate;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenerateWordByTemplate {
    public static void main(String[] args) throws IOException {
        XWPFTemplate.compile("C:\\Users\\10753\\Desktop\\report-template.docx").render(
                new HashMap<String, Object>(){{
            put("reportTitle", "报告标题");
            put("firstTitle", "一级标题");
            put("secondTitle", "二级标题");
            put("content", "内容");
        }}
        ).writeToFile("C:\\Users\\10753\\Desktop\\export\\" + new Date().getTime() + ".docx");
    }

}

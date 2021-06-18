import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;
import org.junit.jupiter.api.Test;


import com.github.houbb.markdown.toc.vo.TocGen;




/**
 * @author initial
 * @CreateTime 2021/6/17:17:37
 */
public class CreateContent {
    
    /**
     * 普通-fluent 写法
     */
    @Test
    public void commonFluentTest() {
        String path = "C:\\Users\\initial\\Downloads\\web-library-master\\DesignPattern\\README.md";
        TocGen tocGen = AtxMarkdownToc.newInstance()
                .genTocFile(path);
        System.out.println(tocGen);
    }
}

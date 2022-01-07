package com.finaldevelopment.YH;

import com.finaldevelopment.YH.Entity.a_type;
import com.finaldevelopment.YH.Entity.article;
import com.finaldevelopment.YH.Entity.type_of_article;
import com.finaldevelopment.YH.Mapper.a_typeMapper;
import com.finaldevelopment.YH.Mapper.articleMapper;
import com.finaldevelopment.YH.Mapper.type_of_articleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FinalDevelopmentApplicationTests {

    @Autowired
    type_of_articleMapper articleMapper;

    @Test
    void contextLoads() {
        List<type_of_article> type_of_articles = articleMapper.queryByTypeId(1);
        System.out.println(type_of_articles);

//        List<article> articles = articleMapper.queryAllArticle();
//        for (article a:articles){
//            System.out.println(a);
//        }
//        article articles = new article();
//        articles.setA_name("正则和XPath");
//        articles.setContent("# 正则和XPath\n" +
//                "\n" +
//                "边学边用\n" +
//                "\n" +
//                "```正则表达式\n" +
//                "//\t\t字符匹配\n" +
//                ".\t\t表示匹配任意一个字符\n" +
//                "\\d\t\t匹配任意数字\n" +
//                "\\w\t\t匹配任意字母\n" +
//                "//\n" +
//                "?\t\t最短匹配\n" +
//                "//\t\t次数匹配\n" +
//                "*\t\t表示根据前一个字符来匹配可以重复1~n次匹配\n" +
//                "{n}\t\t匹配n个\n" +
//                "{n,m}\t匹配n-m个\n" +
//                "^\t\t匹配输入字符串的开始位置，除非在方括号表达式中使用，当该符号在方括号表达式中使用时，表示不接受该方括号表达式中的字符集合。要匹配 ^ 字符本身，请使用 \\^。\n" +
//                "```\n" +
//                "\n" +
//                "```\n" +
//                "#正则例子\n" +
//                "www.*?\\.xml\n" +
//                "匹配以www开头以.xml结尾的字符串\n" +
//                "```\n" +
//                "\n" +
//                "```\n" +
//                "#语法\n" +
//                "\\b\t匹配一个单词边界，即字与空格间的位置。\n" +
//                "\\1  与第一个()相同例如\\2,\\3同理\n" +
//                "\t\t正:(a)\\1xy\n" +
//                "\t\t结:aaxy\n" +
//                "\t\t\n" +
//                "```\n" +
//                "\n" +
//                "对于python的正则:\n" +
//                "\n" +
//                "\u200B\tre.match(pattern,string,flags)\t\t\t|          只匹配字符串的开始\n" +
//                "\n" +
//                "\u200B\t\tpattern:正则表达式\n" +
//                "\n" +
//                "\u200B\t\tstring:字符串\n" +
//                "\n" +
//                "\u200B\t\tflags:是否支持大小写,多行匹配\n" +
//                "\n" +
//                "\u200B\tre.group()返回正则的指定那个分组(无参则全返回)\n" +
//                "\n" +
//                "\u200B\tre.sreach(pattern,string,flags)\t\t\t|         匹配整个字符串\n" +
//                "\n" +
//                "\u200B\t\tpattern:正则表达式\n" +
//                "\n" +
//                "\u200B\t\tstring:字符串\n" +
//                "\n" +
//                "\u200B\t\tflags:是否支持大小写,多行匹配\n" +
//                "\n" +
//                "\u200B\tre.sub(pattern,repl,string,flags)\t\t\t|         替换字符串\n" +
//                "\n" +
//                "\u200B\t\tpattern:正则表达式\n" +
//                "\n" +
//                "\u200B\t\trepl:参数是要替换的字符串活函数\n" +
//                "\n" +
//                "\u200B\t\tstring:字符串\n" +
//                "\n" +
//                "\u200B\t\tflags:是否支持大小写,多行匹配\n" +
//                "\n" +
//                "\u200B\t\t\n" +
//                "\n" +
//                "## 使用XPath来解析网页\n" +
//                "\n" +
//                "```python\n" +
//                "import requests\n" +
//                "from lxml import etree\n" +
//                "import random\n" +
//                "\n" +
//                "def main():\n" +
//                "    # 网页url\n" +
//                "    url = 'https://www.qiushibaike.com/pic/'\n" +
//                "    ua_headers = {\"User-Agent\": 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0)'}\n" +
//                "    # 网页代码\n" +
//                "    response = requests.get(url=url, headers=ua_headers).text\n" +
//                "    # 转换为etree对象\n" +
//                "    tree = etree.HTML(response)\n" +
//                "    # 匹配到所有class属性为thumb的div标签下的img标签的src属性值,返回一个列表\n" +
//                "    img_lst = tree.xpath('//div[@class=\"thumb\"]//img/@src')\n" +
//                "    # 随机挑选一个图片并且下载下来\n" +
//                "    res = requests.get(url='https:'+random.choice(img_lst), headers=ua_headers).content\n" +
//                "    # 将图片保存到本地\n" +
//                "    with open('image.jpg', 'wb') as f:\n" +
//                "        f.write(res)\n" +
//                "\n" +
//                "if __name__ == '__main__':\n" +
//                "    main()\n" +
//                "```\n" +
//                "\n" +
//                "XPath手册：https://www.w3school.com.cn/xpath/xpath_functions.asp\n" +
//                "\n" +
//                "\n" +
//                "\n" +
//                "使用\".\"运算可以从当前目录下选择节点,例如:\n" +
//                "\n" +
//                "\u200B\tdivs.xpath(\"//p\")是选取整个文档的p\n" +
//                "\n" +
//                "\u200B\tdivs.xpath(\".//p\")是选取当前节点下的p\n" +
//                "\n" +
//                "\u200B\tdivs.xpath(\"p\")提取直系的所有p\n" +
//                "\n" +
//                "使用函数的记录:\n" +
//                "\n" +
//                "\u200B\tcontains(str)包含字符串str便提取\n" +
//                "\n" +
//                "\u200B\tstarts-with(str)以str开始\n" +
//                "\n" +
//                "\n" +
//                "\n" +
//                "### 使用text()和使用\".\"(选择当前节点)的差别\n" +
//                "\n" +
//                "\u200B\t使用text()会将标签下的元素生成多个列表\n" +
//                "\n" +
//                "\u200B\t使用\".\"会将该节点直接选出\n" +
//                "\n" +
//                "```shell\n" +
//                "from scrapy import Selector\n" +
//                "sel = Selector(text=\"<a href='#'>gogogo<strong>Next</strong></a>\")\n" +
//                "sel.xpath(\"//a/text()\")\n" +
//                "Out[4]: [<Selector xpath='//a/text()' data='gogogo'>]\n" +
//                "sel.xpath(\"//a//text()\")\n" +
//                "Out[5]: \n" +
//                "[<Selector xpath='//a//text()' data='gogogo'>,\n" +
//                " <Selector xpath='//a//text()' data='Next'>]\n" +
//                "sel.xpath(\"string(//a//text())\")\n" +
//                "Out[6]: [<Selector xpath='string(//a//text())' data='gogogo'>]\n" +
//                "sel.xpath(\"string(//a)\")\n" +
//                "```\n" +
//                "\n" +
//                "\n" +
//                "\n");
//        articles.setDescription("正则表达式在许多地方都有应用,功能是对字符串的匹配.而xpath是对标记语言的一种处理,这俩配合起来可以让爬虫十分高效");
//        articleMapper.insertArticle(articles);

    }

}

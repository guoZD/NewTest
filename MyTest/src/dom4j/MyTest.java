package dom4j;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MyTest {

	/**
	 * @param args
	 * @throws DocumentException 
	 */
	public static void main(String[] args) throws DocumentException {
		
		// 创建saxReader对象
		SAXReader reader = new SAXReader();
		// 通过read方法读取一个文件 转换成Document对象
		Document document = reader.read(new File("src/dom4j/227d708b3e78408f8ffac93e4efb4657D_331201_20131209_342222198602164535_DATA.xml"));
		// 获取根节点元素对象
		Element node = document.getRootElement();
		// 当前节点下面子节点
		
		Element element_accountants = node.element("accountants");
		Element element_colhead = element_accountants.element("colhead");
		Element element_accountant = element_accountants.element("accountant");
		
		if(element_colhead == null || element_accountant == null){
			System.out.println(1);
			return;
		}
		Element element_accountantBase = element_colhead.element("accountant-base");
		Element element_accountantBase2 = element_accountant.element("accountant-base");
		if(element_accountantBase == null || element_accountantBase2 == null){
			System.out.println(2);
			return ;
		}
		String s1 = element_accountantBase.getTextTrim();
		String s2 = element_accountantBase2.getTextTrim();
		System.out.println(s1);
		System.out.println(s1.split("!#!").length);
		System.out.println(s2);
		System.out.println(s2.split("!#!").length);
		String s3 = "1!#!2!#!";
		System.out.println(s3.split("!#!").length);
		String s4 = "1!#!2!#!!#!";
		System.out.println(s4.split("!#!").length);
		String s5 = "!#!";
		System.out.println(s5.split("!#!").length);
		String s6 = "!";
		System.out.println(s6.split("!#!").length);
		String s7 = "1!#!2!#!!#!3";
		System.out.println(s7.split("!#!").length);
		Element element_accountantBase3 = element_colhead.element("accountant-base2");
		if(element_accountantBase3 == null){
			System.out.println("yes");
		}
	}

}

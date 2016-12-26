import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * String fileName =
		 * "D://guozd//workSpace//da_bank_web//src//main//java//com//dongao//modules//order//controller//InvoiceController.java"
		 * ; readFileByLines("");
		 */
		/*
		 * long courseRealTime = 2271l; long learnedTime = Long.valueOf("40");
		 * double scale = Double.valueOf("0.02");
		 * System.out.println(compareTime(courseRealTime,learnedTime,scale));
		 */
		/*List<String> list = new ArrayList<String>(5);
		System.out.println(list.get(3));*/
		/*String ss = "/website/professionFile/f8886892-9865-4011-873e-8303aad9078c下载 (3).jpg";
		System.out.println(ss.substring(ss.lastIndexOf("/")+1));
		System.out.println(ss.substring(0,ss.lastIndexOf("/")+1));*/
		String sufixx = "014100000016";
		Long num = Long.valueOf(sufixx,16);
		System.out.println(num);
    	Long tableID = num%32;
    	String tableName = "da_bank_person_paper_question" + tableID;
    	System.out.println(tableName);
	}

	public static boolean compareTime(double courseRealTime,
			double learnedTime, double scale) {
		if (learnedTime >= courseRealTime * scale) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 以行为单位读取文件，常用于读面向行的格式化文件
	 */
	public static void readFileByLines(String fileName) {
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			System.out.println("以行为单位读取文件内容，test    一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 显示行号
				System.out.println("line " + line + ": " + tempString);
				line++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}
}

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import sun.misc.BASE64Encoder;

public class MyTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("main"); Hello he = new Hello(); he.sayHello();
		 * getHostName();
		 */
		/*
		 * String[] st = {"guozd","123456"}; String sp = Arrays.toString(st);
		 * System.out.println(sp); System.out.println(st);
		 */
		/*
		 * String CSRF_TOKEN_FOR_SESSION_ATTR_NAME = MyTest.class.getName() +
		 * ".tokenval"; System.out.println(CSRF_TOKEN_FOR_SESSION_ATTR_NAME);
		 */
		/* System.out.println("uiiopo".indexOf("i")); */
		/*
		 * String[] str= "123,234".split(","); List<Long> list = new
		 * ArrayList<Long>(); list.add(12l); list.add(12l); list.add(12l);
		 * StringBuilder sb = new StringBuilder(); for(Long l : list){
		 * sb.append("'"+l+"',"); } System.out.println(sb.substring(0,
		 * sb.length()-1));
		 */
		/*
		 * String s1 = "/g_user/gUser/editGUser"; String s2 =
		 * "g_user/gUser/editGUser/?"; s1 = s1.substring(1);
		 * System.out.println(s1); Boolean flag = true; if(s2.indexOf("?") ==
		 * -1){ if(!s2.equals(s1)){ flag = false; } }else{ String[] s1Array =
		 * s1.split("/"); String[] s2Array = s2.split("/"); if(s1Array.length ==
		 * s2.length()){ for (int i = 0; i < s2Array.length; i++) {
		 * if("/".equals(s2Array[i])){ continue; }else{
		 * if(s2Array[i].equals(s1Array[i])){ continue; }else{ flag = false;
		 * break; } } } }else{ flag = false; } } System.out.println(flag);
		 */
		/*
		 * String filePath = "/upload/noImg.png"; int lastIndex =
		 * filePath.lastIndexOf("/")+1; System.out.println(filePath.substring(0,
		 * lastIndex)); System.out.println(filePath.substring(lastIndex));
		 */
		/*
		 * String io = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD";
		 * System.out.println(io.substring(io.indexOf("base64,")+7));
		 */
		/*
		 * List list = new ArrayList(); list.add("123"); list.add("456");
		 * list.add("789"); Collections.shuffle(list); System.out.println(list);
		 * Collections.shuffle(list); System.out.println(list);
		 * Collections.shuffle(list); System.out.println(list);
		 */
		/*
		 * System.out.println((new MyTest()).EncoderByMd5("1qaz@dongao.com"));
		 * String ss = "/ff/ffff.jpg";
		 * 
		 * System.out.println(ss.substring(0, ss.lastIndexOf("/") + 1));
		 * System.out.println(ss.substring(ss.lastIndexOf("/") + 1));
		 */
		/*
		 * int s = 442123;
		 * 
		 * String.format("%0"+3*2+"d",s); System.out.println(s);
		 */

		/*
		 * Date now = new Date(); Date n ; SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); try {
		 * n=sdf.parse("2016-11-09 15:00:00");
		 * System.out.println(now.getTime()>n.getTime()); } catch
		 * (ParseException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		/*
		 * StringBuffer sb = new StringBuffer(); sb.deleteCharAt(sb.length()-1);
		 * System.out.println(sb.toString());
		 */
		/*
		 * (数据类型)(最小值+Math.random()*(最大值-最小值+1)) 例:
		 * (int)(1+Math.random()*(10-1+1)) 从1到10的int型随数
		 */
		/*
		 * Random ra = new Random(); for (int i = 0; i < 30; i++) {
		 * System.out.println(ra.nextInt(4-2+1) + 2); }
		 */
		/*
		 * BigDecimal decimal = new BigDecimal("113.34444");
		 * System.out.println(decimal); BigDecimal setScale =
		 * decimal.setScale(4,BigDecimal.ROUND_HALF_DOWN);
		 * System.out.println(setScale);
		 * 
		 * BigDecimal setScale1 = decimal.setScale(4,BigDecimal.ROUND_HALF_UP);
		 * System.out.println(setScale1);
		 * 
		 * BigDecimal setScale2 =
		 * decimal.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		 * System.out.println(setScale2);
		 */
	/*	
		BigDecimal a=new BigDecimal(12.88);
		BigDecimal b=new BigDecimal(12.88);
		//int b=a.add(new BigDecimal(0.5)).intValue(); 
		b=b.add(a);
		System.out.println(b);//b=12;
*/	
	/*	char ss = 67;
		System.out.println(ss);
		System.out.println(String.valueOf(ss));
		fun1();// ASCII转换为字符串   
		  
        fun2();// 字符串转换为ASCII码  
*/	
		/*String rightAnswer = "837";
		rightAnswer = rightAnswer.replaceAll("837", "A");
		System.out.println(rightAnswer);*/
		/*System.out.println(("111,2".split(",")).length);*/
		String[] ss={"C","B","A"};
		System.out.println(MyTest.StringToLong(ss));
		
		
	}
	private static String StringToSortString(String[] strs) {
        String[] str2 = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            str2[i] = String.valueOf(strs[i]);
        }
        Arrays.sort(str2);
        String s = "";
        for(int i=0;i<str2.length;i++){
        	if (i == 0) {
        		s = "" + str2[i];
        	} else {
        		s = s + "," + str2[i];
        	}
        }
	    return s;   
	}

	public static void fun1() {// ASCII转换为字符串   
		  
        String s = "22307 35806 24555 20048";// ASCII码   
  
        String[] chars = s.split(" ");   
        System.out.println("ASCII 汉字 \n----------------------");   
        for (int i = 0; i < chars.length; i++) {   
            System.out.println(chars[i] + " "  
                    + (char) Integer.parseInt(chars[i]));    
        }   
    }   
  
    public static void fun2() {// 字符串转换为ASCII码   
  
        String s = "新年快乐！";// 字符串   
  
        char[] chars = s.toCharArray(); // 把字符中转换为字符数组   
  
        System.out.println("\n\n汉字 ASCII\n----------------------");   
        for (int i = 0; i < chars.length; i++) {// 输出结果   
  
            System.out.println(" " + chars[i] + " " + (int) chars[i]);   
        }   
    }   
	/**
	 * 两个时间相差距离多少天多少小时多少分多少秒
	 * 
	 * @param str1
	 *            时间参数 1 格式：1990-01-01 12:00:00
	 * @param str2
	 *            时间参数 2 格式：2009-01-01 12:00:00
	 * @return long[] 返回值为：{天, 时, 分, 秒}
	 */
	public static long[] getDistanceTimes(String str1, String str2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date one;
		Date two;
		long day = 0;
		long hour = 0;
		long min = 0;
		long sec = 0;
		try {
			one = df.parse(str1);
			two = df.parse(str2);
			long time1 = one.getTime();
			long time2 = two.getTime();
			long diff;
			if (time1 < time2) {
				diff = time2 - time1;
			} else {
				diff = time1 - time2;
			}
			day = diff / (24 * 60 * 60 * 1000);
			hour = (diff / (60 * 60 * 1000) - day * 24);
			min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
			sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long[] times = { day, hour, min, sec };
		return times;
	}

	/**
	 * 两个时间相差距离多少天多少小时多少分多少秒
	 * 
	 * @param str1
	 *            时间参数 1 格式：1990-01-01 12:00:00
	 * @param str2
	 *            时间参数 2 格式：2009-01-01 12:00:00
	 * @return String 返回值为：xx天xx小时xx分xx秒
	 */
	public static String getDistanceTime(String str1, String str2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date one;
		Date two;
		long day = 0;
		long hour = 0;
		long min = 0;
		long sec = 0;
		try {
			one = df.parse(str1);
			two = df.parse(str2);
			long time1 = one.getTime();
			long time2 = two.getTime();
			long diff;
			if (time1 < time2) {
				diff = time2 - time1;
			} else {
				diff = time1 - time2;
			}
			day = diff / (24 * 60 * 60 * 1000);
			hour = (diff / (60 * 60 * 1000) - day * 24);
			min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
			sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return day + "天" + hour + "小时" + min + "分" + sec + "秒";
	}

	private static BigDecimal formatComma2BigDecimal(Object obj) {
		String val = String.valueOf(obj);
		if (val == null)
			return new BigDecimal("0.00");

		val = val.replaceAll(",", "");
		if (!isNumber(val))
			return new BigDecimal("0.00");

		BigDecimal decimal = new BigDecimal(val);
		decimal = decimal.setScale(2, RoundingMode.HALF_UP);

		return decimal;

	}

	private static String formatCommaAnd2Point(Object obj) {
		BigDecimal decimal = formatComma2BigDecimal(obj);

		DecimalFormat df = new DecimalFormat("#,###.00");
		String decimalStr = df.format(decimal).equals(".00") ? "0.00" : df
				.format(decimal);
		if (decimalStr.startsWith(".")) {
			decimalStr = "0" + decimalStr;
		}
		return decimalStr;
	}

	private static boolean isDouble(String value) {
		try {
			Double.parseDouble(value);
			if (value.contains("."))
				return true;
			return false;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static boolean isNumber(String value) {
		return isInteger(value) || isDouble(value);
	}

	/**
	 * 利用MD5进行加密
	 * 
	 * @param str
	 *            待加密的字符串
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 *             没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException
	 */
	public String EncoderByMd5(String str) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// 加密后的字符串
		String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
		return newstr;
	}

	public static String getHostName() {

		String hostName = "";

		InetAddress addr;
		try {

			addr = InetAddress.getLocalHost();
			hostName = addr.getHostName().toString(); // 获取操作服务器名称
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		System.out.println("==========本机服务器名称为==========：" + hostName);

		return hostName;
	}
}

class Hello {
	void sayHello() {
		System.out.println("nihao!");
	}
}

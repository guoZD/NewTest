import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

//类名SendSms可定义合适的名称，不需要与webservice名称相同
public class testWebservice {
	 DynamicClientFactory factory = DynamicClientFactory.newInstance();
//此处根据实际情况写入webservice服务器地址
	 Client client =factory.createClient("http://127.0.0.1/crazyit?wsdl");
	 public static void main(String[] args){
		 if(args!=null){
			 testWebservice ss = new testWebservice();
			 ss.sayHello();
		 }else{
			 System.out.println("sendSms error!!!");
		 }
	 }
	 public void sayHello()
	 {
		try {
			Object[] object = client.invoke("sayHello","nihao");
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	  //发送短信接口,方法名sendSms可定义合适的名称，不需要与webservice名称相同
	public String sendSms(String userName, String destAddr, String message){	 
		 try{
			 Object[] object = client.invoke("sendSms", new Object[]{userName, destAddr, message});
			 	if(object[0].toString().equals("ERROR_CODE1")){
					System.out.println("用户名不能为空");
				}
				if(object[0].toString().equals("ERROR_CODE2")){
					System.out.println("收信人不能为空");
				}
				if(object[0].toString().equals("ERROR_CODE3")){
					System.out.println("无有效收信人");
				}
				if(object[0].toString().equals("ERROR_CODE4")){
					System.out.println("短信内容不能为空并且短信内容长度不能大于180");
				}
				if(object[0].toString().equals("ERROR_CODE5")){
					System.out.println("该用户名不存在或者不是有效接口用户");
				}
			 return object[0].toString();
		 }catch(Exception e){

			 e.printStackTrace();
		 }
		 return null;
	}
}


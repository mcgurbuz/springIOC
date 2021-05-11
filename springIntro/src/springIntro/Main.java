package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//IOC Injection of Control
		//Dependency Injection
		
		//ClassPathXmlApplicationContext ile applicationContext.xml dosyama ulasiyorum ve context degiskeni uzerine atiyorum
		//applicationContext.xml ile ilgili islemler bu degisken uzerinden gerceklestirilecek.
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); //Biz applicationContexti okuyacağız diyoruz.
		
		//ICustomerService tipinde bir sınıf olusturdum ve bu sinifa applicationContext.xml'de kullandigim ICustomerService tipinde ki
		//class'i atadim. context.getBean metodu ile applicationContext.xml dosyasindaki beanlerime ulasiyorum. service paremetresi
		//applicationContext.xml dosyasinda hangi bean'e gidecegimi soyluyor.ICustomerService.class parametresi ise bu metod sonucu 
		//donmesi gereken class'in tipinin ICustomerService biciminde olmasi gerektigini soyluyor.
		
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		customerService.add();
		
		
		
		
		
	
		
		

	}

}

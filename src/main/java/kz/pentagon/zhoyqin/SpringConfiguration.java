package kz.pentagon.zhoyqin;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.example.demo.CalculatorI;

@Configuration
public class SpringConfiguration {

	@Bean
	public JaxWsPortProxyFactoryBean spitterService() throws MalformedURLException {
		JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
		proxy.setWsdlDocumentUrl( new URL("http://localhost:8888/services/CalculatorService?wsdl"));
		proxy.setServiceName("CalculatorService");
		proxy.setPortName("CalculatorImplPort");
		proxy.setServiceInterface(CalculatorI.class);
		proxy.setNamespaceUri("http://demo.example.com/");
		return proxy;
	}

}

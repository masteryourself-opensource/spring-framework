//package pers.masteryourself.tutorial.spring.framework.scan.config;
//
//import java.lang.reflect.Method;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.cglib.core.ReflectUtils;
//import org.springframework.cglib.core.Signature;
//import org.springframework.cglib.proxy.Callback;
//import org.springframework.cglib.proxy.MethodInterceptor;
//import org.springframework.cglib.proxy.MethodProxy;
//import org.springframework.cglib.proxy.NoOp;
//import org.springframework.context.annotation.ConfigurationClassEnhancer;
//import pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.bean.Person1;
//import pers.masteryourself.tutorial.spring.framework.configurationclasspostprocessor.bean.Person2;
//import pers.masteryourself.tutorial.spring.framework.scan.config.SpringConfig;
//
//public class SpringConfig$$EnhancerBySpringCGLIB$$e52654b5
//		extends SpringConfig
//		implements ConfigurationClassEnhancer.EnhancedConfiguration {
//	private boolean CGLIB$BOUND;
//	public static Object CGLIB$FACTORY_DATA;
//	private static final ThreadLocal CGLIB$THREAD_CALLBACKS;
//	private static final Callback[] CGLIB$STATIC_CALLBACKS;
//	// 即 BeanMethodInterceptor
//	private MethodInterceptor CGLIB$CALLBACK_0;
//	// 即 BeanFactoryAwareMethodInterceptor
//	private MethodInterceptor CGLIB$CALLBACK_1;
//	private NoOp CGLIB$CALLBACK_2;
//	private static Object CGLIB$CALLBACK_FILTER;
//	private static final Method CGLIB$person2$0$Method;
//	private static final MethodProxy CGLIB$person2$0$Proxy;
//	private static final Object[] CGLIB$emptyArgs;
//	private static final Method CGLIB$person1$1$Method;
//	private static final MethodProxy CGLIB$person1$1$Proxy;
//	private static final Method CGLIB$setBeanFactory$6$Method;
//	private static final MethodProxy CGLIB$setBeanFactory$6$Proxy;
//	// Spring 在用 cglib 做增强时添加的 $$beanFactory 属性
//	public BeanFactory $$beanFactory;
//
//	static void CGLIB$STATICHOOK1() {
//		CGLIB$THREAD_CALLBACKS = new ThreadLocal();
//		CGLIB$emptyArgs = new Object[0];
//		Class<?> class_ = Class.forName("pers.masteryourself.tutorial.spring.framework.scan.config.SpringConfig$$EnhancerBySpringCGLIB$$e52654b5");
//		Class<?> class_2 = Class.forName("org.springframework.beans.factory.BeanFactoryAware");
//		CGLIB$setBeanFactory$6$Method = ReflectUtils.findMethods(new String[]{"setBeanFactory", "(Lorg/springframework/beans/factory/BeanFactory;)V"}, class_2.getDeclaredMethods())[0];
//		CGLIB$setBeanFactory$6$Proxy = MethodProxy.create(class_2, class_, "(Lorg/springframework/beans/factory/BeanFactory;)V", "setBeanFactory", "CGLIB$setBeanFactory$6");
//		class_2 = Class.forName("pers.masteryourself.tutorial.spring.framework.scan.config.SpringConfig");
//		Method[] arrmethod = ReflectUtils.findMethods(new String[]{"person2", "()Lpers/masteryourself/tutorial/spring/framework/scan/bean/Person2;", "person1", "()Lpers/masteryourself/tutorial/spring/framework/scan/bean/Person1;"}, class_2.getDeclaredMethods());
//		CGLIB$person2$0$Method = arrmethod[0];
//		CGLIB$person2$0$Proxy = MethodProxy.create(class_2, class_, "()Lpers/masteryourself/tutorial/spring/framework/scan/bean/Person2;", "person2", "CGLIB$person2$0");
//		CGLIB$person1$1$Method = arrmethod[1];
//		CGLIB$person1$1$Proxy = MethodProxy.create(class_2, class_, "()Lpers/masteryourself/tutorial/spring/framework/scan/bean/Person1;", "person1", "CGLIB$person1$1");
//	}
//
//	final Person2 CGLIB$person2$0() {
//		return super.person2();
//	}
//
//	public final Person2 person2() {
//		MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//		if (methodInterceptor == null) {
//			SpringConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$BIND_CALLBACKS((Object) this);
//			methodInterceptor = this.CGLIB$CALLBACK_0;
//		}
//		if (methodInterceptor != null) {
//			// 调用 intercept 方法做拦截
//			return (Person2) methodInterceptor.intercept((Object) this, CGLIB$person2$0$Method, CGLIB$emptyArgs, CGLIB$person2$0$Proxy);
//		}
//		return super.person2();
//	}
//
//	final Person1 CGLIB$person1$1() {
//		return super.person1();
//	}
//
//	public final Person1 person1() {
//		MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//		if (methodInterceptor == null) {
//			SpringConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$BIND_CALLBACKS((Object) this);
//			methodInterceptor = this.CGLIB$CALLBACK_0;
//		}
//		if (methodInterceptor != null) {
//			// 调用 intercept 方法做拦截
//			return (Person1) methodInterceptor.intercept((Object) this, CGLIB$person1$1$Method, CGLIB$emptyArgs, CGLIB$person1$1$Proxy);
//		}
//		return super.person1();
//	}
//
//	final void CGLIB$setBeanFactory$6(BeanFactory beanFactory) throws BeansException {
//		super.setBeanFactory(beanFactory);
//	}
//
//	// 设置 BeanFactory 属性
//	public final void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//		MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_1;
//		if (methodInterceptor == null) {
//			SpringConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$BIND_CALLBACKS((Object) this);
//			methodInterceptor = this.CGLIB$CALLBACK_1;
//		}
//		if (methodInterceptor != null) {
//			Object object = methodInterceptor.intercept((Object) this, CGLIB$setBeanFactory$6$Method, new Object[]{beanFactory}, CGLIB$setBeanFactory$6$Proxy);
//			return;
//		}
//		super.setBeanFactory(beanFactory);
//	}
//
//	public static MethodProxy CGLIB$findMethodProxy(Signature signature) {
//		switch (((Object) signature).toString().hashCode()) {
//			case 165472848: {
//				String string;
//				if (!string.equals("person2()Lpers/masteryourself/tutorial/spring/framework/scan/bean/Person2;")) break;
//				return CGLIB$person2$0$Proxy;
//			}
//			case 1835986386: {
//				String string;
//				if (!string.equals("person1()Lpers/masteryourself/tutorial/spring/framework/scan/bean/Person1;")) break;
//				return CGLIB$person1$1$Proxy;
//			}
//			case 2095635076: {
//				String string;
//				if (!string.equals("setBeanFactory(Lorg/springframework/beans/factory/BeanFactory;)V")) break;
//				return CGLIB$setBeanFactory$6$Proxy;
//			}
//			default: {
//			}
//		}
//		return null;
//	}
//
//	public SpringConfig$$EnhancerBySpringCGLIB$$e52654b5() {
//		SpringConfig$$EnhancerBySpringCGLIB$$e52654b5 springConfig$$EnhancerBySpringCGLIB$$e52654b5 = this;
//		SpringConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$BIND_CALLBACKS((Object) springConfig$$EnhancerBySpringCGLIB$$e52654b5);
//	}
//
//	public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] arrcallback) {
//		CGLIB$THREAD_CALLBACKS.set(arrcallback);
//	}
//
//	public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] arrcallback) {
//		CGLIB$STATIC_CALLBACKS = arrcallback;
//	}
//
//	private static final void CGLIB$BIND_CALLBACKS(Object object) {
//		SpringConfig$$EnhancerBySpringCGLIB$$e52654b5 springConfig$$EnhancerBySpringCGLIB$$e52654b5 = (SpringConfig$$EnhancerBySpringCGLIB$$e52654b5) ((Object) object);
//		if (!springConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$BOUND) {
//			springConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$BOUND = true;
//			Object object2 = CGLIB$THREAD_CALLBACKS.get();
//			if (object2 != null || (object2 = CGLIB$STATIC_CALLBACKS) != null) {
//				Callback[] arrcallback = (Callback[]) object2;
//				SpringConfig$$EnhancerBySpringCGLIB$$e52654b5 springConfig$$EnhancerBySpringCGLIB$$e52654b52 = springConfig$$EnhancerBySpringCGLIB$$e52654b5;
//				springConfig$$EnhancerBySpringCGLIB$$e52654b52.CGLIB$CALLBACK_2 = (NoOp) arrcallback[2];
//				springConfig$$EnhancerBySpringCGLIB$$e52654b52.CGLIB$CALLBACK_1 = (MethodInterceptor) arrcallback[1];
//				springConfig$$EnhancerBySpringCGLIB$$e52654b52.CGLIB$CALLBACK_0 = (MethodInterceptor) arrcallback[0];
//			}
//		}
//	}
//
//	static {
//		SpringConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$STATICHOOK2();
//		SpringConfig$$EnhancerBySpringCGLIB$$e52654b5.CGLIB$STATICHOOK1();
//	}
//
//	static void CGLIB$STATICHOOK2() {
//	}
//}
package com.pycredit.microservice.demo.stmt.cache;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.pycredit.microservice.demo.stmt.Stmt;

public class CacheBeanInfo {
	private static final ConcurrentHashMap<Class<? extends Stmt>, Map<String,PropertyDescriptor>> beanInfoMap=
			new ConcurrentHashMap<>(64);
	/**
	 * 如果不存在，则将类的属性描述放入缓存
	 * @param clazz
	 * @throws IntrospectionException
	 */
	static void loadClass(Class<? extends Stmt> clazz) throws IntrospectionException {
		Map<String,PropertyDescriptor> propertyDesMap=new HashMap<>();
		BeanInfo info=Introspector.getBeanInfo(clazz);
		PropertyDescriptor[] pds=info.getPropertyDescriptors();
		for(PropertyDescriptor pd:pds) {
			propertyDesMap.put(pd.getName(), pd);
		}
		beanInfoMap.put(clazz, propertyDesMap);
	}
	/**
	 * 根据类名、属性名获取属性描述
	 * @param clazz
	 * @param fieldName
	 * @return
	 */
	public static PropertyDescriptor get(Class<? extends Stmt> clazz,String fieldName) {
		if(!beanInfoMap.containsKey(clazz)) {
				try {
					loadClass(clazz);
				} catch (IntrospectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return beanInfoMap.get(clazz).get(fieldName);
	}
}

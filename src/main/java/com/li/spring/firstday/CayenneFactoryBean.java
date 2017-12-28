package com.li.spring.firstday;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * implements FactoryBean<Cayenne>
 */
public class CayenneFactoryBean implements FactoryBean<Cayenne>{
    @Nullable
    @Override
    public Cayenne getObject() throws Exception {
        return new Cayenne();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {

        return Cayenne.class;
    }

    @Override
    public boolean isSingleton() {

        return false;
    }
}

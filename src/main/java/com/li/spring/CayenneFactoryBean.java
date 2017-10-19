package com.li.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

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
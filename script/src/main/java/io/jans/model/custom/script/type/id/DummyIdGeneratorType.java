/*
 * oxCore is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */package io.jans.model.custom.script.type.id;

import java.util.Map;

import io.jans.model.SimpleCustomProperty;
import io.jans.model.custom.script.model.CustomScript;

/**
 * Dummy implementation of interface IdGeneratorType
 *
 * @author Yuriy Movchan Date: 01/16/2015
 */
public class DummyIdGeneratorType implements IdGeneratorType {

    @Override
    public boolean init(Map<String, SimpleCustomProperty> configurationAttributes) {
        return true;
    }
    @Override
    public boolean init(CustomScript customScript, Map<String, SimpleCustomProperty> configurationAttributes) {
        return true;
    }
    @Override
    public boolean destroy(Map<String, SimpleCustomProperty> configurationAttributes) {
        return true;
    }

    @Override
    public int getApiVersion() {
        return 1;
    }

    @Override
    public String generateId(String appId, String idType, String idPrefix, Map<String, SimpleCustomProperty> configurationAttributes) {
        return null;
    }

}
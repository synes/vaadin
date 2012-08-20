/*
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.terminal.gwt.client.ui.upload;

public class UploadIFrameOnloadStrategy {

    native void hookEvents(com.google.gwt.dom.client.Element iframe,
            VUpload upload)
    /*-{
        iframe.onload = $entry(function() {
            upload.@com.vaadin.terminal.gwt.client.ui.upload.VUpload::onSubmitComplete()();
        });
    }-*/;

    /**
     * @param iframe
     *            the iframe whose onLoad event is to be cleaned
     */
    native void unHookEvents(com.google.gwt.dom.client.Element iframe)
    /*-{
        iframe.onload = null;
    }-*/;

}
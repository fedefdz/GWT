package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Item_ItemUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.gwtproject.tutorial.client.Item_ItemUiBinderImpl_GenBundle {
  private static Item_ItemUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Item_ItemUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.gwtproject.tutorial.client.Item_ItemUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("/* @external done; */\n.org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-item .done {\n  text-decoration : " + ("line-through")  + ";\n}\n.org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-title {\n  padding-right : " + ("20px")  + ";\n  font-size : " + ("150%")  + ";\n  font-weight : " + ("normal")  + ";\n}\n")) : (("/* @external done; */\n.org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-item .done {\n  text-decoration : " + ("line-through")  + ";\n}\n.org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-title {\n  padding-left : " + ("20px")  + ";\n  font-size : " + ("150%")  + ";\n  font-weight : " + ("normal")  + ";\n}\n"));
      }
      public java.lang.String description() {
        return "org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-description";
      }
      public java.lang.String done() {
        return "done";
      }
      public java.lang.String item() {
        return "org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-item";
      }
      public java.lang.String title() {
        return "org-gwtproject-tutorial-client-Item_ItemUiBinderImpl_GenCss_style-title";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.gwtproject.tutorial.client.Item_ItemUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.gwtproject.tutorial.client.Item_ItemUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.gwtproject.tutorial.client.Item_ItemUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.gwtproject.tutorial.client.Item_ItemUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}

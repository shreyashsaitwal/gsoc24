package com.mybutton;

import android.view.View;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;

@SimpleObject(external = true)
@DesignerComponent(
  version = 1, 
  category = ComponentCategory.EXTENSION,
  description = "My awesome button extensions",
  iconName = "https://developer.android.com/static/images/logos/android.svg"
)
public class MyButton extends AndroidViewComponent {
  private final Button button;

  private int backgroundColor = 0xFF6750A4;
  private String text = "Click me!";
  private int textColor = 0xFF000000;
  private float textFontSize = 14.0f;
  private String textTypeface = "0";

  public MyButton(ComponentContainer container) {
    super(container);
    button = new Button(container);
    updateAppearance();
  }

  @Override
  public View getView() {
    return button.getView();
  }

  private void updateAppearance() {
    button.BackgroundColor(backgroundColor);
    button.Text(text);
    button.TextColor(textColor);
    button.FontSize(textFontSize);
    button.FontTypeface(textTypeface);
  }

  @SimpleProperty(category = PropertyCategory.APPEARANCE)
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_COLOR, defaultValue = "&HFF6750A4")
  public void BackgroundColor(@IsColor int argb) {
    backgroundColor = argb;
    updateAppearance();
  }

  @SimpleProperty(category = PropertyCategory.APPEARANCE)
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_TEXT, defaultValue = "Click me!")
  public void Text(String text) {
    this.text = text;
    updateAppearance();
  }

  @SimpleProperty(category = PropertyCategory.APPEARANCE)
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_COLOR, defaultValue = Component.DEFAULT_VALUE_COLOR_WHITE)
  public void TextColor(@IsColor int argb) {
    textColor = argb;
    updateAppearance();
  }

  @SimpleProperty(category = PropertyCategory.APPEARANCE)
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_NON_NEGATIVE_FLOAT, defaultValue = "14.0")
  public void TextFontSize(float size) {
    textFontSize = size;
    updateAppearance();
  }

  @SimpleProperty(category = PropertyCategory.APPEARANCE)
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_TYPEFACE)
  public void TextFontFamily(String typeface) {
    textTypeface = typeface;
    updateAppearance();
  }
}

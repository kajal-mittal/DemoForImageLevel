# DemoForImageLevel

The default image is **unfilled_circle.png** with imageLevel 0. Setting the level value of the image with setImageLevel(int) will load the image with the next greater or equal value assigned to its max attribute. 
It can be defined in an XML file with the **<layer-list>** element. Drawable is defined in a  <item>. For example:
  ```
  <?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <bitmap android:src="@drawable/unfilled_circle" />
    </item>
    <item>
        <clip
            android:clipOrientation="vertical"
            android:drawable="@drawable/filled_circle"
            android:gravity="bottom" />
    </item>
</layer-list>
  ```
  

<p align="center">
<img src="https://user-images.githubusercontent.com/28338493/40975758-9c7a003e-68e9-11e8-860c-7f7ba82e8c87.png" width="400" height="700"/>
<img src="https://user-images.githubusercontent.com/28338493/40975759-9dafe446-68e9-11e8-9e93-d709c43aadfb.png" width="400" height="700"/>
</p>

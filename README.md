# PasscodeView                                      <img id="badge" src="https://jitpack.io/v/JobGetabu/PasscodeView.svg">

An Passcode view view for Android.
 

<div style="display:flex" >
 <img src="https://github.com/hanks-zyh/PasscodeView/raw/master/screenshot/demo1.png" width="220px" style="margin: 20px;">
 <img src="https://github.com/hanks-zyh/PasscodeView/blob/master/screenshot/demo2.png" width="220px" style="margin: 20px;">
 <img src="https://github.com/hanks-zyh/PasscodeView/raw/master/screenshot/demo.gif" width="220px" style="margin: 20px;">
</div>

## Add 

```gradle
dependencies {
    implementation 'com.github.JobGetabu:PasscodeView:0.1.3'
}
```

Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```

## Usage

```xml
<com.hanks.passcodeview.PasscodeView
    android:id="@+id/passcodeView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#222222"
    app:firstInputTip="Enter a passcode of 5 digits "
    app:correctStateColor="#71bb4d"
    app:wrongStateColor="#ea2b46"
    app:normalStateColor="#ffffff"
    app:numberTextColor="#222222"
    app:passcodeLength="5"
    app:passcodeViewType="set_passcode"/>
```



## License

```
Copyright 2017 hanks

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

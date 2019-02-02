# react-native-ringtone

## Getting started

`$ npm install react-native-ringtone --save`

### Mostly automatic installation

`$ react-native link react-native-ringtone`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNRingtonePackage;` to the imports at the top of the file
- Add `new RNRingtonePackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:

```
include ':react-native-ringtone'
project(':react-native-ringtone').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-ringtone/android')
```

3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:

```
	compile project(':react-native-ringtone')
```

## Usage

```javascript
import RNRingtone from 'react-native-ringtone';

// TODO: What to do with the module?
RNRingtone;
```

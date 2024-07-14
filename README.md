
# Styled Toast Library for Android


## Overview

#### Styled Toast Library is a customizable Android library that allows developers to easily create and display stylish toast messages. It offers predefined styles and the flexibility to position toasts at the top or bottom of the screen.


## Features

- #### Multiple predefined toast styles: Danger, Primary, Success, Violet, Warning


- #### Custom positioning: Top or bottom of the screen.

- #### Easy to integrate and use

- #### Enum-based style selection: Ensures type safety

  ## Installation

Install my-project by Gradle

To include the Styled Toast Library in your Android project, add the following dependency to your project's build.gradle file:

#### If you dowanload the library manually:

```
    implementation (project(":StyledToastLib"))

```
#### otherwise:

Step 1. Add it in your root build.gradle at the end of repositories:

```

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven {  url =  uri ("https://jitpack.io")' }
		}
	}
```
 Step 2. Add the dependency

```
    dependencies {
	        implementation ("com.github.NetanelBCN:ToastStyleLibrary:1.0.0")
	}
```

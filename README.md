# Dummy Graphical App
This project is just a very simple Java graphical application with absolutely no interest.

The goal is to use it in the discovery of the new Java 16 applications packager : [jpackage](https://openjdk.java.net/jeps/392)

## Official documentation
* [JPackage](https://docs.oracle.com/en/java/javase/16/jpackage/packaging-overview.html)
* [CLI](https://docs.oracle.com/en/java/javase/16/docs/specs/man/jpackage.html)

## Step 0 : Install the jpackage dependencies for your OS
* Debian Linux : fakeroot
* Red Hat Linux : rpm-build
* Windows : [Wix 3+](https://wixtoolset.org/releases/)
* MacOS : XCode for signed application and personalized icon for DMG format

## Step 1 : Simple packaging
* Package the application
```shell
mvn clean package
```
* Use _jpackage_ to package simply the application for your OS
* What is the native application package size ?
* Install your application as native application
* What does contain the installation folder ?

## Step 2 : Package with a lightweight JVM the application
* What are the used dependencies by the application ? (jdeps tool is your friend!)
* Create a minimal JVM for the application (jlink is your friend and --strip-debug --no-header-files --no-man-pages options too!)
* Regenerate the native application package without forgetting to increment the version
* What is the native application package size ?
* Install your application as native application
* Does the upgrade went well ?
* What does contain the installation folder ?

## Step 3 : Use Java modules in the application
* Uninstall the previous installed version of the application (it's always to try the uninstallation after all :)
* Add the correct module-info.java in the application
  Package the application
```shell
mvn clean package
```
* Use _jpackage_ to package simply the application for your OS
* Do you have an error ?
* Install your application as native application
* What does contain the installation folder ?

## Step 4 : Personalize the application name
* Add the option to change the application name
* Change also the version
* On Linux: change the generated package name
* Package the application
* Install your application as native application
* What does it change ?

## Step 5 : Add a description to the installation package
* Add the option to add a description
* Package the application
* Do you see your description ? (On Debian, dpkg --info is your friend!)

## Step 6 : Add an enterprise name
* Add the option to add an enterprise name
* Package the application
* Do you see your enterprise name ? (On Debian, dpkg --info is your friend!)

## Step 7 : Add a copyright
* Add the option to add a copyright
* Package the application
* Install the application
* Do you see the copyright ? (Have a look into the installation folder)

## Step 7 : Add a licence file to accept during installation
* Add the option to add a licence file
* Package the application
* Install the application
* Did you have a licence file to accept ?
* Does it work on Linux ?

## Step 8 : Change the default installation folder
* Add the option to change the default installation folder
* Package the application
* Install the application
* Did the installation folder change ?

## Step 9 : Let the Windows users choose their installation folder
* Add the option to allow Windows users to choose the installation folder
* Package the application
* Install the application
* Could you choose the installation folder ?

## Step 10 : Associate a file extension to the application
In our case, it's useless but anyway.
* Create the file configuring the file association
* Add the option to take into account this file association file
* Package the application
* Install the application

## Step 11 : Add a menu entry for the application
* Add the correct option depending on your OS
* Package the application
* Install the application

## Step 12 : Add a desktop shortcut
It doesn't normally work on MacOS :'(
* Choose an icon
* Add the correct option depending on your OS
* Package the application
* Install the application

## Step 13 : Advanced personalization of the generated package
jpackage uses dependant platform files and there is an option to tell it not to delete these files.
* Add the option to not delete the temporary files used by jpackage
* Have a look in the folder containing these files 
* Override the copyright file for example
* Add the option to take into account this overrode file
* Package the application
* Install the application
* Check the copyright file into the installation folder
# HelloScala
1.	Download Intellij IDEA (Either edition is fine)
2.	If you have settings from a previous version, import them
3.	Download the Scala Plugin
    * Click View from the navigation menu
    * Make sure ToolBar is checked
    * Click the Settings icon from the ToolBar menu (It’s a wrench)
    * Navigate to Plug-Ins menu
    * Click Browse repositories
    * Search and Install “Scala” plugin
    * Search and Install “SBT” plugin (Small Build Tool)
    * Restart InteilliJ
4. Start a new Project
    * Navigate to File in the navigation menu
    * Hover over New and Click Project from the sub-menu
    * Click Scala
    * Choose sbt from the sub-menu (probably the default) and click [Next]
    * Name your project and click [Finish]

### Warning: - The default release for sbt is the latest. If their latest release has bugs, you may need to start a new project with an older version.

5.	Verify your project files structures looks something like this:
    * ProjectName
      * project
      * src
        * main
        * test
    * build.sbt
6.	Compile build.sbt (Scala config file) and then verify your project now has a target folder with compiled object files inside of it:
    * ProjectName
      * project
        * target
      * src
        * main
        * test
    * build.sbt

### REST-POINT: If you’ve gone this far, realize that you have just created the skeleton for a Scala project in intelliJ with SBT. The project already includes a main and test folder. The rest of these instructions assume TDD. So we will start with coding the tests first.

7. For testing, reference the standard Scala test framework by adding it to your build.sbt. This library comes with it.
```a.	
name := “sample1”

version := “1.0”

scalaVersion := “2.12.4”

libraryDependencies ++= Seq(

“org.scalatest” %% “scalatest” % “3.0.4”

)
```
8. Reload the project by navigating to the sbt tab on the right and clicking the reload symbol (You have to reload your project every time you make a change to your sbt file)
9. Add Scala test packages 
    * Right-Click the Scala folder in the test directory and select New - Package
    * Name it helloScala
    * Right-Click the new package and add another package. Name it Unit
10)	Right-Click helloScala.unit package and add a new Scala class named “helloScalaTest”
11)	Initialize the new Scala class
    * Make “ExampleSpec” extend FlatSpec with Matchers
    * Create some test stubs
12)	Initialize the project with a Scala object
    * Right-Click the scala folder in the main directory and select new  package
    * Name it helloScala
    * Right-Click the new package and add a new Scala Class but change the type to Object
    * Name it HelloWorld
13)	 Implement the Scala object so that your tests will pass
14)	Push the project to github
    * Create a new repository in github without a readme
    * Initialize git in project folder “git init”
    * Make a change and compile your code so that it will detect changes
    * Stage all files - “git add .” 
    * Commit all files “git commit -m ‘commit message’”
    * Add remote repo to your repository: “git remote add origin ‘github url’ “
    * Initialize remote repo by pushing to your remote branch: “git remote add origin”

# Reference
https://www.youtube.com/watch?v=6sBadc69UtM
